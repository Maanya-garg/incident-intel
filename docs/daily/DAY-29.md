# Day 29 — JavaScript and TypeScript essentials

**Week 5** · **Phase P4: Thin frontend and Python** · **Blueprint:** Phase 4b: Thin frontend slice

**Planned:** 5 h (Learn 3.5 · Build and test 1 · Document 0.5) · **Suggested date:** 2026-11-18 (Wed). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
You can read and write modern JavaScript and basic TypeScript types.

## ❓ Why this matters for the project
The frontend is Next.js + React + TypeScript. React is JavaScript, so we learn the language first. Learn only what the thin slice needs.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| JavaScript: variables, functions, arrow functions, objects, arrays, destructuring, modules | javascript.info, 'The JavaScript language': Fundamentals and Data types | Skip prototypes, generators and browser internals for now. |
| Promises, async/await, `fetch` | javascript.info: Promises, async/await; MDN: Using the Fetch API | This is how the UI calls your backend. |
| TypeScript basics: types, interfaces, unions, `string | null` | typescriptlang.org/docs/handbook: The Basics, Everyday Types | Skip advanced generics, decorators and namespaces. |
| Node.js LTS and npm | nodejs.org | Install the current LTS. |

## 🔨 Build / do
- [ ] Install Node LTS. Create `playground/js/` with a script that calls the GitHub API with `fetch` and prints three fields.
- [ ] Write TypeScript interfaces for your backend DTOs: `LoginRequest`, `Project`, `LogEntry` (with `timestamp: string | null`).
- [ ] Write a function with `async/await` and `try/catch` that handles a failed response.

## ✅ Check yourself (answer in your own words in the notes below)
1. `let`, `const`: when do you use each?
2. What does `async/await` do compared with `.then()`?
3. Why does `timestamp: string | null` force you to handle missing timestamps in the UI?

## 🏁 Definition of done
- [ ] Scripts run with Node
- [ ] Types compile with `tsc`
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`chore(playground): javascript and typescript exercises`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-29)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
