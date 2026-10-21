# Day 10 — SQL 1: tables, types, INSERT, SELECT, WHERE

**Week 2** · **Phase P1: Environment and skeleton (Docker, SQL, design docs)** · **Blueprint:** Phase 1: Skeleton

**Planned:** 5 h (Learn 2.5 · Build and test 2 · Document 0.5) · **Suggested date:** 2026-10-30 (Fri). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

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
- [ ] Start Compose, open psql, create a scratch database `playground`.
- [ ] Create `users` and `projects` tables by hand with primary keys and `created_at TIMESTAMPTZ DEFAULT now()`.
- [ ] Insert 3 users and 5 projects. Write 15 queries: filter by owner, newest 2 projects, count per owner (just try), update a name, delete one row.
- [ ] Save everything to `playground/sql/01_basics.sql`.

## ✅ Check yourself (answer in your own words in the notes below)
1. What is a primary key and why does every table need one?
2. TIMESTAMP vs TIMESTAMPTZ: which one for logs and why?
3. What does `LIMIT 2` without `ORDER BY` give you?

## 🏁 Definition of done
- [ ] 01_basics.sql runs from top to bottom without errors
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`chore(playground): sql basics`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-10)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
