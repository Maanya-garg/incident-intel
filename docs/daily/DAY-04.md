# Day 04 — Java 2: classes, objects, interfaces, polymorphism

**Week 1** · **Phase P0: Foundations (Git, HTTP, Java)** · **Blueprint:** Preparation (not in blueprint)

**Planned:** 5 h (Learn 2.5 · Build and test 2 · Document 0.5) · **Suggested date:** 2026-10-24 (Sat). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
You can model a log line as a class and define an interface with two implementations.

## ❓ Why this matters for the project
Blueprint section 5.2 uses a `LogParser` interface with many implementations (the strategy pattern). That is only possible if you understand interfaces and polymorphism.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| Classes, objects, constructors, fields, `private`, getters | java-programming.mooc.fi chapters on objects and classes (find them by title) | Skip inheritance hierarchies deeper than one level. |
| Interfaces and polymorphism | java-programming.mooc.fi chapters on interfaces and polymorphism | Skip abstract class details. Interfaces matter more here. |
| `record` (compact data classes) and `enum` | dev.java/learn: Records, Enums | You will use records for DTOs all project long. |

## 🔨 Build / do
- [ ] In `playground/java-oop/`: create a `LogLevel` enum (TRACE, DEBUG, INFO, WARN, ERROR, FATAL, UNKNOWN).
- [ ] Create a `record LogLine(int lineNumber, Instant timestamp, LogLevel level, String service, String message, String raw)`. Note: `timestamp` may be null.
- [ ] Create `interface LogParser { Optional<LogLine> parse(String line, int lineNumber); }` and two implementations: `SpaceSeparatedParser` for `2026-10-19 10:20:31 ERROR DB connection timeout` and `BracketParser` for `[ERROR] 10:20:31 - Connection refused`.
- [ ] In `main`, put both parsers in a `List<LogParser>` and try each on 6 sample lines.

## ✅ Check yourself (answer in your own words in the notes below)
1. What is the difference between a class and an interface?
2. Why are fields `private`? What problem does that solve?
3. What does `List<LogParser>` let you do that two separate variables would not?
4. Why is `Optional` a better return type than returning `null`?

## 🎤 Interview question this prepares
Explain the strategy pattern with an example from your own project.

## 🏁 Definition of done
- [ ] Both parsers parse their own format and return `Optional.empty()` for the other
- [ ] You can explain what a record is
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`chore(playground): LogLine record and LogParser interface`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-04)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
