# Day 25 — Parser strategies, part 1: the normalized model and two regex parsers

**Week 4** · **Phase P3: Projects, safe upload and parsing** · **Blueprint:** Phases 3 and 4

**Planned:** 5 h (Learn 2 · Build and test 2.5 · Document 0.5) · **Suggested date:** 2026-11-14 (Sat). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
A `LogParser` interface with two regex parsers, driven by tests written first.

## ❓ Why this matters for the project
Different apps log differently. Every later step (grouping, incidents, timeline) assumes one common structure, so the parser layer must be right.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| Strategy pattern in Spring (injecting a `List<LogParser>`) | Spring Framework reference: collections injection; your Day 4 playground code | You already built this in miniature. |
| Regex: named groups, anchoring, avoiding ReDoS | OWASP: Regular expression Denial of Service; regex101.com | Compile patterns once as constants. Cap line length before matching. |

## 🔨 Build / do
- [ ] Write the tests first (examples from blueprint 5.2), then implement `SpaceTimestampLevelParser` and `BracketParser`.
- [ ] Normalized `ParsedLine`: timestamp (nullable), level (enum), service (nullable), message, rawMessage, lineNumber.
- [ ] Rules (from the blueprint, never break): never invent a timestamp; unknown level is UNKNOWN; always keep raw; malformed line never crashes.
- [ ] Decision to document: a line like `[ERROR] 10:20:31 - ...` has a time but no date. Recommended: keep the timestamp NULL and note the limitation. Write it in ADR 0005.

## ✅ Check yourself (answer in your own words in the notes below)
1. Why write tests before the parser?
2. What would happen if you invented the date for a time-only line?
3. What is ReDoS?

## 🏁 Definition of done
- [ ] Both parsers pass their tests
- [ ] ADR 0005 written
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`feat(backend): log parser interface with two regex parsers`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-25)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
