# Day 13 — Phase 1: repo skeleton and the three design docs

**Week 2** · **Phase P1: Environment and skeleton (Docker, SQL, design docs)** 

**Planned:** 5 h (Learn 1.5 · Build and test 3 · Document 0.5) 

**Status:** ✅ 

## 🎯 Goal for today
The repo follows the blueprint layout, Compose runs Postgres, and the three design docs exist.

## ❓ Why this matters for the project
The blueprint rule is 'no component is built until its metric and gold fields are written down'. These docs are the contract the rest of the project follows.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| Architecture Decision Records (ADR) | Michael Nygard, 'Documenting Architecture Decisions' (short blog post) | 20 min. One page per decision, never longer. |
| Blueprint sections 5.10, 6 and 12 | The blueprint PDF | Re-read slowly. Copy only what you need. |

## 🔨 Build / do
- [✓] Check that the blueprint folders from section 16 exist (the starter already created them): `frontend/ backend/ ai-service/ datagen/ eval/ docs/ docs/decisions/ .github/workflows/`. Read each one-line README and understand what will go there.
- [✓] Write `docs/analysis-contract.md`: the JSON output contract (schema_version 1.0) and the rules (cite only given refs, INSUFFICIENT_EVIDENCE allowed, causal language only if the logs state causation, logs are data).
- [✓] Write `docs/terminology.md`: the Use/Avoid table from blueprint section 6.
- [✓] Write `docs/evaluation-spec.md` v0: the component table (metric, gold needed, pitfall). Leave details for later phases.
- [✓] Write `docs/decisions/0001-service-split.md`: why Spring Boot owns data and FastAPI owns ML.

## 🎤 Interview question this prepares
Why did you split your system into Spring Boot and a Python AI service?

## 🏁 Definition of done
- [✓] Three design docs and ADR 0001 committed
- [✓] `docker compose up` still works
- [✓] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`docs: analysis contract, terminology, evaluation spec v0, ADR 0001`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-13)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** 6-11-26 &nbsp;&nbsp; **Actual hours:** 4 &nbsp;&nbsp; **Plan followed?** yes 

### What I learned (explain it as if to a friend, in my own words)
- I wrote four documents in VS Code: `docs/analysis-contract.md` (the JSON
  output contract and its rules), `docs/terminology.md` (which words to use
  and which to avoid), `docs/evaluation-spec.md` v0 (the component table) and
  `docs/decisions/0001-service-split.md` (ADR 0001: why Spring Boot owns the
  data and FastAPI owns the ML).
- The rule behind these docs: no component is built until its metric and
  gold fields are written down. The docs are the contract for later phases.
- I changed the Postgres port in `docker-compose.yml` from "5432:5432" to
  "127.0.0.1:5432:5432". Without an IP, Docker opens the port on all network
  interfaces (0.0.0.0), so other computers on the same network could try to
  reach the database. With 127.0.0.1 only my own computer can.
- After the change, `docker compose config` showed no error, and
  `docker compose up -d` gave a healthy container with the port on
  127.0.0.1. The `playground` database was still there, because the data
  lives in the `pgdata` volume.
- `git status` said I was behind origin/main by 4 commits. Those were my
  notes edited on GitHub. `git diff --name-only HEAD...origin/main` showed
  they only touched `docs/daily/DAY-10.md` to `DAY-13.md`, so no conflict
  with my files. I used `git pull --ff-only`, which only moves forward and
  stops if it cannot (no merge commit).
- I made two small commits: the compose fix and the four docs, added by file
  name (not `git add .`), then pushed.
  
### What confused me / still unclear
- Why 127.0.0.1 and 0.0.0.0 are different

### What broke and how I fixed it (error message, cause, fix)
- After `docker compose exec ... psql -c "\l"` the screen stopped at `(END)`.
  Cause: psql showed the list in a pager. Fix: press `q`.

### Commits and links
- 88ad1c5 fix(infra): bind postgres port to 127.0.0.1
- 19b8106 docs: analysis contract, terminology, evaluation spec v0, ADR 0001
- Pushed to main (798cd9d..19b8106).
  
### First step for tomorrow
- Day 14: Weekly review 2 and buffer. Make sure Docker and SQL are solid,
  because every later phase depends on them.
