# Day 03 — Java 1: install, syntax, types, control flow, methods

**Week 1** · **Phase P0: Foundations (Git, HTTP, Java)** · 

**Planned:** 5 h (Learn 2.5 · Build and test 2 · Document 0.5) · 

**Status:** ✅ 

## 🎯 Goal for today
You can write small Java programs with variables, if/else, loops and methods, and run them.

## ❓ Why this matters for the project
The backend (parsing, grouping, incident detection, timeline, verification) is Java. You will write it, so you must be comfortable with the language itself first.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| JDK install, `javac`/`java`, running a program | dev.java/learn (Getting started), or the first chapter of the University of Helsinki MOOC (java-programming.mooc.fi) | Use the current LTS version of Java. Check the latest LTS on the day you install. |
| Variables, types, operators, String, if/else, loops, methods | java-programming.mooc.fi, the first part (do the exercises, do not just read) | Skip anything specific to the NetBeans editor. Use IntelliJ IDEA Community. |

## 🔨 Build / do
- [✓] Install the current LTS JDK and IntelliJ IDEA Community. Run `java --version`.
- [✓] Create `playground/java-basics/`. Write 8 tiny programs: Hello, FizzBuzz, sum of an array, reverse a String, count ERROR lines in a hard-coded `String[]`, a method `levelOf(String line)` returning ERROR/WARN/INFO/UNKNOWN using `contains`, a method that extracts the text after the first `-`, and one of your own.
- [✓] Write the tests as simple `main()` printouts for now (real tests come on Day 6).

## 🏁 Definition of done
- [✓] All 8 programs run
- [✓] You can explain each program line by line without looking
- [✓] Notes below filled in, work committed and pushed

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-03)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** 23-10-26 &nbsp;&nbsp; **Actual hours:** 2.5 &nbsp;&nbsp; **Plan followed?** yes 

### What I learned (explain it as if to a friend, in my own words)
A Java program starts at the `main` method inside a class, and the class name must match the file name. I wrote 8 small programs in IntelliJ: Hello, FizzBuzz, the sum of an array, reversing a String, counting ERROR lines, a `levelOf(String line)` method, extracting the text after the first `-`, and a `countLevel` method that counts lines of a given level. From these I learned loops (`for`, for-each), `if / else if / else` where the first true condition wins and the order matters, `%` for remainders, arrays with 0-based indexes, and String methods (`length`, `charAt`, `contains`, `indexOf`, `substring`, `trim`). A method returns a value with `return`, and `null` means "no value", which is the same idea as the parser rule that a missing timestamp stays NULL.

### What confused me / still unclear
I did not read the planned sources (dev.java and the Helsinki MOOC), I learned by building with guidance. The 8th program (`countLevel`) was written with guidance and not entirely on my own. I still need to understand why `main` and these helper methods are `static`; that comes with objects on Day 4. I also used Java 21 LTS instead of the current LTS (Java 25). The final Java version will be decided on Day 15 from the Spring Boot documentation.

### What broke and how I fixed it (error message, cause, fix)
- **IntelliJ showed no "New → Java Class" option.** Cause: the `java-basics` folder was not marked as a Sources Root, and the module had no SDK assigned, so IntelliJ treated `.java` files as plain text. Fix: Mark Directory as → Sources Root, then set the SDK to Oracle OpenJDK 21 in Project Structure.
- **Wrong expected output in my own exercise.** I expected `UNKNOWN: 0` from `countLevel`, but a line without any level returns `UNKNOWN`, so the correct count was 1. Lesson: trace the code by hand before trusting an expected value.
- **Weak spots in my own programs (not errors, but limits).** `contains("ERROR")` also counts a line like "No ERROR found", and `indexOf('-')` cuts a log line at the dash inside the date `2026-10-23`. This is why the real parser on Day 6 will use regex.

### Commits and links
- The code lives in `playground/java-basics/`, which is local only and not pushed.
  
### First step for tomorrow
Day 4: model a log line as a class, and define an interface with two implementations.
