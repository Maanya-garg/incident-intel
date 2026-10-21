# Day 11 — SQL 2: constraints, foreign keys, joins, NULL, transactions

**Week 2** · **Phase P1: Environment and skeleton (Docker, SQL, design docs)** · **Blueprint:** Phase 1: Skeleton

**Planned:** 5 h (Learn 2.5 · Build and test 2 · Document 0.5) · **Suggested date:** 2026-10-31 (Sat). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

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
- [ ] Create `log_files` and `log_entries` sample tables with foreign keys and a UNIQUE(project_id, content_hash).
- [ ] Insert entries with and without timestamps. Query with `ORDER BY timestamp NULLS LAST`.
- [ ] Break each rule on purpose (duplicate, null, bad foreign key) and read each error message.
- [ ] Do a transaction that inserts two rows, then ROLLBACK, and show nothing was saved.

## ✅ Check yourself (answer in your own words in the notes below)
1. Why is `WHERE ts = NULL` always wrong?
2. What does a foreign key protect you from?
3. When would a left join return a row that an inner join drops?
4. What does 'atomic' mean for a transaction?

## 🎤 Interview question this prepares
NULL semantics in SQL and why `= NULL` fails.

## 🏁 Definition of done
- [ ] Every broken rule produced the error you expected
- [ ] Rollback demo works
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`chore(playground): constraints, joins, null and transactions`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-11)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
