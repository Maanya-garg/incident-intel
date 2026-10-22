# Day 02 — How the web talks: HTTP, REST, JSON. Read the blueprint

**Week 1** · **Phase P0: Foundations (Git, HTTP, Java)** ·

**Planned:** 5 h (Learn 3.5 · Build and test 1 · Document 0.5) · 

**Status:** ✅ 

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
- [✓] Install `curl` (or Bruno/Postman). Call a public API, for example `curl https://api.github.com/users/YOUR_NAME`, and read the JSON.
- [✓] Read blueprint sections 1 to 5 carefully. Skim 6 to 21 (you will come back to each one in its phase).
- [✓] Explain what a port is and why Postgres uses 5432.
- 
## 🎤 Interview question this prepares
Explain what happens between typing a URL and seeing data (HTTP basics).

## 🏁 Definition of done
- [✓] You called a real API and understood the JSON you got back
- [✓] Notes below filled in, work committed and pushed

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-02)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** 22-10-26 &nbsp;&nbsp; **Actual hours:** 2 &nbsp;&nbsp; **Plan followed?** yes 

### What I learned (explain it as if to a friend, in my own words)
An HTTP exchange is always a request and a response. The request has a method (GET asks for data, POST sends data or creates something), a path and headers. The response has a status code, headers and a body. I called the GitHub API with `curl.exe` and saw all of it: a 200 with a JSON body, and the headers that matter for this project (Content-Type, rate limits, CORS and security headers). JSON is built from objects, keys, and values (string, number, boolean, null, object, array), and `null` means "no value", which is the same idea as the parser rule "never invent a missing timestamp". I also read Blueprint sections 1 to 5 once to get a map of the pipeline.

### What confused me / still unclear
I did not read the planned sources (MDN, json.org, a REST tutorial) and I skipped the Linux command line and DNS part, so grep, pipes and the other Linux basics are still new to me. I will do the Linux practice when WSL2 is installed, before the Docker days.

### What broke and how I fixed it (error message, cause, fix)
- My first JSON draft of a log line was invalid. Cause: no curly braces, `level` set to null although the line contained ERROR, `rawMessage` set to null although the raw line must always be kept, and lowercase key names instead of camelCase. Fix: rewrote it with `{ }`, `"level": "ERROR"`, the full raw line in `rawMessage`, and `rawMessage`/`lineNumber` as key names.
- `curl` in PowerShell is an alias for `Invoke-WebRequest`. Fix: use `curl.exe` for the real tool.
  
### Commits and links
None required today

### First step for tomorrow
Day 3: install Java and write small programs with variables, if/else, loops and methods.
