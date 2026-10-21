# Day 27 — Bulk insert, log entries table, keyset pagination

**Week 4** · **Phase P3: Projects, safe upload and parsing** · **Blueprint:** Phases 3 and 4

**Planned:** 5 h (Learn 2 · Build and test 2.5 · Document 0.5) · **Suggested date:** 2026-11-16 (Mon). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
A parsed file is saved to `log_entries` in one batch, and entries are served through a paginated endpoint.

## ❓ Why this matters for the project
A log file can have 100,000+ lines. Inserting row by row or paginating with big offsets would be painfully slow.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| JDBC batch inserts vs JPA `saveAll` | Spring `JdbcTemplate.batchUpdate` docs; Vlad Mihalcea's articles on Hibernate batching (identity generator disables batching) | Use JdbcTemplate for the bulk insert. |
| Keyset (seek) vs offset pagination | use-the-index-luke.com 'Paging Through Results' (the 'no offset' page) | You will use `line_number` as the cursor. |
| Indexes for these queries | Your Day 12 notes | Indexes from blueprint section 7. |

## 🔨 Build / do
- [ ] Write `V4__create_log_entries.sql` per blueprint section 7, with the three indexes.
- [ ] After upload, parse in one transaction: status UPLOADED, PARSING, PARSED, or FAILED (with a reason).
- [ ] `GET /api/log-files/{id}/entries?cursor=&size=&level=`: ownership check, cursor on line number, max page size enforced.
- [ ] Time a 100k-line file. Write the time in your notes.

## ✅ Check yourself (answer in your own words in the notes below)
1. Why does offset pagination get slow on deep pages?
2. What happens if parsing fails halfway? What state is the file in?
3. Why cap `size` on the server?

## 🏁 Definition of done
- [ ] 100k lines parse and page quickly
- [ ] Failure leaves status FAILED, not a half-saved file
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`feat(backend): bulk insert of log entries and keyset pagination`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-27)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
