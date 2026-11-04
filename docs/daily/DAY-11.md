# Day 11 — SQL 2: constraints, foreign keys, joins, NULL, transactions

**Week 2** · **Phase P1: Environment and skeleton (Docker, SQL, design docs)**

**Planned:** 5 h (Learn 2.5 · Build and test 2 · Document 0.5) 

**Status:** ✅ done

## 🎯 Goal for today
You can enforce rules in the database, join tables, reason about NULL, and use a transaction.

## ❓ Why this matters for the project
Unique email, unique (project, content hash), ownership checks and 'timestamp may be NULL' are all database rules. The feedback feature later needs a transaction.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| PRIMARY KEY, FOREIGN KEY, UNIQUE, NOT NULL, CHECK, DEFAULT | postgresqltutorial.com chapters on constraints; PostgreSQL docs 'Constraints' | Skip exclusion constraints. |
| JOIN (inner, left) | SQLBolt join lessons | Left join is the one beginners miss. Practise it. |
| NULL logic: `IS NULL`, `COALESCE`, `ORDER BY ... NULLS LAST` | PostgreSQL docs: Comparison functions (IS NULL) | NULL is not equal to anything, not even NULL. |
| Transactions: BEGIN, COMMIT, ROLLBACK | postgresqltutorial.com Transactions | Atomicity only. Skip isolation levels for now. |

## 🔨 Build / do
- [✓] Create `log_files` and `log_entries` sample tables with foreign keys and a UNIQUE(project_id, content_hash).
- [✓] Insert entries with and without timestamps. Query with `ORDER BY timestamp NULLS LAST`.
- [✓] Break each rule on purpose (duplicate, null, bad foreign key) and read each error message.
- [✓] Do a transaction that inserts two rows, then ROLLBACK, and show nothing was saved.

## 🎤 Interview question this prepares
NULL semantics in SQL and why `= NULL` fails.

## 🏁 Definition of done
- [✓] Every broken rule produced the error you expected
- [✓] Rollback demo works
- [✓] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`chore(playground): constraints, joins, null and transactions`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-11)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** 31-10-26 &nbsp;&nbsp; **Actual hours:** 4 &nbsp;&nbsp;  **Plan followed?** yes

### What I learned (explain it as if to a friend, in my own words)
Constraints are rules the database enforces, so bad data cannot get in. PRIMARY KEY identifies a row, FOREIGN KEY makes a value point to an existing row in another table, UNIQUE blocks duplicates (also for a combination of columns, like `UNIQUE (project_id, content_hash)`), NOT NULL blocks missing values, CHECK enforces a condition and DEFAULT fills a value when none is given. I built `projects`, `log_files` and `log_entries` in a separate practice database (`sqlplay`), so my practice tables cannot clash with the real tables Flyway will create later. `ts` allows NULL on purpose (a missing timestamp is never invented) while `raw_message` is NOT NULL (the raw line is always kept). NULL means "unknown", so `NULL = NULL` is not true but NULL, and `WHERE ts = NULL` returns nothing; I use `IS NULL`. In Postgres NULL sorts as the largest value, so `ORDER BY ts DESC` puts NULL first unless I write `NULLS LAST`. An INNER JOIN keeps only rows that match on both sides; a LEFT JOIN keeps every row of the left table and fills the right side with NULL when there is no match, and `LEFT JOIN ... WHERE right.id IS NULL` finds rows with no match. A transaction groups statements so that all of them happen or none: BEGIN, then COMMIT to save or ROLLBACK to cancel.

### What confused me / still unclear
I did not read the planned sources (postgresqltutorial.com, SQLBolt). The error in the transaction demo (a foreign key error in the second insert, after which Postgres says "current transaction is aborted" until I ROLLBACK) was confusing at first. I also noticed that failed inserts and rolled-back transactions still use up identity numbers, so ids can have gaps.

### What broke and how I fixed it (error message, cause, fix)
- On purpose I broke each rule and read the errors: a duplicate `(project_id, content_hash)` (unique violation), a NULL `raw_message` (not-null violation), a `project_id` that does not exist (foreign key violation), `line_number = 0` and `level = 'EROR'` (check violations), and deleting a project that still has files (foreign key violation from the other side). None of the bad rows got in.
- I noticed my real Compose database showed `0.0.0.0:5432->5432` in `docker ps`, so it is reachable from my whole network, not only from my own computer. Fix planned: bind it to `127.0.0.1` in `docker-compose.yml`. 

### Commits and links
- Notes commit for Day 11 (hash from `git log --oneline`)
- The SQL was run in `psql` against the practice database `sqlplay`; nothing from this day is pushed except these notes.

### First step for tomorrow
Day 12: SQL 3 with GROUP BY, HAVING, indexes and EXPLAIN.
