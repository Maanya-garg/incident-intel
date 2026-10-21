# Day 45 — Timeline metric and cleanup

**Week 7** · **Phase P6: Incident detection (part 2) and observed timeline** · **Blueprint:** Phases 7 and 8

**Planned:** 5 h (Learn 1.5 · Build and test 3 · Document 0.5) · **Suggested date:** 2026-12-04 (Fri). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
Timeline ordering and completeness are measured against the gold chain.

## ❓ Why this matters for the project
A timeline that looks right but is wrong in ordering or misses key events misleads the developer. Measure it.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| Kendall's tau (ordering agreement) | Wikipedia: Kendall rank correlation coefficient; scipy.stats.kendalltau docs | Or use simple pairwise ordering accuracy. Both are fine, state which one you use. |

## 🔨 Build / do
- [ ] Write `eval/timeline_eval.py`: pairwise ordering accuracy or Kendall's tau, plus completeness (share of gold chain events present).
- [ ] Make sure the dataset includes ties, out-of-order lines and missing timestamps, or the metric is trivial.
- [ ] Fix timeline bugs found by the metric. Save results.
- [ ] Review the whole backend for leftover TODOs and tidy up.

## ✅ Check yourself (answer in your own words in the notes below)
1. What does a Kendall tau of 1, 0 and -1 mean?
2. What is completeness and why is ordering alone not enough?
3. Why would a trivial dataset make this metric useless?

## 🏁 Definition of done
- [ ] `timeline.md` has measured ordering and completeness
- [ ] Notes below filled in, work committed and pushed

## ➕ Stretch (only if you are ahead of schedule, otherwise skip)
- A bare incident page in the frontend showing the timeline (30 to 60 minutes).

## 💾 Suggested commit
`feat(eval): timeline ordering and completeness metric`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-45)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
