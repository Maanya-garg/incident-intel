# Day 31 — Next.js app: login page, CORS and token storage decision

**Week 5** · **Phase P4: Thin frontend and Python** · **Blueprint:** Phase 4b: Thin frontend slice

**Planned:** 5.5 h (Learn 3 · Build and test 2 · Document 0.5) · **Suggested date:** 2026-11-20 (Fri). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
A Next.js app (TypeScript + Tailwind) with a working login page that calls your backend.

## ❓ Why this matters for the project
This is the blueprint's 'Phase 4b thin slice'. It catches CORS, header and multipart problems early, long before the full UI.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| Next.js App Router basics: routes, layouts, `use client` | nextjs.org/learn (the dashboard app course, the first chapters) | Beginner tip: mark pages `use client` and call the API from the browser. That matches the REST + JWT diagram in the blueprint. |
| Tailwind utility classes | tailwindcss.com/docs: core concepts | Do not design. Keep it clean and plain. |
| CORS | MDN: Cross-Origin Resource Sharing (CORS) | Understand why the browser blocks the call and what header fixes it. |
| Browser developer tools: Network and Console tabs | MDN: What are browser developer tools; Chrome DevTools docs: Network features reference | Look at the request, its headers, status and response, and the CORS error in the Console. |

## 🔨 Build / do
- [ ] Run `create-next-app` in `frontend/` with TypeScript and Tailwind. Run it.
- [ ] Configure CORS in Spring to allow only the frontend origin (not `*`).
- [ ] Build the login page and an `api.ts` wrapper that adds `Authorization: Bearer` and handles 401 by redirecting to login.
- [ ] Decide token storage: localStorage (simple, readable by XSS) vs httpOnly cookie (safer, needs CSRF handling). V1 default: localStorage. Write ADR 0006 with the trade-off.
- [ ] Open the Network tab for your login call. Find the request headers, the response and the exact CORS error when you break the config on purpose. Whenever the UI misbehaves, look here first.

## ✅ Check yourself (answer in your own words in the notes below)
1. What does the browser do when CORS is missing?
2. Why is localStorage riskier than an httpOnly cookie, and why is it still acceptable for V1 here?
3. What does `use client` mean?

## 🏁 Definition of done
- [ ] Login works from the browser
- [ ] CORS only allows your frontend
- [ ] ADR 0006 written
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`feat(frontend): next.js app with login and cors config`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-31)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
