# Day 28 — Weekly review 4: parser edge-case sweep. Tag v0.3

**Week 4** · **Phase P3: Projects, safe upload and parsing** · **Blueprint:** Phases 3 and 4

**Planned:** 5 h (Review and fix 3.5 · Weekly extras and practice 1 · Document 0.5) · **Suggested date:** 2026-11-17 (Tue). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

> 🏷️ **Milestone:** at the end of today, tag `v0.3-upload-parse` (`git tag v0.3-upload-parse && git push --tags`).

## 🎯 Goal for today
Prove the parser pipeline against every edge case in blueprint section 13, then tag.

## ❓ Why this matters for the project
The parser is the foundation: bad parsing poisons grouping, incidents and the AI analysis.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| Real-world sample logs | LogHub (github.com/logpai/loghub) | Check each dataset's license and terms before using or redistributing. Do not commit data you are not allowed to share. |

## 🔨 Build / do
- [ ] Write tests for: empty file, extremely long line, binary or unusual encoding, malformed lines, huge file limits, duplicate upload.
- [ ] Run your parser on one or two real LogHub files (locally, do not commit them) and note what breaks.
- [ ] Write the 'Supported formats' section in the README (do not claim universal support).
- [ ] `docs/weekly/WEEK-04.md`, update progress, add a line to `docs/evaluation-spec.md` for the parsing metric: percent of lines with correct timestamp, level and service (a truly absent timestamp that stays NULL counts as correct).
- [ ] **Weekly extra 1 (30 min), practise outside the project:** Exercism Java track: 2 to 3 easy exercises.
- [ ] **Weekly extra 2 (20 min), read other people's code:** Spring PetClinic again: how are tests organised and how are validation errors handled?.
- [ ] **Weekly extra 3 (10 min), explain it out loud:** record a voice note (or talk to a rubber duck) explaining this week's work from memory. Wherever you stumble, you have not understood it yet. Add those spots to the notes.
- [ ] Merge this week's branch into `main` with a pull request (read your own diff before merging).

## ✅ Check yourself (answer in your own words in the notes below)
1. List the five parser rules from memory.
2. Why do we document the supported formats instead of claiming all formats?

## 🏁 Definition of done
- [ ] Edge-case tests green
- [ ] README lists the supported formats
- [ ] Tag pushed
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`test(backend): parser edge cases and docs`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-28)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow

### Weekly summary (also copy into `docs/weekly/WEEK-04.md`)
- 5 things I learned this week:
- 3 things that are still unclear:
- Hours: planned vs actual:
- One thing I would do differently next week:
