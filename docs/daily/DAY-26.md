# Day 26 — Parser strategies, part 2: JSON, format detection, multi-line traces

**Week 4** · **Phase P3: Projects, safe upload and parsing** · **Blueprint:** Phases 3 and 4

**Planned:** 5 h (Learn 2 · Build and test 2.5 · Document 0.5) · **Suggested date:** 2026-11-15 (Sun). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
JSON logs parse, the right parser is chosen per file, and stack traces attach to the previous entry.

## ❓ Why this matters for the project
Real logs mix formats and contain multi-line stack traces. Treating each line as an entry would flood the system with junk entries.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| Jackson (already in Spring) for JSON | Baeldung 'Jackson ObjectMapper' intro or Jackson docs | Tolerate unknown fields and key aliases (`ts`/`timestamp`, `msg`/`message`). |
| Format detection by sampling | Your own design | Try each parser on the first N non-empty lines; pick the best parse rate; fall back to a generic parser. |

## 🔨 Build / do
- [ ] Add `JsonLogParser` with key aliases (ts, timestamp, time; level, severity; svc, service; msg, message).
- [ ] Normalize levels: WARNING to WARN, ERR to ERROR, FATAL/CRITICAL to FATAL, anything else to UNKNOWN.
- [ ] Pick the parser per file by sampling the first lines; implement a fallback.
- [ ] Attach multi-line continuation lines (start with whitespace, `at `, `Caused by:`, `...`) to the previous entry with a length cap.
- [ ] Add tests for each rule.

## ✅ Check yourself (answer in your own words in the notes below)
1. Why choose one parser per file instead of per line? When is per-line better?
2. What is the safest handling of a continuation line at the very start of the file?
3. Why cap the stored length of a stack trace?

## 🏁 Definition of done
- [ ] All three formats parse
- [ ] Stack traces attach correctly
- [ ] Detection test passes
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`feat(backend): json parser, format detection and multiline handling`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-26)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
