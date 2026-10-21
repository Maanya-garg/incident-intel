# Day 05 — Java 3: collections, generics, streams, time

**Week 1** · **Phase P0: Foundations (Git, HTTP, Java)** · **Blueprint:** Preparation (not in blueprint)

**Planned:** 5 h (Learn 2.5 · Build and test 2 · Document 0.5) · **Suggested date:** 2026-10-25 (Sun). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

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
- [ ] Extend the playground: parse 30 sample lines, then `Map<LogLevel, Long>` counts using `groupingBy`.
- [ ] Sort the lines by timestamp with `Comparator.nullsLast`, null-timestamp lines last, ties broken by line number.
- [ ] Compute the gap between two timestamps using `Duration` and print it in seconds.
- [ ] Parse `2026-10-19T10:20:31Z` and `2026-10-19T10:20:31+05:30` into the same type and show why they are different moments.

## ✅ Check yourself (answer in your own words in the notes below)
1. List vs Set vs Map: pick one for 'count lines per level'. Why?
2. What must a class provide to be a good HashMap key? (hint: two methods)
3. Instant vs LocalDateTime: why does the time zone matter for logs from several servers?
4. What does `nullsLast` do and why will you need it?

## 🏁 Definition of done
- [ ] Counts by level printed correctly
- [ ] Sorted output puts null timestamps last and ties by line number
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`chore(playground): collections, streams and java.time exercises`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-05)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
