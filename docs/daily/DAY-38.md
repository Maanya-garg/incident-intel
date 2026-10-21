# Day 38 — Synthetic generator 3: dev/test split, leakage rule, first parsing metric

**Week 6** · **Phase P5: Synthetic data, grouping and incident detection (part 1)** · **Blueprint:** Phases 5, 6 and the start of 7

**Planned:** 5 h (Learn 1 · Build and test 3.5 · Document 0.5) · **Suggested date:** 2026-11-27 (Fri). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
A dataset is generated with a dev/test split, and your first real number (parsing accuracy) is measured.

## ❓ Why this matters for the project
From now on every phase computes a metric on the dev set. The held-out test set is only for the final report.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| Train/dev/test discipline | Google ML Crash Course: Datasets, generalization and overfitting | The idea: tune on dev, report on test, never tune on test. |
| Retrieval leakage rule | Blueprint section 11 | Test incidents must be worded differently from knowledge-base incidents of the same family. |

## 🔨 Build / do
- [ ] Split by seed into dev and a held-out test set. Record how many scenarios in each (suggestion: about 40 scenarios total, 60 percent dev; the number is yours, but write it down).
- [ ] Keep separate wording banks so test incidents are phrased differently from knowledge-base incidents.
- [ ] Write `eval/parsing_eval.py` (or Java test) that runs the real parser on the generated files and compares to the sidecar labels.
- [ ] Save the real result to `eval/results/parsing.md`. Fix any parser bugs found. Do not make up numbers.

## ✅ Check yourself (answer in your own words in the notes below)
1. What would 'tuning on the test set' do to your results?
2. What is retrieval leakage and how would it flatter your retrieval metric?
3. How do you count a NULL timestamp that is truly absent?

## 🏁 Definition of done
- [ ] `eval/results/parsing.md` contains measured numbers
- [ ] Dev/test split is documented
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`feat(eval): dataset split and parsing metric`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-38)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
