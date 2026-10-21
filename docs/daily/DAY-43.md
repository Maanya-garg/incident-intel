# Day 43 — Incident detection 2: persistence, SQL version, incident metric

**Week 7** · **Phase P6: Incident detection (part 2) and observed timeline** · **Blueprint:** Phases 7 and 8

**Planned:** 6 h (Learn 2 · Build and test 3.5 · Document 0.5) · **Suggested date:** 2026-12-02 (Wed). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
Incidents are saved, exposed by the API, and scored with precision, recall and F1 on the dev set.

## ❓ Why this matters for the project
Without decoys and a proper matching rule, precision is meaningless. This day makes the detection measurable.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| `date_trunc`, CTEs, `LAG` for gap-based clustering in SQL | PostgreSQL docs: Window Functions tutorial; postgresqltutorial.com CTE and LAG | Use this as a learning exercise. The production clustering stays in Java. |
| Time-window overlap matching (IoU) | Wikipedia: Jaccard index (intersection over union) | Predicted incident window vs gold window. |

## 🔨 Build / do
- [ ] Write `V6__incidents.sql`: `incidents`, `incident_groups`, `incident_logs` (with `ref_label`) per blueprint section 7. Keep AI fields and confirmed fields in separate columns.
- [ ] Store title, severity, affected services, first/last seen, occurrence count. Do not claim causation.
- [ ] Endpoints: `GET /api/projects/{id}/incidents` and `GET /api/incidents/{id}` with ownership checks.
- [ ] Reproduce the clustering for one file in plain SQL using LAG and compare to the Java result.
- [ ] Write `eval/incident_eval.py`: match predicted to gold incidents by window overlap (start with IoU at least 0.5 and justify it). Decoys flagged as incidents count as false positives. Tune the gap threshold on dev only. Save the results.

## ✅ Check yourself (answer in your own words in the notes below)
1. How does a decoy change the meaning of precision?
2. Why is IoU a reasonable match rule? What are its weak points?
3. What does `LAG` return for the first row?

## 🏁 Definition of done
- [ ] Incidents persisted and served
- [ ] `incidents.md` has measured precision, recall, F1
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`feat(backend): incident persistence, api and detection metric`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-43)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
