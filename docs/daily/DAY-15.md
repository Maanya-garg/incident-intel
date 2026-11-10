# Day 15 — Spring Boot 1: project skeleton, dependency injection, REST, Swagger

**Week 3** · **Phase P2: Spring Boot and authentication** · **Blueprint:** Phase 2: Auth

**Planned:** 5 h (Learn 3 · Build and test 1.5 · Document 0.5) 

**Status:** ✅ 

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
- [✓] Go to start.spring.io: Maven, Java, current stable Spring Boot. Dependencies: Spring Web, Validation, Spring Data JPA, PostgreSQL Driver, Flyway Migration, Spring Security, Actuator. Skip Lombok (it hides code you need to learn).
- [✓] Put the project in `backend/`. Run `./mvnw spring-boot:run`.
- [✓] Add `GET /api/health` returning `{"status":"ok"}` using a record.
- [✓] Add springdoc-openapi (pick the version that matches your Spring Boot major version) and open Swagger UI.
- [✓] Connect to the Compose Postgres through environment variables (not hard-coded).

## 🎤 Interview question this prepares
What is dependency injection? Give a concrete example from your project.

## 🏁 Definition of done
- [✓] App starts and `/api/health` works
- [✓] Swagger UI opens
- [✓] DB credentials come from env vars
- [✓] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`feat(backend): spring boot skeleton with health endpoint and swagger`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-15)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** 8-11-26 &nbsp;&nbsp; **Actual hours:** 4 &nbsp;&nbsp; **Plan followed?** yes 

### What I learned (explain it as if to a friend, in my own words)
I generated the backend on start.spring.io (Maven, Java 21, Spring Boot 4.1.2) with Spring Web, Validation, Spring Data JPA, the PostgreSQL driver, Flyway, Spring Security and Actuator, and no Lombok, so I can see all the code. I chose 4.1 over 4.0 because 4.0 loses free support on 31 December 2026, and over 4.2 because that was still a release candidate. In Spring Boot 4 the web starter is named `spring-boot-starter-webmvc` and Flyway has its own starter. I connected the app to the Compose Postgres through `application.yml` with `${POSTGRES_USER}`, `${POSTGRES_PASSWORD}` and `${POSTGRES_DB}` read from environment variables, so no secret is in the code, and with `ddl-auto: validate` so tables will come only from my own Flyway migrations. `GET /api/health` is a `@RestController` returning a record, which Spring turns into `{"status":"ok"}`. I never called `new` on the controller: Spring created it as a bean (inversion of control). Spring Security locks every endpoint by default, so `/api/health` returned 401 until I added a temporary `SecurityFilterChain` that opens only health and Swagger and keeps `anyRequest().authenticated()` for everything else; even a path that does not exist returns 401 because security runs before the controller. springdoc (version 3.1.0, matching Boot 4.1) builds `/v3/api-docs` from the controllers and serves Swagger UI.

### What confused me / still unclear
I did not read the planned Spring guides; I learned by building with guidance. The default Spring Security setup also hands out a `JSESSIONID` cookie, which the final stateless JWT design (ADR 0002, Day 18) will remove. The temporary `SecurityConfig` is not production-ready (no CSRF, CORS or JWT yet), and Swagger UI is public for now, which must be restricted outside development.

### What broke and how I fixed it (error message, cause, fix)
### What broke and how I fixed it (error message, cause, fix)
- `Connection refused` on `localhost:5432` after a restart. Cause: the Postgres container had stopped (containers do not restart by themselves). Fix: `docker compose up -d` and wait for `healthy`.
- `FATAL: password authentication failed for user "${POSTGRES_USER}"` (the placeholder itself was sent as the user name). Cause: the `.env` variables were not loaded in that PowerShell window, and Spring leaves an unresolved placeholder in a datasource setting as plain text instead of stopping at startup, so the failure only shows when it connects. Fix: load `.env` into the session (from the repo root, where `.env` is) and run again.
- `Cannot find path ...\backend\.env`. Cause: I ran the load command from `backend/`, but `.env` lives in the repo root. Fix: `cd ..` first.
- `GET /api/health` returned 401. Cause: Spring Security protects every endpoint by default. Fix: a temporary `SecurityFilterChain` that permits only the health and Swagger paths.
- <only if it happened: `HealthController.java` was empty or unsaved, so the controller did not exist; fix: pasted the code again and
  
### Commits and links
- Commit for the backend skeleton (hash from `git log --oneline`)
- Notes commit for Day 15
  
### First step for tomorrow
Day 16: JPA, Hibernate and Flyway, with a hand-written migration that creates the `users` table.
