# Day 41 — Incident detection 1: time-gap clustering and relative signals

**Week 6** · **Phase P5: Synthetic data, grouping and incident detection (part 1)** · **Blueprint:** Phases 5, 6 and the start of 7

**Planned:** 6 h (Learn 2 · Build and test 3.5 · Document 0.5) · **Suggested date:** 2026-11-30 (Mon). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
A Java clusterer groups related error events into candidate incidents and labels relative signals honestly.

## ❓ Why this matters for the project
An incident is a cluster of related groups and events close in time. The blueprint keeps clustering in Java because it is easy to unit test and tune.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| Gap-based clustering | Your own design: sort by time, start a new cluster when the gap exceeds a threshold | Draw an example on paper first. |
| Why no system-wide anomaly claims | Blueprint section 5.4 | One file gives no baseline. Signals are 'relative to this file'. |

## 🔨 Build / do
- [ ] Select WARN and above (or members of error groups) as candidate events. Entries with NULL timestamps are not clustered, they are reported as unplaced.
- [ ] Cluster by gap threshold (start with a value, tune on dev later). Add relatedness signals: shared service, error group, severity.
- [ ] Add relative signals labelled 'relative to this file': rate increase versus an earlier part of the file, severity escalation (WARN to ERROR to FATAL), a template appearing for the first time mid-file.
- [ ] Unit tests with hand-made data: one burst, two separate bursts, a decoy spike, null timestamps.

## ✅ Check yourself (answer in your own words in the notes below)
1. Why can't you say 'this is anomalous' from a single file?
2. What do you do with entries that have no timestamp?
3. What trade-off does the gap threshold control?

## 🏁 Definition of done
- [ ] Clusterer unit tests pass
- [ ] Relative signals carry the 'relative to this file' label
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`feat(backend): incident clustering and relative signals`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-41)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
