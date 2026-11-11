# Day 16 — JPA, Hibernate and Flyway: the users table

**Week 3** · **Phase P2: Spring Boot and authentication** · **Blueprint:** Phase 2: Auth

**Planned:** 5 h (Learn 2.5 · Build and test 2 · Document 0.5) 

**Status:** ✅ 

## 🎯 Goal for today
A hand-written Flyway migration creates `users`, and a JPA entity and repository can save and find a user.

## ❓ Why this matters for the project
The blueprint wants SQL you write and review yourself, so schema comes from Flyway migrations. JPA only maps rows to objects, it never creates tables.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| ORM idea, entity, repository | spring.io/guides 'Accessing Data with JPA' | Skip Specifications and QueryDSL. |
| Flyway migrations: naming and ordering | Flyway documentation (Redgate) 'Migrations' and the Spring Boot Flyway section | Never edit an applied migration. Add a new one. |
| `ddl-auto: validate` | Spring Boot docs: Database Initialization | Why `update` or `create` are dangerous. |

## 🔨 Build / do
- [✓] Write `V1__create_users.sql` exactly from blueprint section 7: id, email UNIQUE NOT NULL, password_hash, created_at.
- [✓] Create entity `User` and `UserRepository` (extends JpaRepository). Add `findByEmail`.
- [✓] Set `spring.jpa.hibernate.ddl-auto=validate`. Start the app and see Flyway apply the migration.
- [✓] Write a repository test (use whatever works now, we switch to Testcontainers on Day 23) that saves and finds a user.

## 🏁 Definition of done
- [✓] Flyway ran `V1` and created the table
- [✓] Repository test passes
- [✓] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`feat(backend): flyway V1 users table and user repository`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-16)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** 9-11-26 &nbsp;&nbsp; **Actual hours:** 3 &nbsp;&nbsp; **Plan followed?** yes

### What I learned (explain it as if to a friend, in my own words)
- An entity (`User`) is a Java class mapped to the `users` table. A repository
  (`UserRepository`) is an interface: I only write method names such as
  `findByEmail`, and Spring Data builds the code. JPA maps rows to objects, it
  does not create the table.
- The table comes from a hand-written Flyway migration,
  `V1__create_users.sql` in `backend/src/main/resources/db/migration`
  (V + version + two underscores + description). Flyway runs migrations in
  version order at app start and records them in `flyway_schema_history`. An
  applied migration must never be edited, a change needs a new one (V2).
- The blueprint (section 7) only lists the column names of `users`, not their
  types, so I chose them: `id BIGINT` identity primary key, `email TEXT NOT NULL
  UNIQUE`, `password_hash TEXT NOT NULL`, `created_at TIMESTAMPTZ NOT NULL
  DEFAULT now()`.
- `ddl-auto: validate` only checks that entity and table match and stops the
  app if they do not. That is why the migration comes before the entity.
- The repository test uses `@SpringBootTest` (full app, so Flyway and validate
  run) and `@Transactional` (each test is rolled back, so no test users stay in
  the database). It runs against the Compose Postgres. Testcontainers comes on
  Day 23.
- Two tests: save and find by email, and a duplicate email that the database
  rejects (the UNIQUE rule), shown by a DataIntegrityViolationException.
- Result: Tests run: __ (add the line from Maven), `flyway_schema_history`
  shows version 1 `create users`, and `count(*)` on `users` is 0 after the test.
  
### What confused me / still unclear
- VS Code showed red underlines on `User` and `findByEmail`, but Maven's
  `test-compile` said BUILD SUCCESS. (write what you think about this)
- UNIQUE on email is case-sensitive, so `A@x.com` and `a@x.com` would be two
  users. The blueprint does not cover this. I will decide on Day 17.

### What broke and how I fixed it (error message, cause, fix)
- Docker Desktop: "Docker Engine stopped unexpectedly", WSL `CommandTimedOut`
  on `wsl --version`. Cause: WSL did not answer in time. Fix: (write what you
  did, for example quit Docker Desktop, `wsl --shutdown`, start Docker again).
- Editor errors vs Maven: the red lines in VS Code were only the editor's
  view. I checked with `.\mvnw.cmd test-compile`, which gave BUILD SUCCESS.
  Lesson: Maven's result is the real one.

### Commits and links
- Commit message: feat(backend): flyway V1 users table and user repository
  
### First step for tomorrow
- Day 17: Registration with layering, DTOs, validation and BCrypt. Start with
  `git pull --ff-only`.
