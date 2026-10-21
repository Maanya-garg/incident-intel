# Day 32 — TanStack Query: projects list, create project, upload form

**Week 5** · **Phase P4: Thin frontend and Python** · **Blueprint:** Phase 4b: Thin frontend slice

**Planned:** 5 h (Learn 2.5 · Build and test 2 · Document 0.5) · **Suggested date:** 2026-11-21 (Sat). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
The UI lists projects, creates one, and uploads a file with proper loading, error and empty states.

## ❓ Why this matters for the project
Server data (lists, mutations, caching) is easier with TanStack Query than hand-written `useEffect`. The blueprint uses it throughout.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| `useQuery`, `useMutation`, query keys, invalidation | tanstack.com/query docs: Overview, Quick Start, Queries, Mutations, Invalidation | Skip infinite queries and SSR hydration for now. |
| `FormData` and multipart upload with fetch | MDN: Using FormData objects | Do not set `Content-Type` yourself. The browser adds the boundary. |

## 🔨 Build / do
- [ ] Add `QueryClientProvider`. Build the Projects page (list, create form).
- [ ] Build the upload form on the project page. Show: uploading, success, duplicate (409) and error messages.
- [ ] Show loading, empty ('no projects yet') and error states.
- [ ] After upload, invalidate the file list query.

## ✅ Check yourself (answer in your own words in the notes below)
1. Why do mutations invalidate queries?
2. What breaks if you set `Content-Type: multipart/form-data` manually?
3. What states must every data-driven screen handle?

## 🏁 Definition of done
- [ ] Projects and upload work end to end
- [ ] All three states are visible when you simulate them
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`feat(frontend): projects page, create form and upload with tanstack query`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-32)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
