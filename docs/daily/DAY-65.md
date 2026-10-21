# Day 65 — Evaluation runner and component metrics

**Week 10** · **Phase P12: Evaluation and ablation** · **Blueprint:** Phase 17

**Planned:** 6.5 h (Learn 2.5 · Build and test 3.5 · Document 0.5) · **Suggested date:** 2026-12-24 (Thu). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
A runner executes the test scenarios end to end and collects every component metric.

## ❓ Why this matters for the project
This is where the project becomes research-quality: honest measurement on a held-out set.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| Rubric design and scoring | Your `docs/evaluation-spec.md`; blueprint section 12 | Decide what you score automatically and what you score by hand. |
| Repeated runs: mean and spread | Any intro to variance and standard deviation | LLM output varies. One run proves little. |
| Basic statistics: mean, standard deviation, why one run proves little | Khan Academy Statistics and probability: mean, standard deviation (the first few lessons) | You only need mean and spread. Skip hypothesis testing. |

## 🔨 Build / do
- [ ] `eval/` runner: upload each held-out scenario, run the pipeline, bypass the cache, record model, prompt version and temperature.
- [ ] Compute: parsing, grouping, incidents, timeline, retrieval (from earlier), then hypothesis, grounding (validity and relevance) and insufficient-evidence behaviour (correct abstention and false abstention).
- [ ] Automate what you can (fault-type and component match, citation relevance against gold lines, abstention). Score the rest with a 0 to 2 rubric by hand on shuffled, anonymised outputs so you do not know which system produced them.
- [ ] Repeat the full pipeline several times (choose N, such as 3, and record it). Report mean and spread.
- [ ] Compute the mean and standard deviation of your repeated runs with Python's `statistics` module and write what the spread tells you.

## ✅ Check yourself (answer in your own words in the notes below)
1. Why score blind to which system produced the answer?
2. Why run the pipeline more than once?
3. What is false abstention?

## 🏁 Definition of done
- [ ] Runner produces a results file you can re-create from scratch
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`feat(eval): end-to-end evaluation runner`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-65)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
