# Day 60 — Frontend 2: incident detail, observed evidence side

**Week 9** · **Phase P10: Frontend completion** · **Blueprint:** Phase 15

**Planned:** 6 h (Learn 1.5 · Build and test 4 · Document 0.5) · **Suggested date:** 2026-12-19 (Sat). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
The incident page shows header, timeline, error groups, relevant logs and similar incidents.

## ❓ Why this matters for the project
The blueprint wants a clear visual split between observed evidence (facts from logs) and the AI hypothesis. We build the evidence side first.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| Component design | react.dev: Thinking in React | Break the page into small components. |

## 🔨 Build / do
- [ ] Incident header: severity, affected services, first and last seen.
- [ ] Timeline component with the label 'Observed timeline, based on available log entries', repeated events collapsed.
- [ ] Error groups table, relevant logs with their L-labels, similar incidents list (or 'No similar historical incidents found'), SEED badge.
- [ ] HTML-escape everything from logs.

## ✅ Check yourself (answer in your own words in the notes below)
1. Why separate observed evidence from the AI hypothesis visually?
2. What does the UI show when there is no history?
3. Why must log text never be rendered as HTML?

## 🏁 Definition of done
- [ ] Evidence side complete and screenshot saved
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`feat(frontend): incident detail with timeline, groups, logs and similar incidents`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-60)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
