# Day 17 — Registration: layering, DTOs, validation, BCrypt

**Week 3** · **Phase P2: Spring Boot and authentication** · **Blueprint:** Phase 2: Auth

**Planned:** 5 h (Learn 2.5 · Build and test 2 · Document 0.5) · **Suggested date:** 2026-11-06 (Fri). Shift freely, the order matters, not the date.

**Status:** ⬜ not started  (change to 🟨 in progress or ✅ done)

## 🎯 Goal for today
`POST /api/auth/register` creates a user with a hashed password and returns clear errors.

## ❓ Why this matters for the project
This is the first full vertical slice (controller, service, repository, validation, error handling) and the pattern for every later endpoint.

## 📚 Learn first (before you code)
| Topic | Where to learn it | Study this, skip that |
|---|---|---|
| Layering: controller, service, repository; DTO vs entity | Any Spring layered-architecture article (Baeldung 'Spring Boot layered architecture' style) | Rule: never return entities from controllers. |
| Bean Validation: @NotBlank, @Email, @Size | spring.io/guides 'Validating Form Input' | Only the annotations you use. |
| Password hashing: salt, BCrypt, why never plain text | OWASP Password Storage Cheat Sheet (cheatsheetseries.owasp.org) | Read the summary and the BCrypt part. |
| Mockito basics | site.mockito.org and Baeldung 'Mockito tutorial' (intro) | `@Mock`, `when(...).thenReturn(...)`, `verify`. |

## 🔨 Build / do
- [ ] Create `RegisterRequest` and `UserResponse` records. Validate email format and password length (minimum 8, write your choice in the docs).
- [ ] Create `AuthService.register` using a `PasswordEncoder` bean (BCrypt).
- [ ] Return 201 on success. Duplicate email returns 409. Validation errors return 400 with a clear JSON body (use `@RestControllerAdvice`).
- [ ] Make sure passwords never appear in logs.
- [ ] Write a unit test for the service (Mockito) and a controller test (MockMvc).

## ✅ Check yourself (answer in your own words in the notes below)
1. Why return a DTO and not the `User` entity?
2. What is a salt and why does BCrypt include one?
3. What HTTP status do you return for a duplicate email and why?

## 🏁 Definition of done
- [ ] Register works from Swagger/curl
- [ ] Password hash in DB looks like `$2a$...`
- [ ] Tests pass
- [ ] Notes below filled in, work committed and pushed

## 💾 Suggested commit
`feat(backend): register endpoint with validation and bcrypt`

> **Stuck?** Follow the stuck protocol in the roadmap: 30 minutes alone, then write the question, then ask. After 90 minutes, take the workaround, mark it `TODO(day-17)` and move on.

---

# 📝 My notes (fill in at the end of the day)

**Date:** &nbsp;&nbsp; **Actual hours:** &nbsp;&nbsp; **Energy (1-5):** &nbsp;&nbsp; **Plan followed?** yes / partly / no

### What I learned (explain it as if to a friend, in my own words)

### What confused me / still unclear

### What broke and how I fixed it (error message, cause, fix)

### Answers to the check questions

### Commits and links

### First step for tomorrow
