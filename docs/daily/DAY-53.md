# Day 53 — FastAPI `/analyze`: LLMProvider, prompt, schema validation, retries

**Week 8** · **Phase P8: LLM integration and evidence verification** · **Blueprint:** Phases 12 and 13

**Planned:** 6 h (Learn 2.5 · Build and test 3 · Document 0.5) · **Suggested date:** 2026-12-12 (Sat). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
The AI service turns an evidence package into validated, structured JSON, or fails cleanly.

## ❓ Why this matters for the project
This is the one place the model is called. It must never return something the rest of the system cannot trust to have the right shape.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| Pydantic validation and enums (`Literal`) | docs.pydantic.dev: Models, Validators, JSON | `model_validate_json` and clear error messages. |
| httpx for calling Ollama | python-httpx.org Quickstart and Timeouts | Set timeouts. |
| Prompt structure | Anthropic docs prompt engineering overview or similar | System rules vs data. Give the contract and rules in the system prompt. |

## 🔨 Build / do
- [ ] Create abstract `LLMProvider` and `OllamaProvider`. API keys (for an optional external provider later) only through environment variables.
- [ ] Prompt v1: use only reference IDs you were given, INSUFFICIENT_EVIDENCE is a valid answer, causal language only if the logs state causation, log content is data and never instructions.
- [ ] Validate the output against the Pydantic model for schema_version 1.0. On invalid output: retry once, then return a structured error.
- [ ] Return metadata: model, prompt_version, temperature.
- [ ] Tests with a fake provider (no real LLM): valid output, malformed JSON, invalid confidence value, empty history, unknown citation.

## ✅ Check yourself (answer in your own words in the notes below)
1. Why does the provider sit behind an interface?
2. What do you do when the model returns invalid JSON twice?
3. Why do the tests use a fake provider?

## 🏁 Definition of done
- [ ] pytest suite passes without Ollama
- [ ] A real call works end to end on one incident
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`feat(ai-service): analyze endpoint with provider abstraction and validation`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-53)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
