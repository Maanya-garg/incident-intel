# Day 64 — GitHub Actions CI

**Week 10** · **Phase P11: Docker, full stack and CI** · **Blueprint:** Phase 16

**Planned:** 5 h (Learn 2 · Build and test 2.5 · Document 0.5) · **Suggested date:** 2026-12-23 (Wed). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
Every push and pull request builds and tests all three services automatically.

## ❓ Why this matters for the project
A green badge on the README shows that your project is verified by machines, not just by you.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| GitHub Actions workflows | docs.github.com/actions: Quickstart and Workflow syntax (skim) | Only: triggers, jobs, steps, setup actions, caching. |
| Secrets in CI | GitHub Docs: Using secrets | You should not need real secrets. Use test values. |

## 🔨 Build / do
- [ ] `.github/workflows/ci.yml`: checkout, backend build and tests (Testcontainers needs Docker, which hosted runners provide), AI service tests, frontend lint, typecheck and build.
- [ ] Make CI independent of Ollama and of downloading the real model: use a fake provider and mark any slow real-model test so it is skipped in CI.
- [ ] Pin action versions. Cache Maven and npm.
- [ ] Add the status badge to the README and fix red builds.

## ✅ Check yourself (answer in your own words in the notes below)
1. Why must CI not depend on a real LLM?
2. What is the purpose of pinning versions?
3. What do you do when a test passes locally and fails in CI?

## 🏁 Definition of done
- [ ] CI is green on `main`
- [ ] Badge in README
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`ci: github actions for backend, ai-service and frontend`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-64)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
