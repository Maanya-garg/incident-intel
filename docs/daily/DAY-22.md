# Day 22 — Projects: CRUD and REST design

**Week 4** · **Phase P3: Projects, safe upload and parsing** · **Blueprint:** Phases 3 and 4

**Planned:** 5 h (Learn 2 · Build and test 2.5 · Document 0.5) · **Suggested date:** 2026-11-11 (Wed). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
Authenticated users can create, list and view their own projects.

## ❓ Why this matters for the project
A project is the ownership root for all data: log files, entries, incidents. Everything later is filtered by `project_id`.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| REST resource design, status codes (201 + Location), pagination idea | Microsoft REST API guidelines (short 'resource' parts) or any REST design article | Plural nouns, no verbs in URLs. |
| Getting the current user in Spring | Spring Security reference: `@AuthenticationPrincipal` | Take the user id from the token, never from the request body. |

## 🔨 Build / do
- [ ] Write `V2__create_projects.sql` (id, owner_id referencing users, name, description, created_at).
- [ ] Entity, repository, service, DTOs (records) with validation.
- [ ] Endpoints: `POST /api/projects` (201), `GET /api/projects` (only mine), `GET /api/projects/{id}`.
- [ ] Use a numeric BIGINT identity id. Note the decision in ADR 0003 (one paragraph, including why you did not use UUIDs).

## ✅ Check yourself (answer in your own words in the notes below)
1. Why take `owner_id` from the token and not from the JSON body?
2. What does 201 plus a Location header tell the client?
3. Why use DTOs for responses?

## 🏁 Definition of done
- [ ] Create/list/get work in Swagger
- [ ] Two users see only their own projects
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`feat(backend): projects CRUD with flyway V2`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-22)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
