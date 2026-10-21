# Day 61 — Frontend 3: analysis panel, verification badges, feedback form

**Week 9** · **Phase P10: Frontend completion** · **Blueprint:** Phase 15

**Planned:** 6 h (Learn 1.5 · Build and test 4 · Document 0.5) · **Suggested date:** 2026-12-20 (Sun). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
The AI hypothesis, its verified evidence and the feedback form are on the incident page.

## ❓ Why this matters for the project
This page is what a reviewer will see in a demo. It must show honest states, including INSUFFICIENT_EVIDENCE and unverified analysis.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| `useMutation` with loading and error states | TanStack Query docs: Mutations | Run analysis is slow. Show progress. |

## 🔨 Build / do
- [ ] 'Run analysis' button with an in-progress state.
- [ ] Show: likely root cause (AI hypothesis), the model's stated confidence, evidence with VALID/NOT_FOUND/NOT_IN_INCIDENT badges, an 'unverified' banner when needed, historical context, suggested investigation, suggested fixes, limitations.
- [ ] INSUFFICIENT_EVIDENCE state. Terminology rule: the unqualified phrase 'root cause' appears only next to a developer-confirmed value.
- [ ] Feedback form: Useful / Incorrect, actual root cause, actual resolution.
- [ ] Add component tests for upload, table and error states. Lint and typecheck must pass.

## ✅ Check yourself (answer in your own words in the notes below)
1. Which words must never appear unqualified in the UI?
2. What does the user see if no citation is valid?
3. Why is the model's stated confidence labelled that way?

## 🏁 Definition of done
- [ ] Full flow works in the browser
- [ ] Lint, typecheck and tests pass
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`feat(frontend): analysis panel, verification badges and feedback form`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-61)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
