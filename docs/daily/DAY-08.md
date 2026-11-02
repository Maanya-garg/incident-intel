# Day 08 — Docker 1: images, containers, ports, volumes

**Week 2** · **Phase P1: Environment and skeleton (Docker, SQL, design docs)** 

**Planned:** 5 h (Learn 2.5 · Build and test 2 · Document 0.5)

**Status:** ✅ 

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
- [✓] Run `docker run hello-world`.
- [✓] Run Postgres with the pgvector image: `docker run -d --name pg -e POSTGRES_PASSWORD=dev -p 5432:5432 pgvector/pgvector:pgNN` (check Docker Hub for a current `pgNN` tag).
- [✓] Open a SQL shell: `docker exec -it pg psql -U postgres`. Run `CREATE TABLE t(id int); INSERT INTO t VALUES (1); SELECT * FROM t;`.
- [✓] Stop and remove the container, start a new one, and see that the table is gone. Write down why.
- [✓] Learn the 8 commands you will use: `ps`, `logs`, `exec`, `stop`, `rm`, `images`, `pull`, `run`.

## 🏁 Definition of done
- [✓] You saw the data-loss demo yourself
- [✓] You can list the 8 commands and what they do
- [✓] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`docs: docker basics notes`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-08)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** 28-10-26 &nbsp;&nbsp; **Actual hours:** 4 &nbsp;&nbsp; **Plan followed?** yes 

### What I learned (explain it as if to a friend, in my own words)
An image is a read-only package (program plus everything it needs) and a container is a running copy made from it. I ran `hello-world` and saw Docker pull the image, create a container, print its message and exit (`Exited (0)`). Then I ran Postgres with the pgvector image (`pgvector/pgvector:pg17`) using `docker run -d --name pg -e POSTGRES_PASSWORD=dev -p 127.0.0.1:5432:5432 ...`, opened `psql` with `docker exec -it pg psql -U postgres`, created a table and inserted a row. `docker stop` followed by `docker start` kept the table, because stop only halts the container and its storage stays. `docker rm` followed by a new `docker run` lost the table, because the new container is built fresh from the image, which never contained my table. A named volume (Day 9) is what keeps data across removal. I also bound the port to `127.0.0.1` so the database is reachable only from my own computer, not from the whole network, since the password is weak.

### What confused me / still unclear
I did not read the planned Docker documentation, I learned by doing the commands with guidance. The data folder of an official Postgres image is an anonymous volume, so after `docker rm` the old volume stays behind unused and the new container gets a new one; I will clean these up after Day 9. I chose Postgres 17 over 18 because Postgres 18 moved the data directory path; the final version will be decided in an ADR on Day 13.

### What broke and how I fixed it (error message, cause, fix)
- **`Docker Desktop is unable to start` / `The Windows Subsystem for Linux is not installed`.** Cause: Docker Desktop needs WSL 2 and WSL was not installed. Fix: installed WSL from an Administrator PowerShell (`wsl --install --no-distribution`) and restarted, after which `docker info` showed the server and `wsl --list --verbose` showed `docker-desktop` running on version 2. <edit if you used --web-download or another fix>
- **`wsl.exe --install`: `The requested operation requires elevation` and `Forbidden (403)`.** Cause: the command was run in a normal window, not as Administrator. Fix: run it in an Administrator window.
- **`Error response from daemon: container ... is not running` and status `Exited (255)`.** Cause: the `pg` container had stopped when Docker Desktop was closed or the computer was shut down; containers do not restart by themselves. Fix: `docker start pg`. (A `restart` policy in Compose will handle this on Day 9.)

### Commits and links
- Notes commit for Day 8 (hash from `git log --oneline`)
  
### First step for tomorrow
Day 9: write `docker-compose.yml` with Postgres, a named volume `pgdata` and a healthcheck, plus `.env.example`.
