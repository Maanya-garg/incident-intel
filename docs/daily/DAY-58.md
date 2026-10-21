# Day 58 — Redis cache for analysis (deliberately small)

**Week 9** · **Phase P9: Feedback loop and Redis cache** · **Blueprint:** Phases 14 and 14b

**Planned:** 4 h (Learn 1.5 · Build and test 2 · Document 0.5) · **Suggested date:** 2026-12-17 (Thu). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
Repeated analysis of the same evidence returns a cached result with a TTL, and evaluation can bypass the cache.

## ❓ Why this matters for the project
The blueprint says honestly that an in-process cache would suffice. Redis is here to learn hit/miss/TTL, and because it survives restarts and works across instances.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| Redis basics: key-value, TTL, hit and miss | redis.io docs: introduction and EXPIRE | Only strings and TTL. Skip pub/sub and clustering. |
| Spring cache abstraction | spring.io/guides 'Caching Data with Spring'; Spring Data Redis reference: Cache | `@Cacheable` with a Redis cache manager and TTL. |

## 🔨 Build / do
- [ ] Add `redis` to Compose.
- [ ] Cache key: `incidentId + hash(evidence package) + promptVersion + model`. Hours of TTL.
- [ ] Do not cache failed, invalid or unverified analyses. Do not cache embeddings or pgvector queries.
- [ ] Add a clear bypass switch for the evaluation runner.
- [ ] Test hit and miss with a Testcontainers Redis, and that changed feedback produces a new key.

## ✅ Check yourself (answer in your own words in the notes below)
1. Why does hashing the evidence in the key avoid stale answers?
2. What should never be cached here?
3. When would an in-process cache be enough?

## 🏁 Definition of done
- [ ] Second call is a hit, a changed evidence package is a miss
- [ ] Bypass works
- [ ] Notes below filled in, work committed and pushed

## ➕ Stretch (only if you are ahead of schedule, otherwise skip)
- Basic rate limiting on login and analyze (only if ahead).

## 💾 Suggested commit
`feat(backend): redis cache for analysis results`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-58)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
