# Day 08 — Docker 1: images, containers, ports, volumes

**Week 2** · **Phase P1: Environment and skeleton (Docker, SQL, design docs)** · **Blueprint:** Phase 1: Skeleton

**Planned:** 5 h (Learn 2.5 · Build and test 2 · Document 0.5) · **Suggested date:** 2026-10-28 (Wed). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
You can run a Postgres container, connect with psql, and see why data disappears without a volume.

## ❓ Why this matters for the project
The whole project runs with `docker compose up`, and the database (Postgres with pgvector) will always run in Docker. You need this before touching SQL or Spring Boot.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| Image vs container, layers, registry, ports, env vars, volumes | docs.docker.com/get-started (the overview and the first 'run a container' parts) | Skip Swarm, Kubernetes and the paid features. |
| Install Docker Desktop (or Docker Engine on Linux) | docs.docker.com/get-docker | Windows: use the WSL2 backend. |

## 🔨 Build / do
- [ ] Run `docker run hello-world`.
- [ ] Run Postgres with the pgvector image: `docker run -d --name pg -e POSTGRES_PASSWORD=dev -p 5432:5432 pgvector/pgvector:pgNN` (check Docker Hub for a current `pgNN` tag).
- [ ] Open a SQL shell: `docker exec -it pg psql -U postgres`. Run `CREATE TABLE t(id int); INSERT INTO t VALUES (1); SELECT * FROM t;`.
- [ ] Stop and remove the container, start a new one, and see that the table is gone. Write down why.
- [ ] Learn the 8 commands you will use: `ps`, `logs`, `exec`, `stop`, `rm`, `images`, `pull`, `run`.

## ✅ Check yourself (answer in your own words in the notes below)
1. What is the difference between an image and a container?
2. What does `-p 5432:5432` mean (which side is host, which is container)?
3. Why did your table disappear?
4. What does `docker exec` do?

## 🏁 Definition of done
- [ ] You saw the data-loss demo yourself
- [ ] You can list the 8 commands and what they do
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`docs: docker basics notes`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-08)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
