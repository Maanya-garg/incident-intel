# Day 57 — Feedback, confirmed root cause, seed incidents

**Week 9** · **Phase P9: Feedback loop and Redis cache** · **Blueprint:** Phases 14 and 14b

**Planned:** 6 h (Learn 2 · Build and test 3.5 · Document 0.5) · **Suggested date:** 2026-12-16 (Wed). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
Developer feedback is saved atomically, becomes searchable knowledge, and seed incidents are labelled honestly.

## ❓ Why this matters for the project
This closes the loop: the knowledge base grows from confirmed answers, never from AI guesses.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| `@Transactional` basics | Spring Framework reference: Declarative transaction management | Rollback on runtime exceptions; the proxy pitfall (calling a transactional method from the same class). |
| Why not call a remote service inside a DB transaction | Any article on transaction boundaries and external calls | Compute the new embedding first, then write everything in one short transaction. |

## 🔨 Build / do
- [ ] `V10__incident_feedback.sql` per blueprint section 7.
- [ ] `POST /api/incidents/{id}/feedback`: is_helpful, actual root cause, actual resolution, comment.
- [ ] Flow: ownership check, build the new representation including the confirmed values, embed it, then in one transaction save feedback, update incident status and confirmed fields, store the new embedding. If embedding fails, nothing is saved and the user gets a clear error.
- [ ] Keep AI hypothesis and confirmed values in separate fields. Only confirmed incidents count as knowledge.
- [ ] Load seed incidents with `source = SEED`. The API labels them 'Seed example, not developer-confirmed'. Respect the leakage rule.
- [ ] Tests: atomicity (simulate an embedding failure and check nothing was saved), separation of fields, seed labelling.

## ✅ Check yourself (answer in your own words in the notes below)
1. Why is the embedding computed before the transaction?
2. Why are AI and confirmed fields kept apart?
3. What is a seed incident and why is it labelled?

## 🏁 Definition of done
- [ ] Atomicity test passes
- [ ] A confirmed incident appears in similar results afterwards
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`feat(backend): feedback, confirmed knowledge and seed incidents`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-57)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
