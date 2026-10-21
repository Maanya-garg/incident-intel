# Day 44 — Observed timeline

**Week 7** · **Phase P6: Incident detection (part 2) and observed timeline** · **Blueprint:** Phases 7 and 8

**Planned:** 6 h (Learn 2 · Build and test 3.5 · Document 0.5) · **Suggested date:** 2026-12-03 (Thu). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
Each incident has an ordered, collapsed, honestly labelled timeline.

## ❓ Why this matters for the project
The timeline shows order, not proof of cause. Handling ties, out-of-order lines and missing timestamps is the hard part.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| Ordering with NULLs: `ORDER BY ... NULLS LAST` | PostgreSQL docs: ORDER BY | Matches your Day 5 Java `nullsLast` sort. |
| Time zones | Java `OffsetDateTime`; PostgreSQL TIMESTAMPTZ docs | Store UTC. Decide how timestamps without an offset are treated and document it (ADR 0007). |

## 🔨 Build / do
- [ ] Select logs relevant to the incident through `incident_logs`.
- [ ] Sort by timestamp, break ties with file and line number. Entries without timestamps are placed by line order inside their file and clearly marked.
- [ ] Collapse repeats into entries such as 'DB connection timeout x42 (10:22 to 10:27)'.
- [ ] `GET /api/incidents/{id}/timeline`. The response includes the label 'Observed timeline, based on available log entries' and a flag when data may be incomplete.
- [ ] Tests: ties, out-of-order lines, missing timestamps, long repeats.

## ✅ Check yourself (answer in your own words in the notes below)
1. Why must the timeline never invent a missing event?
2. How do you place an entry with no timestamp, and how is it marked?
3. Why is a timeline not a causal chain?

## 🏁 Definition of done
- [ ] Timeline tests pass
- [ ] API returns the required label
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`feat(backend): observed timeline with collapsing and null handling`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-44)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
