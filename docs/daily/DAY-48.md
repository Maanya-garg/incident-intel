# Day 48 — pgvector: vector column, distance operators, first similarity query

**Week 7** · **Phase P7: Embeddings, pgvector, retrieval and evidence** · **Blueprint:** Phases 9, 10 and 11

**Planned:** 5 h (Learn 2.5 · Build and test 2 · Document 0.5) · **Suggested date:** 2026-12-07 (Mon). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
Incident embeddings are stored in Postgres and the closest incidents are found with SQL.

## ❓ Why this matters for the project
Semantic retrieval with the database you already have, no extra vector database to run.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| pgvector: `vector(n)`, `<->`, `<=>`, `<#>`, similarity = 1 - cosine distance | github.com/pgvector/pgvector README: Getting Started, Querying, Distances | Index sections wait until tomorrow. |
| Passing vectors from Java | pgvector README: examples; Spring JdbcTemplate | Simplest: pass the vector as text and cast `?::vector`. |

## 🔨 Build / do
- [ ] `V7__incident_embeddings.sql`: `CREATE EXTENSION IF NOT EXISTS vector`, table per blueprint section 7 with `vector(384)` (or the size you verified), model name and created_at.
- [ ] Store an incident's embedding with the model name.
- [ ] Write the similarity query: same project, exclude current incident, order by `<=>`, limit K.
- [ ] Test it with Testcontainers: 5 inserted vectors, correct nearest order.

## ✅ Check yourself (answer in your own words in the notes below)
1. Which operator is cosine distance and how do you turn it into similarity?
2. Why store the model name next to each embedding?
3. Why filter by `project_id` in the query?

## 🏁 Definition of done
- [ ] Similarity query returns correct order in an automated test
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`feat(backend): pgvector storage and similarity query`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-48)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
