# Day 07 — Weekly review 1 and buffer

**Week 1** · **Phase P0: Foundations (Git, HTTP, Java)** 

**Planned:** 5.5 h (Review and fix 2.5 · Weekly extras and practice 2.5 · Document 0.5) 

**Status:** ✅ 

> 🏷️ **Milestone:** at the end of today, tag `v0.0-foundations` (`git tag v0.0-foundations && git push --tags`).

## 🎯 Goal for today
Fix anything that did not click this week.

## ❓ Why this matters for the project
Slow learners do not need more speed, they need consolidation. One light day a week is where understanding sticks.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| Self-quiz | Your own notes | Redo the check questions you got wrong. |
| Git beyond the basics | Pro Git book chapters on branching, merging and undoing things | Practise on a throwaway repo, not on your project. |

## 🔨 Build / do
- [✓] Re-run every program from this week without looking at the code. Rewrite any that you cannot.
- [✓] Finish unfinished exercises from Days 3 to 6.
- [✓] **Weekly extra 1 (30 min), practise outside the project:** Exercism Java track (exercism.org): 2 to 3 easy exercises.
- [✓] **Weekly extra 2 (20 min), read other people's code:** one small, well-starred Java library on GitHub: read one class and note how it is named and tested.
- [✓] **Weekly extra 3 (10 min), explain it out loud:** record a voice note (or talk to a rubber duck) explaining this week's work from memory. Wherever you stumble, you have not understood it yet. Add those spots to the notes.
- [✓] Git rescue (1.5 h): create a throwaway repo and practise `git restore`, `git revert`, `git reset` (soft and hard, know the difference), `git stash`, creating and merging a branch, and resolving a merge conflict on purpose. From Week 2 on, work on a branch per week (`week-02`, `week-03`, ...) and merge it into `main` with a pull request on the review day.

## 🏁 Definition of done
- [✓] Tag pushed
- [✓] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`docs: weekly review 1`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-07)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)
This was the review day. I re-wrote four programs from Day 3 (FizzBuzz, array sum, reverse a string, `levelOf`) without looking at the old code. I practised the Git rescue commands in a throwaway repo (`git-practice`), never in the real project: `restore` throws away uncommitted changes for good, `revert` adds a new commit that undoes an old one (safe after a push), `reset --soft` removes the commit but keeps the changes staged, `reset --hard` removes commit and changes, `stash` puts unfinished work on a shelf, `reflog` finds committed work that seems lost (but never uncommitted work), a branch is a cheap pointer that merges as a fast-forward when `main` did not move, and a merge conflict is two branches changing the same line, solved by editing the markers away and running `git add`. I also synced my local repo with the notes I had edited on GitHub (`git fetch`, then `git pull`, a fast-forward).

### What confused me / still unclear
Nothing right now 

### What broke and how I fixed it (error message, cause, fix)
- My local copy was 10 commits behind GitHub (`behind 10`), because I had edited the Day 1 to 6 notes directly on GitHub. Fix: `git fetch` to look, then `git pull`, which was a clean fast-forward because nothing local had changed.

### Commits and links
- Notes commit for Day 7 (hash from `git log --oneline`)
  
### First step for tomorrow
Week 2, Day 8: Docker 1 (images, containers, ports, volumes). Start a `week-02` branch before working.

