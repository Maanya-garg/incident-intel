# Day 55 — Evidence verification

**Week 8** · **Phase P8: LLM integration and evidence verification** · **Blueprint:** Phases 12 and 13

**Planned:** 5 h (Learn 2 · Build and test 2.5 · Document 0.5) · **Suggested date:** 2026-12-14 (Mon). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
Every citation is checked against the database and flagged. Invalid evidence is never silently dropped.

## ❓ Why this matters for the project
Verification is what makes the output trustworthy. It proves a cited line exists and belongs to the incident. It does not prove the line supports the claim, and you say so.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| Trust boundaries | OWASP: Improper Output Handling in LLM Applications | Treat model output like user input. |
| Membership queries | Your SQL notes: `id IN (...) AND incident_id = ?` | One query per analysis, not per citation. |

## 🔨 Build / do
- [ ] `V9__analysis_citations.sql` per blueprint section 7.
- [ ] Per citation: does the log exist, does it belong to this project, is it in this incident's evidence package; for historical refs: was it among the retrieved top-K. Result VALID, NOT_FOUND or NOT_IN_INCIDENT.
- [ ] If no citation is valid, the hypothesis is marked unverified.
- [ ] Tests: fabricated ref (L99), ref from another incident, ref from another user's project, mixed valid and invalid.
- [ ] Add the metrics to the spec: citation validity (automatic) vs citation relevance against gold evidence.

## ✅ Check yourself (answer in your own words in the notes below)
1. What does VALID prove and what does it not prove?
2. Why must invalid citations be shown, not hidden?
3. Why is validity different from relevance?

## 🎤 Interview question this prepares
How do you detect hallucinated evidence?

## 🏁 Definition of done
- [ ] All four citation tests pass
- [ ] Honest limit written in README limitations
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`feat(backend): evidence verification with per-citation status`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-55)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
