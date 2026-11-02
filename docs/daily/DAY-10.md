# Day 10 — SQL 1: tables, types, INSERT, SELECT, WHERE

**Week 2** · **Phase P1: Environment and skeleton (Docker, SQL, design docs)** 

**Planned:** 5 h (Learn 2.5 · Build and test 2 · Document 0.5) 

**Status:** ✅ 

## 🎯 Goal for today
You can create tables and read and write rows by hand in psql.

## ❓ Why this matters for the project
Every feature stores or queries data. The blueprint hand-writes SQL (Flyway migrations), so you must be able to read and write SQL, not just use an ORM.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| Relational model, tables, rows, primary key | SQLBolt (sqlbolt.com) lessons on SELECT queries; postgresqltutorial.com 'PostgreSQL Tutorial' basics | Skip window functions and stored procedures for now. |
| Data types: INT, BIGINT, TEXT, TIMESTAMPTZ, BOOLEAN, JSONB | postgresql.org/docs, chapter 'Data Types' | Skim. You will see each of these in the schema. |
| INSERT, SELECT, WHERE, ORDER BY, LIMIT, UPDATE, DELETE | SQLBolt and postgresqltutorial.com | Do the interactive exercises. |

## 🔨 Build / do
- [✓] Start Compose, open psql, create a scratch database `playground`.
- [✓] Create `users` and `projects` tables by hand with primary keys and `created_at TIMESTAMPTZ DEFAULT now()`.
- [✓] Insert 3 users and 5 projects. Write 15 queries: filter by owner, newest 2 projects, count per owner (just try), update a name, delete one row.
- [✓] Save everything to `playground/sql/01_basics.sql`.

## 🏁 Definition of done
- [✓] 01_basics.sql runs from top to bottom without errors
- [✓] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`chore(playground): sql basics`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-10)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** 30-10-26 &nbsp;&nbsp; **Actual hours:** 4 &nbsp;&nbsp; **Plan followed?** yes 

### What I learned (explain it as if to a friend, in my own words)
- A table is like a sheet, a column has a fixed name and type, and a row is
  one record. A primary key is the column that makes every row unique.
- I made a separate database `playground` for practice, so the project
  database `incident_intel` stays safe.
- I created `users` and `projects` by hand. `id` is a BIGINT primary key that
  Postgres fills itself (GENERATED ALWAYS AS IDENTITY), and `created_at` is
  TIMESTAMPTZ with DEFAULT now().
- I inserted 3 users and 5 projects. Text goes in single quotes. I set
  `created_at` by hand for the projects, because now() gives the same time to
  all rows of one INSERT, and then "newest 2" would mean nothing.
- I ran 15 queries: SELECT with WHERE, AND, ORDER BY ... DESC, LIMIT, a first
  try of COUNT with GROUP BY, then UPDATE and DELETE.
- UPDATE and DELETE must always have a WHERE. Without it they change or delete
  every row.
- I saved everything in `playground/sql/01_basics.sql`. It starts with
  DROP TABLE IF EXISTS, so I can run it again from the top. I ran it with
  `psql -d playground -v ON_ERROR_STOP=1 < file`, so it stops at the first error.

### What confused me / still unclear
The main thing I needed to understand was why TIMESTAMPTZ is preferred for logs and why LIMIT without ORDER BY does not guarantee which rows are returned.

### What broke and how I fixed it (error message, cause, fix)
- Problem: my Day 9 `git push` was rejected, and `git status` said the branches
  had diverged (1 and 9 different commits).
  Cause: I edited my notes on the GitHub website, so GitHub had commits my
  computer did not have.
  Fix: `git fetch`, checked that no file was changed on both sides, then
  `git pull --no-rebase --no-edit` (a merge commit) and `git push`.
  Lesson: after editing on GitHub, run `git pull` on the computer before
  working there.
- Finding: `01_basics.sql` did not show in `git status`. `git check-ignore -v`
  showed `.git/info/exclude` line 8: `/playground/`.


### Commits and links
- No new commit for the SQL file: I decided to keep `playground/` local-only
  (it is in `.git/info/exclude`), so `01_basics.sql` stays on my computer.
- Git fix: merge commit f0f365c, pushed to GitHub.
  
### First step for tomorrow
- Day 11: SQL 2, constraints, foreign keys, joins, NULL and transactions,
  using the `playground` database.
