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
SQL is used to store and retrieve data from relational databases. Tables contain rows and columns, and a primary key uniquely identifies each row.
INSERT adds data, SELECT reads data, WHERE filters data, ORDER BY sorts data, LIMIT limits the number of rows, UPDATE changes data, and DELETE removes data.
I learned basic data types like INT, BIGINT, TEXT, BOOLEAN, TIMESTAMPTZ, and JSONB. TIMESTAMPTZ is useful for logs because it stores timezone-aware timestamps.

### What confused me / still unclear
The main thing I needed to understand was why TIMESTAMPTZ is preferred for logs and why LIMIT without ORDER BY does not guarantee which rows are returned.

### What broke and how I fixed it (error message, cause, fix)
No major errors.

### Commits and links
notes for today committed
### First step for tomorrow
Day 11:Continue with the next SQL topic and practice queries.
