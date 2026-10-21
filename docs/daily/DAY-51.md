# Day 51 — Evidence selection and token budget

**Week 8** · **Phase P7: Embeddings, pgvector, retrieval and evidence** · **Blueprint:** Phases 9, 10 and 11

**Planned:** 6 h (Learn 2 · Build and test 3.5 · Document 0.5) · **Suggested date:** 2026-12-10 (Thu). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
An evidence package is built with reference IDs and a token budget, never the whole log.

## ❓ Why this matters for the project
The LLM cannot read 100k lines, and sending everything is slow, costly and unsafe. Choosing evidence well is where much of the quality comes from.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| Retrieval-augmented generation (RAG) | Lewis et al. 2020 'Retrieval-Augmented Generation' (abstract and introduction) | Background. You build a small, careful version. |
| Tokens and context windows | Any provider's 'what is a token' page; Ollama docs on context length | Rough estimate: tokens are about characters divided by 4. Document your estimate. |

## 🔨 Build / do
- [ ] Evidence package per blueprint 5.9: incident summary and range, compressed timeline, top error groups with counts, a budgeted set of representative lines (first, peak, last, transitions between services) with reference IDs L1, L2..., top-K historical incidents with H1, H2...
- [ ] Persist the mapping from reference label to database id (this powers verification on Day 55).
- [ ] Wrap log text in clear delimiters and label it as untrusted data.
- [ ] Tests: budget respected, refs unique and stable, a huge incident is truncated deterministically.

## ✅ Check yourself (answer in your own words in the notes below)
1. Why do we show the LLM reference IDs (L1) and not database ids?
2. Which lines would you choose when you must drop 99 percent of the log?
3. Why must the selection be deterministic?

## 🏁 Definition of done
- [ ] Evidence builder tests pass
- [ ] Reference mapping is stored
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`feat(backend): evidence package builder with token budget and refs`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-51)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
