# Day 12 — SQL 3: GROUP BY, HAVING, indexes, EXPLAIN

**Week 2** · **Phase P1: Environment and skeleton (Docker, SQL, design docs)** · **Blueprint:** Phase 1: Skeleton

**Planned:** 5 h (Learn 2 · Build and test 2.5 · Document 0.5) · **Suggested date:** 2026-11-01 (Sun). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
You can aggregate rows, add an index, and read a query plan to see if the index was used.

## ❓ Why this matters for the project
Template grouping is a GROUP BY. Fast log queries need indexes. The blueprint asks for composite indexes and EXPLAIN in its grouping phase.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| COUNT, MIN, MAX, GROUP BY, HAVING | postgresqltutorial.com GROUP BY and HAVING; SQLBolt aggregates | Skip GROUPING SETS and ROLLUP. |
| B-tree indexes: what they are and when they help | use-the-index-luke.com (first few chapters: 'Anatomy of an Index', 'The Where Clause') | Skip other databases' pages. Postgres behaves similarly. |
| EXPLAIN and EXPLAIN ANALYZE | PostgreSQL docs 'Using EXPLAIN' | Learn to spot Seq Scan vs Index Scan and the cost and time numbers. |

## 🔨 Build / do
- [ ] Generate 200,000 fake log rows with `generate_series` into a scratch table.
- [ ] Write an error-group style query: per message, count occurrences, first seen, last seen, ordered by count.
- [ ] Run `EXPLAIN ANALYZE` on a filter query before and after creating an index. Write both times in your notes.
- [ ] Create a composite index and see which queries it helps and which it does not.

## ✅ Check yourself (answer in your own words in the notes below)
1. WHERE vs HAVING: what is the difference?
2. Why can an index make writes slower?
3. What does 'Seq Scan' mean and when is it actually fine?
4. Does an index on (a, b) help a query that filters only on b?

## 🏁 Definition of done
- [ ] You have before/after EXPLAIN numbers in your notes
- [ ] The group query returns correct counts
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`chore(playground): aggregates, indexes and explain`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-12)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
