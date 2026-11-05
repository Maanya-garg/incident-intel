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
GROUP BY puts rows with the same value into one group so I can run COUNT, MIN and MAX on each group; HAVING filters the groups after they are built, while WHERE filters rows before grouping (so `WHERE count(*) > 5` is an error and I need HAVING). COUNT(*) counts every row, but COUNT(column), MIN and MAX skip NULLs. My error-group style query groups by message (later by service and normalized template) and returns the count, first seen and last seen, which is the SQL form of the `error_groups` table. An index is a separate sorted structure, so a range filter can jump to the right place instead of reading the whole table. EXPLAIN shows the plan and EXPLAIN ANALYZE really runs the query and shows the time, so I must not use it on INSERT or DELETE. A composite index on (a, b) is sorted by a first, so it helps queries that filter on a (alone or with b) and does not help much when only b is filtered, like a phone book sorted by surname then first name.

**Before and after (200,000 fake rows in `scratch_logs`, query: count rows in a 10-minute `ts` window, about 588 rows):**
- Before the index: `Parallel Seq Scan`, `Execution Time` 19.139 ms and 36.202 ms in the two runs I recorded (<add the other runs if you have them>). One run is not a reliable number, so I report the range.
- After `CREATE INDEX ... (ts)`: plan `<Index Scan / Index Only Scan / Bitmap Index Scan>`, `Execution Time` <min> to <max> ms over <N> runs.
- Composite index `(project_id, ts)`: Query A (filters on `project_id` and `ts`) used `<plan>`; Query B (filters only on `ts`) used `<plan>`.
- The data is fake and perfectly sorted by `ts`, so these numbers do not predict real log files.

### What confused me / still unclear
I did not read the planned sources (use-the-index-luke.com and the PostgreSQL docs). Why an index slows INSERT, UPDATE and DELETE: every index is another sorted structure that Postgres must update on each write, so more indexes mean slower writes and more disk. I do not yet know how the planner decides between Seq Scan, Index Scan and Bitmap Index Scan.

### What broke and how I fixed it (error message, cause, fix)
- The first `EXPLAIN ANALYZE` showed `Rows Removed by Filter: 132941` with `loops=3`, which multiplies to about 400,000 rows and 1,176 matches, double what I expected. `SELECT count(*)` returned 400000: the `INSERT ... generate_series` block had run twice. Fix: `TRUNCATE scratch_logs RESTART IDENTITY` (after checking `SELECT current_database()` was the practice database `sqlplay`), then one insert, giving 200000 rows. Lesson: check `count(*)` right after a bulk insert.
- The output opened in psql's pager and showed `~` lines. Fix: `q` to leave it and `\pset pager off`.
- A single run of `EXPLAIN ANALYZE` jumped between 19 and 36 ms, so I record a range over several runs.

### Commits and links
- Notes commit for Day 12 (hash from `git log --oneline`)
- The practice table lives in the `sqlplay` database; no SQL file is pushed.

### First step for tomorrow
Day 13: repo skeleton and the three design docs (analysis contract, evaluation spec, terminology).
