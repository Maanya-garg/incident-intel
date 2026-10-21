# Day 16 — JPA, Hibernate and Flyway: the users table

**Week 3** · **Phase P2: Spring Boot and authentication** · **Blueprint:** Phase 2: Auth

**Planned:** 5 h (Learn 2.5 · Build and test 2 · Document 0.5) · **Suggested date:** 2026-11-05 (Thu). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
A hand-written Flyway migration creates `users`, and a JPA entity and repository can save and find a user.

## ❓ Why this matters for the project
The blueprint wants SQL you write and review yourself, so schema comes from Flyway migrations. JPA only maps rows to objects, it never creates tables.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| ORM idea, entity, repository | spring.io/guides 'Accessing Data with JPA' | Skip Specifications and QueryDSL. |
| Flyway migrations: naming and ordering | Flyway documentation (Redgate) 'Migrations' and the Spring Boot Flyway section | Never edit an applied migration. Add a new one. |
| `ddl-auto: validate` | Spring Boot docs: Database Initialization | Why `update` or `create` are dangerous. |

## 🔨 Build / do
- [ ] Write `V1__create_users.sql` exactly from blueprint section 7: id, email UNIQUE NOT NULL, password_hash, created_at.
- [ ] Create entity `User` and `UserRepository` (extends JpaRepository). Add `findByEmail`.
- [ ] Set `spring.jpa.hibernate.ddl-auto=validate`. Start the app and see Flyway apply the migration.
- [ ] Write a repository test (use whatever works now, we switch to Testcontainers on Day 23) that saves and finds a user.

## ✅ Check yourself (answer in your own words in the notes below)
1. Why hand-write SQL migrations instead of letting Hibernate generate the schema?
2. What does `validate` do when the entity and table disagree?
3. Why enforce unique email in the database and not only in Java?

## 🏁 Definition of done
- [ ] Flyway ran `V1` and created the table
- [ ] Repository test passes
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`feat(backend): flyway V1 users table and user repository`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-16)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
