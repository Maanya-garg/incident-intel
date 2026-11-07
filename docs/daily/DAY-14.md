# Day 14 — Weekly review 2 and buffer

**Week 2** · **Phase P1: Environment and skeleton (Docker, SQL, design docs)** · **Blueprint:** Phase 1: Skeleton

**Planned:** 4 h (Review and fix 2.5 · Weekly extras and practice 1 · Document 0.5) 

**Status:** done

> 🏷️ **Milestone:** at the end of today, tag `v0.1-skeleton` (`git tag v0.1-skeleton && git push --tags`).

## 🎯 Goal for today
Make sure Docker and SQL are solid, because every later phase depends on them.

## ❓ Why this matters for the project
If `docker compose up` or a simple JOIN still feels shaky, fix it now. It costs a day now or a week later.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| Self-quiz | Your notes | Redo wrong answers. |

## 🔨 Build / do
- [✓] Delete your local containers and volumes, then bring the stack up again from the compose file alone.
- [✓] Rewrite 5 SQL queries from memory (join, group by, null ordering, transaction, explain).
- [✓] **Weekly extra 1 (30 min), practise outside the project:** Exercism Java track: 2 to 3 easy exercises.
- [✓] **Weekly extra 2 (20 min), read other people's code:** the docker-compose.yml of any popular open-source project: find the services, volumes and healthchecks.
- [✓] **Weekly extra 3 (10 min), explain it out loud:** record a voice note (or talk to a rubber duck) explaining this week's work from memory. Wherever you stumble, you have not understood it yet.

## 🏁 Definition of done
- [✓] Tag pushed
- [✓] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`docs: weekly review 2`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-14)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** 7-11-26 &nbsp;&nbsp; **Actual hours:** 2 &nbsp;&nbsp; **Plan followed?** yes 

### What I learned (explain it as if to a friend, in my own words)
- I deleted everything with `docker compose down -v` (container, network and
  the volume `incident-intel_pgdata`) and started again with only
  `docker compose up -d`. Compose created a new volume and a new database
  `incident_intel` from `.env` alone, so my compose file and `.env` are enough
  to rebuild the stack. The `playground` and `sqlplay` databases were gone
  after that, because their data lived in the deleted volume.
- Before deleting, I made a backup of `sqlplay` with `pg_dump`
  (`--exclude-table-data=scratch_logs`, so the 200,000 fake rows are not
  inside, only the table structure). The backup file is
  `playground/sqlplay_backup.sql` and it stays on my computer only, because
  `playground/` is in `.git/info/exclude`. I checked that it has 4
  `CREATE TABLE` lines.
- A backup is only useful if it can be restored. I have not restored it yet.
- `docker volume ls` also shows three volumes with long hex names. They are
  not `pgdata`, and I left them alone.
  
### What confused me / still unclear
- Nothing today
  
### What broke and how I fixed it (error message, cause, fix)
- Nothing broke today.

### Commits and links
- Tag v0.1-skeleton: (add the commit hash after the tag is pushed)

### First step for tomorrow
- Day 15: Spring Boot 1, project skeleton, dependency injection, REST,
  Swagger. First `git pull`, then start.
