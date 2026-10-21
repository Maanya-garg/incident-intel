# Day 46 — Embeddings and FastAPI: the `/embed` endpoint

**Week 7** · **Phase P7: Embeddings, pgvector, retrieval and evidence** · **Blueprint:** Phases 9, 10 and 11

**Planned:** 6 h (Learn 3 · Build and test 2.5 · Document 0.5) · **Suggested date:** 2026-12-05 (Sat). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
A FastAPI service embeds text with Sentence Transformers and is protected by a shared internal secret.

## ❓ Why this matters for the project
Keyword search cannot find 'DB connection timeout' from 'Unable to connect to database'. Embeddings can. Only Python has the ecosystem, so it lives in a separate service.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| Vectors, cosine similarity, what embeddings capture and do not | Sentence Transformers docs (sbert.net) quickstart; optionally 3Blue1Brown 'Essence of linear algebra', the dot product video | Intuition only: similar meaning gives nearby vectors. |
| FastAPI: path operations, Pydantic models, dependencies, lifespan | fastapi.tiangolo.com/tutorial (First Steps, Request Body, Response Model, Dependencies) and the Lifespan Events page | Skip OAuth and background tasks for now. |
| Pydantic models | docs.pydantic.dev Concepts: Models | Validation is the whole reason it is here. |

## 🔨 Build / do
- [ ] In `ai-service/` create a venv, install FastAPI, uvicorn, sentence-transformers, pytest.
- [ ] Load the model once at startup (lifespan). Verify the exact model name and its vector size yourself by encoding a sample and printing the length (the blueprint says verify; a 384-dimension MiniLM-class model is typical).
- [ ] `GET /health` and `POST /embed` (text to vector). Require an `X-Internal-Secret` header from an environment variable.
- [ ] pytest with FastAPI `TestClient`: valid call, missing or wrong secret (rejected), empty text.

## ✅ Check yourself (answer in your own words in the notes below)
1. Why load the model at startup and not per request?
2. What does cosine similarity measure?
3. Why does the AI service require a shared secret even on an internal network?

## 🎤 Interview question this prepares
What is an embedding and why use it instead of keyword search?

## 🏁 Definition of done
- [ ] `/embed` returns a vector of the length you verified
- [ ] Tests pass
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`feat(ai-service): fastapi with embed endpoint and internal secret`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-46)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
