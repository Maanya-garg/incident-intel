# Day 40 — Grouping metric, EXPLAIN and index check

**Week 6** · **Phase P5: Synthetic data, grouping and incident detection (part 1)** · **Blueprint:** Phases 5, 6 and the start of 7

**Planned:** 5 h (Learn 1.5 · Build and test 3 · Document 0.5) · **Suggested date:** 2026-11-29 (Sun). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
You measure over-merging and over-splitting separately on the dev set, and check the grouping query's plan.

## ❓ Why this matters for the project
The blueprint says: do not report one blended number. Over-merged groups hide problems, over-split groups create noise.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| Pairwise precision and recall | Google ML Crash Course: Classification: Accuracy, precision, recall | Pairs of lines are the items you classify as 'same group' or 'different group'. |
| EXPLAIN for the grouping query | Your Day 12 notes | Does it use your composite index? |

## 🔨 Build / do
- [ ] Write `eval/grouping_eval.py`: pairs from the same `equivalence_class` that end up in different groups (over-splitting), and pairs from different classes in the same group (over-merging).
- [ ] Report both numbers and examples of the worst mistakes.
- [ ] Tune normalization rules on dev data only. Re-measure. Save to `eval/results/grouping.md`.
- [ ] Run EXPLAIN on the grouping query and note the result.

## ✅ Check yourself (answer in your own words in the notes below)
1. What does low precision mean here? Low recall?
2. Why report over-merge and over-split separately?
3. Why is tuning on dev only?

## 🏁 Definition of done
- [ ] `grouping.md` has real numbers for both error types
- [ ] Notes below filled in, work committed and pushed

## ➕ Stretch (only if you are ahead of schedule, otherwise skip)
- Add a `GroupMerger` hook for semantic merging later (implement after Day 47, only if ahead).

## 💾 Suggested commit
`feat(eval): grouping metric with over-merge and over-split`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-40)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
