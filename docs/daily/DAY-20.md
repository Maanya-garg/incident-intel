# Day 20 — Security tests: forged, expired, missing tokens

**Week 3** · **Phase P2: Spring Boot and authentication** · **Blueprint:** Phase 2: Auth

**Planned:** 5 h (Learn 2 · Build and test 2.5 · Document 0.5) · **Suggested date:** 2026-11-09 (Mon). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
Automated tests prove the security rules from blueprint section 9 for authentication.

## ❓ Why this matters for the project
Security you did not test is security you do not have. These tests also become your interview evidence.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| Spring Security Test and MockMvc | Spring Security reference: Testing | Only `MockMvc` with and without a token. Skip method-security testing for now. |
| OWASP Top 10: Broken Access Control and Authentication failures | owasp.org Top 10 (read the two entries) | Link each risk to something in your project. |

## 🔨 Build / do
- [ ] Write tests: no token gives 401; malformed token gives 401; expired token gives 401; token signed with a different secret gives 401; tampered payload gives 401.
- [ ] Test wrong password gives 401 with a generic message, and short password is rejected at register.
- [ ] Test that Swagger and health stay public.
- [ ] Write down in `docs/security-notes.md` which items of blueprint section 9 are done so far (passwords, JWT).

## ✅ Check yourself (answer in your own words in the notes below)
1. What is the difference between a 401 and a 403 in your API?
2. How do you create an expired token in a test without waiting?
3. Name two attacks these tests protect against.

## 🏁 Definition of done
- [ ] At least 7 security tests pass
- [ ] `security-notes.md` started
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`test(backend): jwt and auth security tests`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-20)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
