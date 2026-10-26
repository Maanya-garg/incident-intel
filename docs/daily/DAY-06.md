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
I learned how Java handles exceptions and why checked exceptions such as IOException need to be handled or declared with throws. I used try-with-resources while reading files so the BufferedReader is automatically closed after reading.
I learned the basics of regex using Pattern and Matcher, including capturing groups for extracting parts of a log line. I used regex to parse different log formats and handle invalid input safely.
I also learned how to read a file line by line using Files.newBufferedReader with UTF-8. If a file does not exist, Java throws NoSuchFileException, which is a type of IOException.
I created the mini parser as a Maven project and used JUnit 5 to test the parsing rules. Running mvn test gives a quick way to check whether the parser is still working correctly.
The main parser rule I learned is that one malformed log line should not crash the entire file. The parser should preserve the raw line, mark it as malformed when necessary, keep a missing timestamp as null, and convert an unknown log level to UNKNOWN.

### What confused me / still unclear
Regex is still the part I find hardest to write from scratch. I understand the pattern better once I break it into groups, but I need more practice creating regex myself.
I also need more practice deciding when to use try-catch and when to use throws.
Maven and pom.xml are clearer now, but I still need more practice with dependencies and the Maven project structure.

### What broke and how I fixed it (error message, cause, fix)
An invalid or missing file can cause an IOException / NoSuchFileException, so file-reading code needs proper exception handling.
Invalid timestamps such as 99:99:99 should not be accepted as valid timestamps.
Unknown levels such as NOTICE are converted to UNKNOWN instead of causing the parser to crash.
Malformed lines are flagged instead of stopping the complete parsing process.
I used JUnit tests to catch parsing mistakes and verify the expected behaviour for different formats and edge cases.

### Commits and links
-notes 
### First step for tomorrow
Day 7: Start connecting the Java concepts from the playground to the actual Spring Boot backend.
