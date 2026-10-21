# Day 36 — Synthetic generator 1: scenario model, manifest, labels, one family

**Week 6** · **Phase P5: Synthetic data, grouping and incident detection (part 1)** · **Blueprint:** Phases 5, 6 and the start of 7

**Planned:** 6 h (Learn 1.5 · Build and test 4 · Document 0.5) · **Suggested date:** 2026-11-25 (Wed). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
A seeded generator creates multi-service logs for one fault family with a ground-truth manifest and per-line labels.

## ❓ Why this matters for the project
You cannot measure root-cause quality on real logs (no ground truth). Synthetic logs with a known cause are how you measure every stage honestly.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| Ground truth, test fixtures, why synthetic data | Blueprint section 11 | Re-read the manifest example carefully. |
| Poisson-like arrivals for background traffic | Python docs: `random.expovariate` | Intuition only: random gaps between events. |

## 🔨 Build / do
- [ ] Update `docs/evaluation-spec.md` with exactly which gold fields each metric needs (the blueprint rule).
- [ ] Design the model: services (api-gateway, auth, payment, database, cache), three log formats, background INFO traffic.
- [ ] Implement the first family `database_connection_failure` with three variants (for example pool exhaustion, timeout, refused) and different wording.
- [ ] Write the manifest JSON (scenario_id, family, variant, seed, split, expected_outcome, incident_window, causal_chain, gold_evidence) and a sidecar `.jsonl` with per-line labels (event_type, equivalence_class, gold timestamp, gold level, gold service).
- [ ] Gold evidence refers to (file, line number) because DB ids do not exist yet.

## ✅ Check yourself (answer in your own words in the notes below)
1. Why does gold evidence use file and line number instead of database ids?
2. Why must the generator be seeded?
3. What is the point of per-line labels?

## 🏁 Definition of done
- [ ] One family generates with three variants
- [ ] Same seed gives byte-identical files (test)
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`feat(datagen): scenario engine, manifest and labels for database failures`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-36)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
