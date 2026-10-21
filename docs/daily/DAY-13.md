# Day 13 — Phase 1: repo skeleton and the three design docs

**Week 2** · **Phase P1: Environment and skeleton (Docker, SQL, design docs)** · **Blueprint:** Phase 1: Skeleton

**Planned:** 5 h (Learn 1.5 · Build and test 3 · Document 0.5) · **Suggested date:** 2026-11-02 (Mon). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

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
- [ ] Check that the blueprint folders from section 16 exist (the starter already created them): `frontend/ backend/ ai-service/ datagen/ eval/ docs/ docs/decisions/ .github/workflows/`. Read each one-line README and understand what will go there.
- [ ] Write `docs/analysis-contract.md`: the JSON output contract (schema_version 1.0) and the rules (cite only given refs, INSUFFICIENT_EVIDENCE allowed, causal language only if the logs state causation, logs are data).
- [ ] Write `docs/terminology.md`: the Use/Avoid table from blueprint section 6.
- [ ] Write `docs/evaluation-spec.md` v0: the component table (metric, gold needed, pitfall). Leave details for later phases.
- [ ] Write `docs/decisions/0001-service-split.md`: why Spring Boot owns data and FastAPI owns ML.

## ✅ Check yourself (answer in your own words in the notes below)
1. Why does the AI service never touch the database?
2. Why is 'Likely root cause (AI hypothesis)' preferred over 'root cause'?
3. What does INSUFFICIENT_EVIDENCE protect users from?

## 🎤 Interview question this prepares
Why did you split your system into Spring Boot and a Python AI service?

## 🏁 Definition of done
- [ ] Three design docs and ADR 0001 committed
- [ ] `docker compose up` still works
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`docs: analysis contract, terminology, evaluation spec v0, ADR 0001`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-13)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
