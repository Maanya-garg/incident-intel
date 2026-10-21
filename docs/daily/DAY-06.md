# Day 06 — Java 4: exceptions, regex, files, JUnit, Maven. Build a mini parser

**Week 1** · **Phase P0: Foundations (Git, HTTP, Java)** · **Blueprint:** Preparation (not in blueprint)

**Planned:** 5.5 h (Learn 2.5 · Build and test 2.5 · Document 0.5) · **Suggested date:** 2026-10-26 (Mon). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
A tiny Java project reads a sample log, parses three formats with regex, never crashes on bad lines, and has 8 passing tests.

## ❓ Why this matters for the project
This mini project is the real parser rules from blueprint 5.2 in miniature: never invent a timestamp, unknown level becomes UNKNOWN, keep the raw line, a bad line never crashes the file.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| Exceptions, try/catch, try-with-resources | dev.java/learn: Exceptions | Skip custom checked exception hierarchies. |
| Regex in Java: Pattern, Matcher, groups, named groups | dev.java/learn or Javadoc for `java.util.regex.Pattern`; practice on regex101.com | Avoid nested quantifiers like `(a+)+` (they can freeze on bad input). |
| Reading files, UTF-8 | dev.java/learn: Files and Path | Use `Files.newBufferedReader`. |
| JUnit 5 and Maven basics | junit.org/junit5 user guide (Writing tests) and maven.apache.org 'Maven in 5 minutes' | Only: project layout, `pom.xml` dependencies, `mvn test`. |
| The IntelliJ debugger: breakpoints, stepping, watching variables | JetBrains IntelliJ IDEA docs: Debug code | Only breakpoint, step over, step into, resume, evaluate expression. |

## 🔨 Build / do
- [ ] Create `playground/java-mini-parser/` as a Maven project.
- [ ] Add `sample.log` with 30 lines: 3 formats (space style, bracket style, JSON-ish), 2 lines with unknown levels, 2 lines with no timestamp, 1 empty line and 1 garbage line.
- [ ] Parse each line to `LogLine`. Missing timestamp is `null`. Unknown level is `UNKNOWN`. Keep `raw`. A bad line produces a flagged entry, not an exception.
- [ ] Write 8 JUnit tests, one per rule above plus one for each format.
- [ ] Run `mvn test` until it is green.
- [ ] Debug your mini parser: put a breakpoint inside the regex parsing method and step through a bad line. Do this whenever a test fails from now on, before adding print statements.

## ✅ Check yourself (answer in your own words in the notes below)
1. Checked vs unchecked exceptions: what is the difference?
2. What does a capturing group do in a regex?
3. Why must a malformed line never crash the whole file?
4. What is a unit test and what does 'green' mean?

## 🎤 Interview question this prepares
How do you handle malformed input robustly?

## 🏁 Definition of done
- [ ] `mvn test` is green with at least 8 tests
- [ ] Your mini parser handles the garbage line without an exception
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`feat(playground): mini log parser with regex and JUnit tests`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-06)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
