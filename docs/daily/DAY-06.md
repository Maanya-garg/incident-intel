# Day 06 — Java 4: exceptions, regex, files, JUnit, Maven. Build a mini parser

**Week 1** · **Phase P0: Foundations (Git, HTTP, Java)** 

**Planned:** 5.5 h (Learn 2.5 · Build and test 2.5 · Document 0.5)

**Status:** ✅ 

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
- [✓] Create `playground/java-mini-parser/` as a Maven project.
- [✓] Add `sample.log` with 30 lines: 3 formats (space style, bracket style, JSON-ish), 2 lines with unknown levels, 2 lines with no timestamp, 1 empty line and 1 garbage line.
- [✓] Parse each line to `LogLine`. Missing timestamp is `null`. Unknown level is `UNKNOWN`. Keep `raw`. A bad line produces a flagged entry, not an exception.
- [✓] Write 8 JUnit tests, one per rule above plus one for each format.
- [✓] Run `mvn test` until it is green.
- [✓] Debug your mini parser: put a breakpoint inside the regex parsing method and step through a bad line. Do this whenever a test fails from now on, before adding print statements.

## 🎤 Interview question this prepares
How do you handle malformed input robustly?

## 🏁 Definition of done
- [✓] `mvn test` is green with at least 8 tests
- [✓] Your mini parser handles the garbage line without an exception
- [✓] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`feat(playground): mini log parser with regex and JUnit tests`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-06)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** 26-10-26 &nbsp;&nbsp; **Actual hours:** 3 &nbsp;&nbsp; **Plan followed?** yes

### What I learned (explain it as if to a friend, in my own words)
I built a Maven project (`java-mini-parser`) with JUnit and a mini parser that follows the real parser rules from Blueprint 5.2. Maven reads `pom.xml`, downloads the dependencies, compiles the code and runs the tests; the layout is `src/main/java` and `src/test/java`. I read a 30-line `sample.log` with `Files.newBufferedReader` inside try-with-resources, which closes the file automatically. I replaced the weak `split` approach with regex: `Pattern`, `Matcher` and named capturing groups pull out the date, time, level and message, and `matches()` forces the whole line to fit the pattern. I wrote three parsers (space style, bracket style, JSON-ish) behind the `LogParser` interface and a `MiniParser` that tries them in order. The rules hold: a missing timestamp stays `null` (the bracket style has only a time, so I never guess the date), an unknown level becomes `UNKNOWN`, the raw line is always kept, and a line nobody understands becomes a flagged entry (`malformed=true`) instead of an exception. I wrote 8 JUnit tests, one per rule and format plus one that checks that no line is dropped from the sample file, and ran them with `mvn test` through IntelliJ's Maven panel. I also used the IntelliJ debugger: a breakpoint, Step Over, Evaluate Expression, and I watched a `DateTimeParseException` jump into the `catch`.

### What confused me / still unclear
I did not read the planned sources (dev.java, JUnit user guide, Maven in 5 minutes); I learned by building with guidance. I used JUnit 6 (Jupiter 6.0.3) with Surefire 3.5.5 instead of the "JUnit 5" named in the plan, because it is the current major version and works with Java 21; final versions get pinned on Day 15. Known limits of my mini parser: the JSON-ish parser uses a regex, so a message with escaped quotes (like `"user said \"hi\""`) is cut at the backslash without any error, which is why a real JSON library comes later; the `catch (RuntimeException)` in `MiniParser` is silent, so a real parser bug would stay hidden and I need logging there; the space-style parser assumes UTC; stack-trace lines are not yet attached to the previous entry (Day 26); the regex only checks the shape, not the validity (a time like 99:99:99 passes the regex and fails later in `Instant.parse`).


### What broke and how I fixed it (error message, cause, fix)
- **A line that matched the regex but still blew up:** `2026-10-26 99:99:99 ERROR Invalid time`. The regex checks the shape (two digits, colon, two digits), not whether the time is real, so `Instant.parse` threw a `DateTimeParseException`. Fix: catch it inside the parser and return `Optional.empty()`, so `MiniParser` stores the line as `malformed=true` instead of crashing. I followed this path in the IntelliJ debugger.
- **Known bug I found but did not fix:** the JSON-ish parser uses a regex, so a message with escaped quotes (`"user said \"hi\" and left"`) is cut at the backslash without any error. It stays like this until the real JSON parser on Day 26.
- **Known limit:** the `catch (RuntimeException)` in `MiniParser` is silent, so a real parser bug would stay hidden. It needs logging later.
  
### Commits and links
- Notes commit for Day 6 (hash from `git log --oneline`)
- The code lives in `playground/java-mini-parser/`, which is local only and not pushed.
  
### First step for tomorrow
Day 7: weekly review 1 and buffer: fix what did not click this week and write the first weekly summ
