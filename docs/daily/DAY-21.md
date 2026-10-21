# Day 21 — Weekly review 3 and buffer. Tag v0.2

**Week 3** · **Phase P2: Spring Boot and authentication** · **Blueprint:** Phase 2: Auth

**Planned:** 4 h (Review and fix 2.5 · Weekly extras and practice 1 · Document 0.5) · **Suggested date:** 2026-11-10 (Tue). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

> 🏷️ **Milestone:** at the end of today, tag `v0.2-auth` (`git tag v0.2-auth && git push --tags`).

## 🎯 Goal for today
Auth is done, tested and documented. Clean up before the data features begin.

## ❓ Why this matters for the project
Auth is where beginners get stuck most. Use this day to revisit any step you copied without understanding.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| Self-quiz | Your notes | Rewrite JwtService from memory. |

## 🔨 Build / do
- [ ] Explain the login flow from curl to filter to controller on paper (draw it).
- [ ] Fix failing or skipped tests. Remove dead code.
- [ ] Create `docs/weekly/WEEK-03.md` and update progress.
- [ ] **Weekly extra 1 (30 min), practise outside the project:** Exercism Java track: 2 to 3 easy exercises.
- [ ] **Weekly extra 2 (20 min), read other people's code:** the Spring PetClinic sample (github.com/spring-projects/spring-petclinic): read one controller, one service or repository.
- [ ] **Weekly extra 3 (10 min), explain it out loud:** record a voice note (or talk to a rubber duck) explaining this week's work from memory. Wherever you stumble, you have not understood it yet. Add those spots to the notes.
- [ ] Merge this week's branch into `main` with a pull request (read your own diff before merging).

## ✅ Check yourself (answer in your own words in the notes below)
1. Walk through: register, login, protected call. Where is each check?
2. Why BCrypt for passwords but JWT signing for tokens?

## 🏁 Definition of done
- [ ] Weekly summary written
- [ ] Tag pushed
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`docs: weekly review 3`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-21)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow

### Weekly summary (also copy into `docs/weekly/WEEK-03.md`)
- 5 things I learned this week:
- 3 things that are still unclear:
- Hours: planned vs actual:
- One thing I would do differently next week:
