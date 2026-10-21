# Day 67 — Ablations

**Week 10** · **Phase P12: Evaluation and ablation** · **Blueprint:** Phase 17

**Planned:** 6 h (Learn 1.5 · Build and test 4 · Document 0.5) · **Suggested date:** 2026-12-26 (Sat). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
You know which pipeline stages actually help, by removing one at a time.

## ❓ Why this matters for the project
The blueprint demands this: show what each stage contributes, including where it does not help.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| Ablation studies | Any short explanation of ablation studies | Remove one thing, hold everything else fixed. |

## 🔨 Build / do
- [ ] Ablations: no historical retrieval, no timeline, no grouping, no verification.
- [ ] Run each on the held-out set with the same repeats and the same rubric.
- [ ] Collect results into tables. Report mean and spread, dataset size, number of scenarios and number of runs next to every result.
- [ ] Hard rule: never invent numbers or improvement percentages. Report where the pipeline does not win.

## ✅ Check yourself (answer in your own words in the notes below)
1. What does it mean if removing a stage changes nothing?
2. Why must each ablation change only one thing?
3. How will you report a result that goes against your expectation?

## 🏁 Definition of done
- [ ] Ablation tables complete
- [ ] Notes below filled in, work committed and pushed

## ➕ Stretch (only if you are ahead of schedule, otherwise skip)
- Calibration: does stated confidence match correctness (only if ahead).

## 💾 Suggested commit
`feat(eval): stage ablations`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-67)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
