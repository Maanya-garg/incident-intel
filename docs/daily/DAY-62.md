# Day 62 — Dockerfiles and the full Compose stack

**Week 9** · **Phase P11: Docker, full stack and CI** · **Blueprint:** Phase 16

**Planned:** 6 h (Learn 2.5 · Build and test 3 · Document 0.5) · **Suggested date:** 2026-12-21 (Mon). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
`docker compose up` from a fresh clone starts frontend, backend, AI service, Postgres and Redis.

## ❓ Why this matters for the project
This is the blueprint's definition-of-done requirement: one command runs everything.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| Multi-stage Docker builds | docs.docker.com: Multi-stage builds | Build with the full JDK or Node, run with a slim image. |
| Compose networking and healthchecks | docs.docker.com/compose: Networking, `depends_on` with `condition: service_healthy` | The AI service must be reachable only on the internal network. |

## 🔨 Build / do
- [ ] Dockerfiles for backend, ai-service and frontend. Run as a non-root user where practical.
- [ ] Compose: all services, `.env` for settings, named volumes (database, uploads, model cache), internal network, AI service not published to the host.
- [ ] Ollama: decide how the AI service reaches it (host install via `host.docker.internal` is simplest; on Linux add the host gateway mapping) and document it.
- [ ] Cache the embedding model in a volume so it is not re-downloaded on every start.
- [ ] Test from a clean directory with only `.env.example` copied to `.env`.

## ✅ Check yourself (answer in your own words in the notes below)
1. Why is the AI service not exposed to the host?
2. What does a multi-stage build save you?
3. What would break if the model were not cached in a volume?

## 🏁 Definition of done
- [ ] A fresh clone starts everything with one command
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`feat(infra): dockerfiles and full compose stack`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-62)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
