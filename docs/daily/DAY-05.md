# Day 05 — Java 3: collections, generics, streams, time

**Week 1** · **Phase P0: Foundations (Git, HTTP, Java)**

**Planned:** 5 h (Learn 2.5 · Build and test 2 · Document 0.5) 

**Status:** ✅ 

## 🎯 Goal for today
You can group, count and sort data with collections and streams, and you understand Instant vs LocalDateTime.

## ❓ Why this matters for the project
Template grouping, incident clustering and the timeline are all 'group, count, sort' problems. Timestamps with time zones are a classic source of bugs in log tools.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| List, Set, Map and when to use each; generics | java-programming.mooc.fi chapters on lists, maps and generics | Skip LinkedList internals. |
| Streams: filter, map, collect, groupingBy, counting | dev.java/learn: Streams | Do not chase advanced collectors. You need about 6 operations. |
| `java.time`: Instant, OffsetDateTime, ZoneId, DateTimeFormatter, Duration | dev.java/learn: Date and time (java.time) | Skip Calendar and Date. They are legacy. |
| Sorting with Comparator, `nullsLast` | dev.java/learn: Comparator | This is how you will sort entries with missing timestamps later. |

## 🔨 Build / do
- [✓] Extend the playground: parse 30 sample lines, then `Map<LogLevel, Long>` counts using `groupingBy`.
- [✓] Sort the lines by timestamp with `Comparator.nullsLast`, null-timestamp lines last, ties broken by line number.
- [✓] Compute the gap between two timestamps using `Duration` and print it in seconds.
- [✓] Parse `2026-10-19T10:20:31Z` and `2026-10-19T10:20:31+05:30` into the same type and show why they are different moments.

## 🏁 Definition of done
- [✓] Counts by level printed correctly
- [✓] Sorted output puts null timestamps last and ties by line number
- [✓] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`chore(playground): collections, streams and java.time exercises`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-05)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** 25-10-26 &nbsp;&nbsp; **Actual hours:** 3 **Plan followed?** yes 

### What I learned (explain it as if to a friend, in my own words)
A List keeps order and allows duplicates, a Set removes duplicates, and a Map stores key-value pairs, so counting lines per level needs a Map. Generics (`List<LogLine>`) tell the compiler what is inside a collection. I parsed 30 sample lines with the Day 4 parsers (with the FallbackParser last, so no line is dropped), then used a stream with `groupingBy` and `counting` to get a `Map<LogLevel, Long>`: ERROR 9, INFO 8, WARN 5, FATAL 2, DEBUG 1, TRACE 1, UNKNOWN 4, which adds up to 30. I sorted the lines with `Comparator.comparing(...)` using `Comparator.nullsLast(...)` and `thenComparingInt(lineNumber)`, so out-of-order lines are fixed, null timestamps go last and ties are broken by line number. `Duration.between(a, b)` gives the gap (94 seconds in my example). `Instant` is an exact moment in UTC, `OffsetDateTime` carries an offset like +05:30 and can be turned into an Instant, and `LocalDateTime` has no zone, so it is not an exact moment.

### What confused me / still unclear
I did not read the planned sources (MOOC chapters and dev.java). Method references like `LogLine::level` and the generic types in `Comparator.comparing(..., nullsLast(...))` still feel heavy; I follow the pattern but could not write it from scratch yet. I also do not yet know how the real parser will handle log times that are not in UTC, since my parser assumes UTC.

### What broke and how I fixed it (error message, cause, fix)
- My answer to the time zone question was wrong: I thought the 10:20:31Z log came first, but 15:00:00+05:30 is 09:30:00Z, so it happened 50 minutes 31 seconds earlier. Lesson: always convert to UTC before comparing times, never compare the printed clock values.
- Limits I noticed (not errors): UNKNOWN has 4 lines, three from the FallbackParser and one valid line with an unknown level (NOTICE); the stack-trace line is still its own entry and will be attached to the previous entry on Day 26.
  
### Commits and links
- The code lives in `playground/java-oop/`, which is local only and not pushed.

### First step for tomorrow
Day 6: exceptions, regex, files, JUnit and Maven, and the mini parser with 8 tests.
