# Day 18 — Spring Security 1: authentication vs authorization, filter chain

**Week 3** · **Phase P2: Spring Boot and authentication** · **Blueprint:** Phase 2: Auth

**Planned:** 5 h (Learn 3 · Build and test 1.5 · Document 0.5) · **Suggested date:** 2026-11-07 (Sat). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
The API is locked down by default: only health, Swagger and auth endpoints are public, and unauthenticated calls get 401 JSON.

## ❓ Why this matters for the project
You cannot protect uploads, incidents or analyses until you understand how Spring Security sits in front of every request.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| Authentication vs authorization; stateless tokens vs sessions | jwt.io 'Introduction to JSON Web Tokens' and the Spring Security reference, 'Architecture' page | Read concepts only. Do not read the full reference. |
| SecurityFilterChain, SecurityContext, CORS and CSRF (and why CSRF is off for stateless token APIs) | Spring Security reference: Servlet Applications, Architecture, CSRF page | Be careful: many blog tutorials use removed APIs (for example `WebSecurityConfigurerAdapter`). Prefer the official reference for your version. |

## 🔨 Build / do
- [ ] Add a `SecurityConfig` with a `SecurityFilterChain` bean: permit `/api/auth/**`, `/api/health`, Swagger paths; everything else authenticated; stateless sessions.
- [ ] Return a JSON 401 (not an HTML page) for unauthenticated requests.
- [ ] Test with curl: no token gives 401, `/api/health` gives 200.
- [ ] Write ADR 0002: 'Stateless JWT authentication' (one page: decision, alternatives, consequences).

## ✅ Check yourself (answer in your own words in the notes below)
1. What is the difference between authentication and authorization?
2. What is a filter chain and where does your JWT check go in it?
3. Why is CSRF protection usually disabled for a token-in-header API, and what is the trade-off?

## 🎤 Interview question this prepares
Authentication vs authorization, with an example from your API.

## 🏁 Definition of done
- [ ] Protected endpoints return 401 without a token
- [ ] ADR 0002 committed
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`feat(backend): security filter chain with stateless config`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-18)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
