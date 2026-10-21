# Day 50 — Retrieval: indexes, filtering, threshold, cold start, Hit@K vs keyword baseline

**Week 8** · **Phase P7: Embeddings, pgvector, retrieval and evidence** · **Blueprint:** Phases 9, 10 and 11

**Planned:** 6 h (Learn 2.5 · Build and test 3 · Document 0.5) · **Suggested date:** 2026-12-09 (Wed). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
Top-K similar incidents are returned with similarity scores, weak matches are hidden, and retrieval is measured against a keyword baseline.

## ❓ Why this matters for the project
Similar does not mean same root cause. Retrieval is supporting context only, and you must show it beats plain keyword search to justify the complexity.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| ANN indexes: HNSW vs IVFFlat | pgvector README: Indexing (HNSW, IVFFlat), and the notes on filtering | Understand the trade-offs. On a small table an exact scan is fine, so you build the index to learn and to check EXPLAIN. |
| Postgres full-text search | PostgreSQL docs: Full Text Search (tsvector, websearch_to_tsquery, ts_rank) | This is your keyword baseline. |

## 🔨 Build / do
- [ ] Create an HNSW index (or IVFFlat after loading data) and confirm with EXPLAIN what Postgres does. Note filtered-search caveats from the README.
- [ ] Retrieval service: top-K (3 to 5), minimum similarity threshold tuned on dev, prefer developer-confirmed incidents, mark SEED incidents.
- [ ] Cold start: zero matches returns 'No similar historical incidents found'.
- [ ] `GET /api/incidents/{id}/similar`.
- [ ] Hit@3 or Recall@3 vs the full-text baseline on dev. Use knowledge-base incidents worded differently from test incidents (the leakage rule). Save the result.

## ✅ Check yourself (answer in your own words in the notes below)
1. Why can an ANN index return fewer results when combined with a WHERE filter?
2. What does the similarity threshold protect the user from?
3. What would retrieval leakage do to your Hit@3?

## 🏁 Definition of done
- [ ] Empty-history test passes
- [ ] `retrieval.md` compares embeddings to keyword search with real numbers
- [ ] Notes below filled in, work committed and pushed

## ➕ Stretch (only if you are ahead of schedule, otherwise skip)
- Compare HNSW and IVFFlat on your data (only if ahead).

## 💾 Suggested commit
`feat(backend): similar incident retrieval with threshold and baseline eval`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-50)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
