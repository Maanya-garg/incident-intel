# Day 09 — Docker 2: Compose, named volumes, env files, healthchecks

**Week 2** · **Phase P1: Environment and skeleton (Docker, SQL, design docs)** · **Blueprint:** Phase 1: Skeleton

**Planned:** 4 h (Learn 2 · Build and test 1.5 · Document 0.5) · **Suggested date:** 2026-10-29 (Thu). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

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
- [ ] Write `docker-compose.yml` with a `postgres` service using the pgvector image, a named volume `pgdata`, env from `.env`, and a `pg_isready` healthcheck.
- [ ] Create `.env.example` with placeholders and add `.env` to `.gitignore`.
- [ ] `docker compose up -d`, create a table, `docker compose down`, `docker compose up -d` again and confirm the table is still there.
- [ ] Run `docker compose down -v` and confirm the data is now gone. Write when you would use each form.

## ✅ Check yourself (answer in your own words in the notes below)
1. What is a named volume and where does Docker keep it?
2. What does `docker compose down -v` do that `down` alone does not?
3. Why do we commit `.env.example` but not `.env`?
4. What does a healthcheck add?
5. What is the difference between `restart` and recreating a container?

## 🏁 Definition of done
- [ ] Data survives `down` and `up`
- [ ] `.env` is ignored by Git
- [ ] All five check questions answered in your notes
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`feat(infra): compose with postgres+pgvector and named volume`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-09)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
