# 1. Spring Boot owns data and logic, FastAPI owns ML

Date: 2026-11-07
Status: accepted

## Context

The system needs deterministic, testable logic (auth, ownership checks, parsing, grouping, incident detection, timeline, evidence selection, verification, feedback, all database transactions) and also needs the Python ML ecosystem (Sentence Transformers for embeddings, LLM calls, prompt assembly, schema validation of model output).

## Decision

Split the system in two services:

- **Spring Boot backend** owns all data and logic: authentication and authorization, projects, uploads, parsing, grouping, incident detection, timeline, evidence selection, evidence verification, feedback, orchestration and every database transaction.
- **FastAPI AI service** does only what needs Python ML: embedding generation, LLM calls, prompt assembly, and output parsing and validation. It is stateless, has no direct database access, and never owns data or authorization.

Rule of thumb: deterministic, testable logic lives in Spring Boot. Anything that needs the Python ML ecosystem lives in FastAPI.

The FastAPI service is reachable only on the internal Docker network and is authenticated with a shared internal secret from an environment variable. Spring Boot treats every response from it as untrusted.

## Alternatives considered 

- Everything in Spring Boot: the ML libraries and model tooling are mostly Python, so embeddings and LLM handling would be harder to build and to try out.
- Everything in Python: the deterministic pipeline (parsing, clustering, verification) is easier to unit test and tune in Java, and the backend skills in this project are Java and Spring.
- Let the AI service read the database: it would then need its own authorization, and a prompt-injection problem in the model layer could reach data.

## Consequences

Easier:
- The AI service can be replaced or restarted without touching data or authorization.
- Security stays in one place: ownership checks happen only in Spring Boot, and the model has no tools and no side effects.
- Deterministic parts are testable with JUnit without a model.

Harder:
- Two services to run, test and deploy; Docker Compose starts both.
- A network call between them that can fail, so the backend needs clear errors when the AI service or the LLM is unavailable.
- Output is validated twice (Pydantic in FastAPI, then again in Spring Boot).