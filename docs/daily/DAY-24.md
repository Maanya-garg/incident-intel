# Day 24 — Safe upload: multipart, validation, hash, dedup

**Week 4** · **Phase P3: Projects, safe upload and parsing** · **Blueprint:** Phases 3 and 4

**Planned:** 6 h (Learn 2.5 · Build and test 3 · Document 0.5) · **Suggested date:** 2026-11-13 (Fri). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
A user can upload a `.log` or `.txt` file safely, and duplicate uploads are handled deterministically.

## ❓ Why this matters for the project
File upload is a classic attack surface. The blueprint's rules: never trust the client filename, no path traversal, size limits, store outside the web root, dedup by hash.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| Multipart uploads in Spring | spring.io/guides 'Uploading Files' | Skip the Thymeleaf form. |
| Upload security | OWASP File Upload Cheat Sheet (read the headings, then the relevant bullets) | The client `Content-Type` can lie. Check extension, size, non-empty and 'looks like text'. |
| SHA-256 hashing | Java `MessageDigest` Javadoc | Hash while streaming. Do not load a huge file into memory. |

## 🔨 Build / do
- [ ] Write `V3__create_log_files.sql` with the unique (project_id, content_hash) constraint and a status column (UPLOADED, PARSING, PARSED, FAILED).
- [ ] `POST /api/projects/{id}/logs/upload`: check ownership, extension, size limit (configure it), non-empty, text-like content.
- [ ] Store under a generated name (UUID) in a configured storage folder outside any served path.
- [ ] Duplicate content in the same project: decide and document (recommended: return 409 with the existing file id). Write it in ADR 0004.
- [ ] Tests: `../../evil.log` as filename, empty file, `.exe`, oversize, duplicate.

## ✅ Check yourself (answer in your own words in the notes below)
1. What is path traversal and how does a generated filename prevent it?
2. Why is the content hash computed on the server?
3. Why not trust the `Content-Type` header?

## 🏁 Definition of done
- [ ] All 5 upload edge cases are tested
- [ ] Files appear in storage with generated names
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`feat(backend): safe log upload with hash dedup`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-24)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
