# Day 59 — Frontend 1: dashboard, project page, incident list

**Week 9** · **Phase P10: Frontend completion** · **Blueprint:** Phase 15

**Planned:** 5 h (Learn 1.5 · Build and test 3 · Document 0.5) · **Suggested date:** 2026-12-18 (Fri). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
Dashboard and project pages work with proper loading, empty and error states.

## ❓ Why this matters for the project
The blueprint's full UI starts from a dashboard and a project page. Keep it clean and developer-oriented.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| TanStack Query patterns: query keys, invalidation, error handling | tanstack.com/query docs: Query Keys, Query Invalidation | Consistent keys make the cache predictable. |

## 🔨 Build / do
- [ ] Add navigation and an auth guard (redirect to login without a token).
- [ ] Dashboard: projects, recent incidents with severity, counts.
- [ ] Project page: upload, file list with status (UPLOADED/PARSING/PARSED/FAILED), incident list.
- [ ] Design loading, empty, error and unauthorized states for each page.

## ✅ Check yourself (answer in your own words in the notes below)
1. Why design empty and error states first?
2. How do query keys help invalidation?
3. What should the UI do on a 401 from any call?

## 🏁 Definition of done
- [ ] Pages work with real data
- [ ] All four states are visible
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`feat(frontend): dashboard, project page and incident list`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-59)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
