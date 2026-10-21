# Day 47 — Incident representation and the Spring to FastAPI client

**Week 7** · **Phase P7: Embeddings, pgvector, retrieval and evidence** · **Blueprint:** Phases 9, 10 and 11

**Planned:** 6 h (Learn 2 · Build and test 3.5 · Document 0.5) · **Suggested date:** 2026-12-06 (Sun). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
Each incident gets a structured text summary, and Spring Boot can call `/embed` reliably.

## ❓ Why this matters for the project
Embedding quality depends on what text you embed. The same representation is also partly sent to the LLM later.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| Spring `RestClient` with timeouts | Spring Framework reference: REST Clients | Always set connect and read timeouts. |
| Mocking HTTP in tests | WireMock or Spring `MockRestServiceServer` docs | Pick one. You never call the real AI service in unit tests. |

## 🔨 Build / do
- [ ] Implement the representation exactly like blueprint 5.6: service, severity, time range, observed events, error patterns.
- [ ] Write `AiClient.embed(text)` with timeouts and a clear exception when the AI service is down.
- [ ] Tests: representation content, AI service down returns a clear error (no crash), wrong secret handled.
- [ ] Add a pytest for the embedding of two near-synonym messages being closer than two unrelated ones (use a fixed small sample).

## ✅ Check yourself (answer in your own words in the notes below)
1. Why include 'observed events' and 'error patterns' in the text but not raw logs?
2. Why set timeouts on every outbound call?
3. Why must the same model embed every incident?

## 🏁 Definition of done
- [ ] Client and representation tests pass
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`feat(backend): incident representation and ai service client`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-47)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
