# Day 33 — Paginated log table: raw vs parsed, NULL and UNKNOWN highlighting

**Week 5** · **Phase P4: Thin frontend and Python** · **Blueprint:** Phase 4b: Thin frontend slice

**Planned:** 5 h (Learn 2 · Build and test 2.5 · Document 0.5) · **Suggested date:** 2026-11-22 (Sun). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
The UI shows parsed entries next to the raw line, with missing timestamps and unknown levels clearly flagged.

## ❓ Why this matters for the project
This table doubles as a parser debugging tool, and shows honestly what the parser could and could not read.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| Pagination with a cursor in the UI | TanStack Query docs: Paginated Queries | Next/previous using the cursor from the API. |
| Safe rendering: escaping | React docs: JSX escapes by default; MDN XSS overview | Never use `dangerouslySetInnerHTML` for log text: logs are untrusted data. |
| Lint, type check, Vitest + Testing Library | vitest.dev and testing-library.com/docs/react-testing-library/intro | Set up once. Write one component test. |

## 🔨 Build / do
- [ ] Build the log table: line number, parsed timestamp (or 'missing'), level, service, message, and a toggle to show the raw line.
- [ ] Add a level filter and cursor pagination.
- [ ] Add `npm run lint` and `npm run typecheck` scripts and fix warnings.
- [ ] Write one component test (renders a null timestamp as missing). Take a screenshot into `docs/img/`.

## ✅ Check yourself (answer in your own words in the notes below)
1. Why is rendering log text with `dangerouslySetInnerHTML` dangerous?
2. What does the typecheck catch that lint does not?
3. Why show both the raw and parsed fields?

## 🏁 Definition of done
- [ ] Table works with a real uploaded file
- [ ] Lint, typecheck and one test pass
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`feat(frontend): paginated log table with raw/parsed view and tests`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-33)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
