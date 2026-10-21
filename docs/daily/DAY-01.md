# Day 01 — Set up your machine, Git and GitHub

**Week 1** · **Phase P0: Foundations (Git, HTTP, Java)** · 

**Planned:** 3 h (Learn 1 · Build and test 1.5 · Document 0.5) · 

**Status:** ✅ 

## 🎯 Goal for today
Your computer is ready, the GitHub repo exists, and your first commit is pushed.

## ❓ Why this matters for the project
Every day of this project ends with a commit and a daily doc. The GitHub repo is your portfolio, so we start it before anything else.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| Terminal basics (cd, ls, mkdir, cat, pwd) | Any beginner terminal cheat sheet | 30 min. Just the 10 commands you will really use. |
| Git: snapshots, commit, branch, remote, push | Pro Git book (git-scm.com/book), chapters 1 and 2 | Skip rebasing, internals and Git on the server. |
| Markdown (headings, lists, tables, code blocks) | GitHub Docs: Basic writing and formatting syntax | 15 min. You will write Markdown every day. |

## 🔨 Build / do
- [✔] Install Git and VS Code. Windows users: install WSL2 with Ubuntu and work inside it (Docker and Java behave better there).
- [✔] Create a GitHub account (if needed), then a repo named `incident-intel` (public, with no template).
- [✔] Clone it, copy the starter files from this plan into it, commit and push.
- [✔] Fill in the 'My notes' part at the bottom of this file. That is your first daily doc.

## 🏁 Definition of done
- [✔] Repo visible on GitHub with at least 2 commits
- [✔] `git status` is clean
- [✔] Day 1 notes filled in
- [✔] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`chore: initial repo with README and gitignore`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-01)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** 21-10-26 &nbsp;&nbsp; **Actual hours:** 2.5 &nbsp;&nbsp; **Plan followed?** yes 

### What I learned 
Git keeps four places in mind: the working directory (my files), the staging area (what goes into the next commit), the local repository (committed history) and the remote (the copy on GitHub). Nothing leaves my computer until I run `git push`. I also learned that `.gitignore` is committed and visible to everyone, while `.git/info/exclude` works the same way but stays only on my machine, so it is the right place for files I never want to expose. Before staging I used `git add -n .` as a dry run to see exactly what would be committed, and I set up the `origin` remote with `git push -u origin main` so later pushes need only `git push`.

### What confused me / still unclear
Git warned that LF would be replaced by CRLF. I understand it is a line-ending difference between Unix and Windows and not an error, but I still need to learn when it causes real problems. I plan to handle it with a `.gitattributes` file before the Docker days.

### What broke and how I fixed it (error message, cause, fix)
- **`git init` ran one folder too high.** Cause: I was in the parent folder that only contained `incident-intel/`, so `git status` showed it as one untracked item. Fix: removed that `.git` folder and ran `git init` inside the real project folder.
- **README showed `\*\*` and `\[`.** Cause: a rich-text editor escaped Markdown characters when saving. Fix: Find and Replace in VS Code, then edit `.md` files only in a plain-text editor.
- **A replace left extra spaces ("in   the roadmap").** Cause: the replace text was pasted with leading spaces. Fix: a regex replace (`in +the`) that collapsed them to one space.
- **A search matched the wrong lines.** Cause: `Select-String` is case-insensitive, so "in progress" matched the pattern `PROGRESS`. Fix: reading the output before trusting the count.
  
### Commits and links
- Repo: https://github.com/Maanya-garg/incident-intel
- `7074658` chore: initial project skeleton from starter
- <second commit hash> docs: add daily plans for days 1 to 70

### First step for tomorrow
Day 2: learn how HTTP, REST and JSON work, then read the whole Blueprint once.
