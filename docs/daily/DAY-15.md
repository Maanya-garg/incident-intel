# Day 15 — Spring Boot 1: project skeleton, dependency injection, REST, Swagger

**Week 3** · **Phase P2: Spring Boot and authentication** · **Blueprint:** Phase 2: Auth

**Planned:** 5 h (Learn 3 · Build and test 1.5 · Document 0.5) · **Suggested date:** 2026-11-04 (Wed). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
A Spring Boot app starts, connects to Postgres through Compose, answers `GET /api/health`, and shows Swagger UI.

## ❓ Why this matters for the project
Spring Boot is the brain of the system: auth, uploads, parsing, grouping, detection, timeline, verification, orchestration and all DB access.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| Inversion of control, dependency injection, beans | spring.io/guides 'Building a RESTful Web Service' and the Spring Framework reference intro (IoC container) | Learn the idea, not every annotation. |
| Controllers, request mapping, `application.yml`, profiles | spring.io/guides | Skip Thymeleaf and server-side rendering. |
| Maven wrapper and project layout | start.spring.io (generate project) | Use current stable Spring Boot and the Java LTS you installed. Pin the versions in `pom.xml`. |

## 🔨 Build / do
- [ ] Go to start.spring.io: Maven, Java, current stable Spring Boot. Dependencies: Spring Web, Validation, Spring Data JPA, PostgreSQL Driver, Flyway Migration, Spring Security, Actuator. Skip Lombok (it hides code you need to learn).
- [ ] Put the project in `backend/`. Run `./mvnw spring-boot:run`.
- [ ] Add `GET /api/health` returning `{"status":"ok"}` using a record.
- [ ] Add springdoc-openapi (pick the version that matches your Spring Boot major version) and open Swagger UI.
- [ ] Connect to the Compose Postgres through environment variables (not hard-coded).

## ✅ Check yourself (answer in your own words in the notes below)
1. What is dependency injection and what problem does it solve?
2. What is a bean?
3. What is the difference between `@RestController` and `@Controller`?
4. Where does Spring read configuration from and how do env vars override it?

## 🎤 Interview question this prepares
What is dependency injection? Give a concrete example from your project.

## 🏁 Definition of done
- [ ] App starts and `/api/health` works
- [ ] Swagger UI opens
- [ ] DB credentials come from env vars
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`feat(backend): spring boot skeleton with health endpoint and swagger`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-15)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
