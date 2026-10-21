# Day 66 — Baselines

**Week 10** · **Phase P12: Evaluation and ablation** · **Blueprint:** Phase 17

**Planned:** 5 h (Learn 1.5 · Build and test 3 · Document 0.5) · **Suggested date:** 2026-12-25 (Fri). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
Two simple baselines run on the same model, scenarios and rubric.

## ❓ Why this matters for the project
Without baselines you cannot say your pipeline is better than 'paste logs into an LLM'. That claim is the point of the project.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| Experimental design: controlling variables | Any short article on baselines and ablations in ML | Same model, same scenarios, same rubric, same scoring. |

## 🔨 Build / do
- [ ] Baseline 1: raw logs truncated to fit the context, sent to the LLM.
- [ ] Baseline 2: error lines only, sent to the LLM.
- [ ] Run both on the held-out set with the same number of repeats.
- [ ] Save outputs, anonymise and score with the same rubric.

## ✅ Check yourself (answer in your own words in the notes below)
1. Why must the baselines use the same model?
2. What is the risk if one system gets more context than another?
3. What would you conclude if the baseline beats your pipeline?

## 🏁 Definition of done
- [ ] Baseline results saved and scored
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`feat(eval): raw-log and error-only baselines`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-66)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
