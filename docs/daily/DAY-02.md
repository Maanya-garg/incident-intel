# Day 02 — How the web talks: HTTP, REST, JSON. Read the blueprint

**Week 1** · **Phase P0: Foundations (Git, HTTP, Java)** · **Blueprint:** Preparation (not in blueprint)

**Planned:** 5 h (Learn 3.5 · Build and test 1 · Document 0.5) · **Suggested date:** 2026-10-22 (Thu). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
You can explain what happens when a browser calls an API, and you have read the whole blueprint once.

## ❓ Why this matters for the project
Your project is a REST API (Spring Boot) called by a browser (Next.js) and by another service (FastAPI). If HTTP and JSON are fuzzy, everything later is guesswork.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| HTTP request and response, methods, status codes | MDN: An overview of HTTP; HTTP request methods; HTTP response status codes | Memorise only 200, 201, 204, 400, 401, 403, 404, 409, 413, 500, 503. |
| JSON syntax | json.org | 10 min. |
| REST in one page: resources, verbs, status codes | Any short REST tutorial (for example restfulapi.net, key concepts only) | Skip HATEOAS and maturity-model theory. |
| Linux command line (pipes, grep, less, chmod, env vars) and DNS, ports, localhost | Any beginner Linux CLI guide (for example linuxjourney.com, Command Line Fundamentals), and MDN or any short article on what DNS and ports are | You will use `grep`, `cat`, `ls`, `curl` and env vars every day. Skip scripting for now. |

## 🔨 Build / do
- [ ] Install `curl` (or Bruno/Postman). Call a public API, for example `curl https://api.github.com/users/YOUR_NAME`, and read the JSON.
- [ ] Read blueprint sections 1 to 5 carefully. Skim 6 to 21 (you will come back to each one in its phase).
- [ ] Write `docs/project-in-my-words.md`: about 400 words on what the pipeline does, plus a glossary of 10 terms (log entry, template, incident, embedding, vector, retrieval, evidence, hypothesis, token, ablation). It is fine to be wrong now. You will fix it at Day 70.
- [ ] Practise: pipe a text file through `grep -c ERROR` and `sort | uniq -c`. Explain what a port is and why Postgres uses 5432.

## ✅ Check yourself (answer in your own words in the notes below)
1. What is the difference between GET and POST?
2. 401 vs 403 vs 404: when would a server send each?
3. In one sentence: what is the 'LLM is the last step of a long pipeline' idea?
4. What does `localhost:8080` mean, piece by piece?

## 🎤 Interview question this prepares
Explain what happens between typing a URL and seeing data (HTTP basics).

## 🏁 Definition of done
- [ ] `project-in-my-words.md` committed
- [ ] You called a real API and understood the JSON you got back
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`docs: project in my own words and glossary v0`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-02)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
