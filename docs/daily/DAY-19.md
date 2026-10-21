# Day 19 — Spring Security 2: JWT login and request filter

**Week 3** · **Phase P2: Spring Boot and authentication** · **Blueprint:** Phase 2: Auth

**Planned:** 6 h (Learn 3 · Build and test 2.5 · Document 0.5) · **Suggested date:** 2026-11-08 (Sun). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
`POST /api/auth/login` returns a JWT, and a filter validates it on every protected request.

## ❓ Why this matters for the project
Every project, log, incident and feedback call will depend on knowing who the caller is.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| JWT structure: header, payload, signature; claims `sub`, `iat`, `exp` | jwt.io introduction, then the docs of your JWT library (for example jjwt) | Do not put sensitive data in the payload: it is only encoded, not encrypted. |
| `OncePerRequestFilter` and populating the SecurityContext | Spring Security reference, Authentication Architecture | We write the filter by hand to learn how it works. Later you may swap to Spring's built-in resource-server support. |

## 🔨 Build / do
- [ ] Add the JWT library. Create `JwtService`: `generateToken(user)` and `validate(token)`. Secret from env var (at least 32 random characters), expiry short (for example 30 to 60 minutes).
- [ ] Implement login: check email and password with BCrypt, return `{token}`. Wrong credentials return the same generic 401 message for unknown email and wrong password.
- [ ] Implement `JwtAuthFilter`: read `Authorization: Bearer ...`, validate signature and expiry, set the authenticated user.
- [ ] Add `GET /api/me` that returns the current user's email and test it with a real token.

## ✅ Check yourself (answer in your own words in the notes below)
1. Why can anyone read a JWT payload, and why is it still safe?
2. What makes a token 'forged' vs 'expired', and how does the server detect each?
3. Why does login return the same error for an unknown email and a wrong password?

## 🏁 Definition of done
- [ ] Login returns a token
- [ ] `/api/me` works with it and returns 401 without it
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`feat(backend): jwt login and authentication filter`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-19)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
