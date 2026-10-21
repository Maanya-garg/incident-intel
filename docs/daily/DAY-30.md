# Day 30 — React fundamentals

**Week 5** · **Phase P4: Thin frontend and Python** · **Blueprint:** Phase 4b: Thin frontend slice

**Planned:** 5 h (Learn 3 · Build and test 1.5 · Document 0.5) · **Suggested date:** 2026-11-19 (Thu). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
You can build components with props and state, lists, conditional rendering and controlled inputs.

## ❓ Why this matters for the project
The log table, the project list and the incident page are React components.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| Components, props, JSX, state, lists and keys, conditional rendering, events, controlled inputs | react.dev/learn: Quick Start; Describing the UI; Adding Interactivity; Managing State (first pages) | Skip class components, Redux, and the advanced Escape Hatches pages. You will need `useEffect` only briefly. |

## 🔨 Build / do
- [ ] Create a tiny Vite or Next playground (any). Build `LogRow` (props), `LogTable` (list with keys), a level filter (state and controlled `<select>`).
- [ ] Render null timestamps as 'no timestamp' with a visible style, and highlight `UNKNOWN` levels.
- [ ] Build a search input that filters the list in memory.

## ✅ Check yourself (answer in your own words in the notes below)
1. What is the difference between props and state?
2. Why do list items need a `key`?
3. What makes an input 'controlled'?

## 🏁 Definition of done
- [ ] Your playground table filters correctly and highlights the special cases
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`chore(playground): react components exercise`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-30)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
