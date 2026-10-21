# Day 52 — LLM concepts and Ollama experiments

**Week 8** · **Phase P8: LLM integration and evidence verification** · **Blueprint:** Phases 12 and 13

**Planned:** 5 h (Learn 3 · Build and test 1.5 · Document 0.5) · **Suggested date:** 2026-12-11 (Fri). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
A local model runs through Ollama, and you have seen it fail in realistic ways.

## ❓ Why this matters for the project
The blueprint requires a design that survives hallucination, malformed JSON and prompt injection. You must see these failures once before you defend against them.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| What an LLM does, context window, temperature, hallucination | Anthropic or OpenAI docs overview pages, or any reputable intro | Concepts only. |
| Prompt injection and improper output handling | OWASP Top 10 for LLM Applications (prompt injection; improper output handling) | Link each risk to a control in your design. |
| Ollama: install, pull a model, chat API, structured output (`format`) | ollama.com and its docs | Pick a small model that fits your RAM (check the Ollama library page and its stated sizes). Write down the exact model and version you chose. |

## 🔨 Build / do
- [ ] Install Ollama, pull a small model, chat in the terminal, then call the API with `curl`.
- [ ] Ask for JSON output matching your contract and note how often it breaks.
- [ ] Feed it a log line containing 'IGNORE PREVIOUS INSTRUCTIONS' and see what happens.
- [ ] Ask for a root cause from logs that do not contain one and note whether it guesses.
- [ ] Record all findings in `docs/llm-experiments.md`.

## ✅ Check yourself (answer in your own words in the notes below)
1. Why can an LLM invent evidence?
2. How does a log line become a prompt-injection attack?
3. What does `temperature` change?

## 🎤 Interview question this prepares
How did you defend against prompt injection in a log-analysis tool?

## 🏁 Definition of done
- [ ] Experiments documented with real observed behaviour
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`docs: llm experiments with ollama`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-52)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
