# Day 12 — SQL 3: GROUP BY, HAVING, indexes, EXPLAIN

**Week 2** · **Phase P1: Environment and skeleton (Docker, SQL, design docs)** 

**Planned:** 5 h (Learn 2 · Build and test 2.5 · Document 0.5)

**Status:** ✅ 

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
- [✓] Generate 200,000 fake log rows with `generate_series` into a scratch table.
- [✓] Write an error-group style query: per message, count occurrences, first seen, last seen, ordered by count.
- [✓] Run `EXPLAIN ANALYZE` on a filter query before and after creating an index. Write both times in your notes.
- [✓] Create a composite index and see which queries it helps and which it does not.

## 🏁 Definition of done
- [✓] You have before/after EXPLAIN numbers in your notes
- [✓] The group query returns correct counts
- [✓] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`chore(playground): aggregates, indexes and explain`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-12)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** 1-11-2026 &nbsp;&nbsp; **Actual hours:** 4 &nbsp;&nbsp; **Plan followed?** yes 

### What I learned (explain it as if to a friend, in my own words)
GROUP BY is used to group rows having the same value so that we can perform aggregate operations like COUNT, MIN, and MAX on each group. HAVING is used to filter the groups after aggregation.
Indexes help PostgreSQL find rows faster without scanning the entire table. A B-tree index is useful for many common filtering and sorting queries.
EXPLAIN shows how PostgreSQL plans to execute a query. EXPLAIN ANALYZE actually runs the query and shows the execution time and whether PostgreSQL used a Seq Scan or an Index Scan.
A Seq Scan means PostgreSQL checks the rows sequentially. It is not always bad because for a small table, scanning the whole table can be faster than using an index.
A composite index contains multiple columns. An index on (a, b) is most useful when the query filters using a, because a is the first column in the index.

### What confused me / still unclear
The main thing I found confusing was why an index can make INSERT, UPDATE, and DELETE slower. I also needed to understand why an index on (a, b) does not generally help much when a query filters only on b.

### What broke and how I fixed it (error message, cause, fix)
No major errors. I compared the query execution plan before and after creating an index and checked the difference using EXPLAIN ANALYZE.

### Commits and links
notes commited 

### First step for tomorrow
SQL 4: CTEs, subqueries, and window functions
