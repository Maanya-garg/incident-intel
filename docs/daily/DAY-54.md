# Day 54 — Spring orchestration: analyze, store, handle failure

**Week 8** · **Phase P8: LLM integration and evidence verification** · **Blueprint:** Phases 12 and 13

**Planned:** 6 h (Learn 2 · Build and test 3.5 · Document 0.5) · **Suggested date:** 2026-12-13 (Sun). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
`POST /api/incidents/{id}/analyze` builds evidence, calls the AI service, validates again and stores the result.

## ❓ Why this matters for the project
Spring Boot remains the single authority for data. It treats the AI response as untrusted input even though it validated it.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| JSON columns and DTO validation | PostgreSQL docs: JSON types; Spring Bean Validation on records | Reject unknown `schema_version`. |
| HTTP error design | MDN: 502, 503, 504 | LLM unavailable: a clear error, never a crash. |

## 🔨 Build / do
- [ ] `V8__analyses.sql` per blueprint section 7.
- [ ] Flow: ownership check, evidence package, AI call, validate, store (`analyses`), return.
- [ ] Handle: AI service down, timeout, invalid response. Nothing invalid is stored or cached.
- [ ] `GET /api/incidents/{id}/analysis` returns the latest stored analysis.
- [ ] V1 stays synchronous. Write the limitation in the README (the UI waits).

## ✅ Check yourself (answer in your own words in the notes below)
1. Why validate again in Java if Python already validated?
2. What is the right status code when the LLM is unavailable?
3. What is the cost of a synchronous call and when would you make it async?

## 🏁 Definition of done
- [ ] Happy path and three failure paths are tested
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`feat(backend): analyze endpoint orchestration and storage`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-54)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
