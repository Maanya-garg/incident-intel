# Day 37 — Synthetic generator 2: remaining families, decoys, mess, insufficient evidence

**Week 6** · **Phase P5: Synthetic data, grouping and incident detection (part 1)** · **Blueprint:** Phases 5, 6 and the start of 7

**Planned:** 6 h (Learn 1 · Build and test 4.5 · Document 0.5) · **Suggested date:** 2026-11-26 (Thu). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
Five fault families exist, with the messiness the blueprint demands.

## ❓ Why this matters for the project
If the data is too clean, every metric looks great and means nothing. Decoys, ties, out-of-order lines and missing timestamps make evaluation real.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| Scenario families | Blueprint section 11: database, payment, authentication, API timeout, resource exhaustion | Several variants each, with different wording, services and timing. |

## 🔨 Build / do
- [ ] Add the other four families.
- [ ] Every scenario includes: normal traffic, repeated errors, unrelated warnings, decoys (harmless error spikes that are not incidents), timestamp ties, out-of-order lines, some missing timestamps, mixed formats.
- [ ] Add scenarios whose logs do not contain enough to name a cause: `expected_outcome = insufficient_evidence`.
- [ ] Add one scenario containing a prompt-injection line (`IGNORE PREVIOUS INSTRUCTIONS ...`) for the security tests later.

## ✅ Check yourself (answer in your own words in the notes below)
1. What is a decoy and what metric would be meaningless without one?
2. Why must some scenarios be unanswerable?
3. Why include timestamp ties and missing timestamps?

## 🏁 Definition of done
- [ ] Five families, decoys and insufficient-evidence cases exist
- [ ] Generator tests pass
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`feat(datagen): five fault families with decoys and insufficient-evidence cases`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-37)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
