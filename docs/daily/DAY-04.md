# Day 04 — Java 2: classes, objects, interfaces, polymorphism

**Week 1** · **Phase P0: Foundations (Git, HTTP, Java)** 

**Planned:** 5 h (Learn 2.5 · Build and test 2 · Document 0.5) 

**Status:** ✅ 

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
- [✓] In `playground/java-oop/`: create a `LogLevel` enum (TRACE, DEBUG, INFO, WARN, ERROR, FATAL, UNKNOWN).
- [✓] Create a `record LogLine(int lineNumber, Instant timestamp, LogLevel level, String service, String message, String raw)`. Note: `timestamp` may be null.
- [✓] Create `interface LogParser { Optional<LogLine> parse(String line, int lineNumber); }` and two implementations: `SpaceSeparatedParser` for `2026-10-19 10:20:31 ERROR DB connection timeout` and `BracketParser` for `[ERROR] 10:20:31 - Connection refused`.
- [✓] In `main`, put both parsers in a `List<LogParser>` and try each on 6 sample lines.

## 🏁 Definition of done
- [✓] Both parsers parse their own format and return `Optional.empty()` for the other
- [✓] You can explain what a record is
- [✓] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`chore(playground): LogLine record and LogParser interface`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-04)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** 24-10-26 &nbsp;&nbsp; **Actual hours:** 3 &nbsp;&nbsp; **Plan followed?** yes 

### What I learned (explain it as if to a friend, in my own words)
I modelled a log line with three Java tools. An enum (`LogLevel`) is a type whose value can only be one of a fixed list, so a typo like "EROR" cannot compile. A record (`LogLine`) is a compact data class: I list the fields once and Java generates the constructor, getters like `line.level()`, `equals` and `toString`; its fields are private and cannot change after creation. An interface (`LogParser`) is a contract with one method, `Optional<LogLine> parse(String line, int lineNumber)`, and each parser implements it in its own way. I built `SpaceSeparatedParser`, `BracketParser` and a `FallbackParser`, put them in a `List<LogParser>` and tried them in order on 6 sample lines; the first parser that returns a value wins. This is the strategy pattern from Blueprint 5.2. A missing timestamp stays `null`: I never use `Instant.now()`, because the log happened at some other time and a made-up time would break the timeline.

### What confused me / still unclear
I did not read the planned sources (Helsinki MOOC chapters, dev.java records and enums). `SpaceSeparatedParser` assumes the time is UTC (I add a "Z"); if real logs use another time zone the time will be off, so timezone handling is a decision for later (the timeline step). The `try/catch` in `SpaceSeparatedParser` is new to me and comes properly on Day 6.

### What broke and how I fixed it (error message, cause, fix)
- `LogLevel.valueOf("warn")` throws `IllegalArgumentException` because `valueOf` is case-sensitive and needs the exact name. Fix: my own `toLevel(...)` helper compares the text with each enum name and returns `UNKNOWN` when nothing matches.
- A level text that is not in the enum (like NOTICE) must not reject the whole line. The line has a valid structure, so it is kept with level UNKNOWN and the raw line stays intact.
- Order matters in the parser list: `FallbackParser` never returns empty, so if it were first, every line would become UNKNOWN and the real parsers would never run.

### Commits and links
- The code lives in `playground/java-oop/`, which is local only and not pushed.

### First step for tomorrow
Day 5: collections, generics, streams, and time (`Instant` vs `LocalDateTime`).
