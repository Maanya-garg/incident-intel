# Day 23 — Ownership checks and Testcontainers with a pgvector image

**Week 4** · **Phase P3: Projects, safe upload and parsing** · **Blueprint:** Phases 3 and 4

**Planned:** 6 h (Learn 2.5 · Build and test 3 · Document 0.5) · **Suggested date:** 2026-11-12 (Thu). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
Other users' projects return 404, and integration tests run against a real Postgres (with pgvector) in Docker.

## ❓ Why this matters for the project
Blueprint section 9: every access has an ownership check and returns 404, not 403. The blueprint also says H2 is not good enough, so we test on real Postgres.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| IDOR / broken access control | OWASP Top 10: Broken Access Control; OWASP Cheat Sheet: IDOR Prevention | Understand 'guessing someone else's id'. |
| Testcontainers for Postgres | testcontainers.com guides: Getting started with Testcontainers for Java; Spring Boot `@ServiceConnection` | Use the `pgvector/pgvector` image, declared as a compatible substitute for `postgres`. |
| Why H2 is the wrong test DB here | pgvector README (no H2 support) and the blueprint section 13 | You use pgvector types and window functions. |

## 🔨 Build / do
- [ ] Implement the rule in the service layer: query by `id AND owner_id`. Missing or not-yours both return 404.
- [ ] Add a shared Testcontainers base class (static container, reused across tests).
- [ ] Write tests: user A cannot read user B's project (404); Flyway migrations apply to a fresh database; repository queries work.
- [ ] If Docker is slow on your machine, keep the container static and reuse it across test classes.

## ✅ Check yourself (answer in your own words in the notes below)
1. Why 404 and not 403 for someone else's project?
2. What is Testcontainers solving that H2 cannot?
3. What goes wrong if you check ownership only in the UI?

## 🎤 Interview question this prepares
What is IDOR and how did you prevent it?

## 🏁 Definition of done
- [ ] The access-control test passes
- [ ] Tests run against Postgres in Docker
- [ ] Security notes updated
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`test(backend): ownership checks and testcontainers integration tests`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-23)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
