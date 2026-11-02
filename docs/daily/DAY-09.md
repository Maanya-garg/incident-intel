# Day 09 — Docker 2: Compose, named volumes, env files, healthchecks

**Week 2** · **Phase P1: Environment and skeleton (Docker, SQL, design docs)**

**Planned:** 4 h (Learn 2 · Build and test 1.5 · Document 0.5) · 

**Status:** ✅ 

## 🎯 Goal for today
A `docker-compose.yml` starts Postgres with pgvector and a named volume, and data survives restarts.

## ❓ Why this matters for the project
This is the first real file of the project infrastructure. It also covers the five Docker check questions and the Postgres volume exercise from the blueprint.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| Compose file structure: services, ports, volumes, environment, healthcheck | docs.docker.com/compose (Compose file reference, only the keys you use) | Skip `build` and networks for now. |
| .env files and why secrets stay out of Git | Docker Compose docs: environment variables | Only: `.env` is read automatically, `.env.example` is committed. |

## 🔨 Build / do
- [✓] Write `docker-compose.yml` with a `postgres` service using the pgvector image, a named volume `pgdata`, env from `.env`, and a `pg_isready` healthcheck.
- [✓] Create `.env.example` with placeholders and add `.env` to `.gitignore`.
- [✓] `docker compose up -d`, create a table, `docker compose down`, `docker compose up -d` again and confirm the table is still there.
- [✓] Run `docker compose down -v` and confirm the data is now gone. Write when you would use each form.

## 🏁 Definition of done
- [✓] Data survives `down` and `up`
- [✓] `.env` is ignored by Git
- [✓] All five check questions answered in your notes
- [✓] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`feat(infra): compose with postgres+pgvector and named volume`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-09)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** 29-10-26 &nbsp;&nbsp; **Actual hours:** 4 &nbsp;&nbsp; **Plan followed?** yes 

### What I learned (explain it as if to a friend, in my own words)
Docker Compose allows multiple Docker configurations to be managed using a single docker-compose.yml file. We use it to run PostgreSQL with pgvector, configure ports and environment variables, and attach a named volume.
A named volume stores database data separately from the container, so the data remains after docker compose down. .env stores local configuration and secrets, while .env.example contains safe placeholders and can be committed to Git.
A healthcheck checks whether the PostgreSQL service is actually ready to accept connections.

### What confused me / still unclear
Difference between docker compose down and docker compose down -v.
Difference between restarting and recreating a container.

### What broke and how I fixed it (error message, cause, fix)
Error: `'Set-Content' is not recognized as an internal or external command`.
  Cause: I was in Command Prompt (cmd), but the command was for PowerShell.
  Fix: used cmd commands instead: `(echo ...& echo ...) > .env`.
- Error: `git push` rejected, `main -> main (fetch first)`.
  Cause: GitHub has a commit that my computer does not have.
  Status: (write here how you solved it, or "still open, TODO(day-09)")
  
### Commits and links
Commit: feat(infra): compose with postgres+pgvector and named volume

### First step for tomorrow
Day 10: SQL 1, create tables and use INSERT, SELECT, WHERE in psql,
  using the Postgres container from today.
