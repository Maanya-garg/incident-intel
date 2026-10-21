# Day 39 — Template extraction: normalization and error groups

**Week 6** · **Phase P5: Synthetic data, grouping and incident detection (part 1)** · **Blueprint:** Phases 5, 6 and the start of 7

**Planned:** 6 h (Learn 2.5 · Build and test 3 · Document 0.5) · **Suggested date:** 2026-11-28 (Sat). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
Variants like 'timeout for user 123' and 'user 456' collapse into one template and one error group.

## ❓ Why this matters for the project
Thousands of log lines usually hide a few distinct problems. Grouping is how the system finds them.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| Log parsing and templates (Drain) | He et al., 'Drain: An Online Log Parsing Approach with Fixed Depth Tree' (read the abstract and introduction only); LogHub README | Background only. You build a simpler regex-based version. |
| SQL GROUP BY with upsert | PostgreSQL docs: INSERT ... ON CONFLICT | You already know GROUP BY from Day 12. |

## 🔨 Build / do
- [ ] Write `V5__create_error_groups.sql` per blueprint section 7 (unique on project, service, template).
- [ ] Build a `TemplateNormalizer`: replace timestamps, UUIDs, IPs, hex strings, file paths, quoted IDs and numbers with placeholders, in a sensible order.
- [ ] Group by (service, normalized template). Store occurrence count, severity (highest seen), first seen, last seen. Link `log_entries.error_group_id`.
- [ ] Unit tests with at least 10 message pairs that should merge and 5 that should not.

## ✅ Check yourself (answer in your own words in the notes below)
1. Why does the order of replacement rules matter?
2. Why is grouping 'heuristic' and what two mistakes can it make?
3. Why is `(project_id, service, template)` unique?

## 🏁 Definition of done
- [ ] Variants collapse into one group
- [ ] Counts and first/last seen are correct
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`feat(backend): template normalizer and error groups`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-39)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
