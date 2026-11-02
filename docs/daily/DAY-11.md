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
SQL constraints are rules enforced by the database. PRIMARY KEY uniquely identifies a row, FOREIGN KEY ensures that a value refers to an existing row in another table, UNIQUE prevents duplicate values, NOT NULL prevents missing values, CHECK enforces a condition, and DEFAULT provides a value automatically when no value is given.
A JOIN is used to combine data from related tables. An INNER JOIN returns only rows where a matching row exists in both tables, while a LEFT JOIN keeps all rows from the left table even if there is no matching row on the right.
NULL represents a missing or unknown value. NULL cannot be compared using =. To check for it, we use IS NULL. COALESCE can be used to provide another value when a value is NULL. NULLS LAST can be used when sorting so that rows with missing timestamps appear at the end.
A transaction groups multiple database operations together. BEGIN starts a transaction, COMMIT permanently saves the changes, and ROLLBACK cancels the changes. A transaction is atomic, meaning either all the operations happen or none of them happen.

### What confused me / still unclear
The main thing I found confusing was why NULL cannot be compared using =. I also needed to understand the difference between INNER JOIN and LEFT JOIN.

### What broke and how I fixed it (error message, cause, fix)
No major errors. I intentionally broke database constraints such as inserting duplicate values, a NULL into a NOT NULL column, and an invalid foreign key to understand the errors produced by PostgreSQL.

### Commits and links
No new commit/links for today.

### First step for tomorrow
Start Day 12 — SQL 3: aggregation, GROUP BY, HAVING, and window functions.
