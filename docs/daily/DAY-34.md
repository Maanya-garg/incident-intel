# Day 34 — Python essentials

**Week 5** · **Phase P4: Thin frontend and Python** · **Blueprint:** Phase 4b: Thin frontend slice

**Planned:** 5 h (Learn 3 · Build and test 1.5 · Document 0.5) · **Suggested date:** 2026-11-23 (Mon). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
You can write Python functions, classes and dataclasses, use a virtual environment, and run pytest.

## ❓ Why this matters for the project
The synthetic data generator, the AI service (FastAPI) and the evaluation scripts are all Python.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| Python syntax, functions, lists, dicts, comprehensions, classes, dataclasses, type hints | docs.python.org/3/tutorial (chapters 3 to 9, skim chapter 6 modules) | Skip async and metaclasses for now. |
| Virtual environments and pip | docs.python.org/3/tutorial/venv.html | One venv per folder: `datagen/`, `ai-service/`, `eval/`. |
| pytest | docs.pytest.org Get Started | Plain `assert` tests and fixtures only. |
| Seeded randomness | Python docs for `random.Random(seed)` | Same seed must give identical output every time. |

## 🔨 Build / do
- [ ] Create `datagen/` with a venv. Install pytest.
- [ ] Write a function that produces 100 plain log lines with a seeded `random.Random`.
- [ ] Write a test proving the same seed gives identical output and a different seed differs.
- [ ] Write a dataclass `LogEvent` and serialise it to a JSON line.
- [ ] Try the Python debugger: run one test in VS Code (or `breakpoint()`), step through your generator function.

## ✅ Check yourself (answer in your own words in the notes below)
1. Why use `random.Random(seed)` and not the global `random`?
2. What is a virtual environment and why do you need one?
3. What does a dataclass give you?

## 🏁 Definition of done
- [ ] Reproducibility test passes
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`feat(datagen): python skeleton with seeded generator test`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-34)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
