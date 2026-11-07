# Evaluation spec (v0)

Rule: no component is built until its metric and gold fields are written down here. This is version 0. The details are filled in before each component is built.

## Components

| Component | Metric | Gold needed | Pitfall | When |
|---|---|---|---|---|
| Parsing | % of lines with correct timestamp, level and service | Per-line gold fields | A null timestamp counts as correct when it is truly absent | Day 38 |
| Grouping | Pairwise precision and recall; report over-merging and over-splitting separately | `event_type` and `equivalence_class` per line | Do not report one blended number | Day 40 |
| Incident detection | Incident-level precision, recall and F1 using time-window overlap matching (threshold chosen and justified) | Gold incident windows, member lines, decoys | Without decoys, precision is meaningless | Day 43 |
| Timeline | Pairwise ordering accuracy or Kendall's tau, plus completeness | Ordered chain with gold timestamps | Must include ties, out-of-order and missing timestamps, or it is trivial | Day 45 |
| Retrieval | Hit@K or Recall@K (K=3), optionally MRR; keyword (Postgres full-text) baseline | Fault family per incident | Wording leakage between test and knowledge-base incidents | Day 50 |
| Grounding | Citation validity rate (automatic) and citation relevance rate (against gold evidence) | Gold evidence lines | Validity is not relevance | Days 55 and 65 to 67 |
| Hypothesis | Rubric 0 to 2 on: fault type, component, causal chain, cited evidence, no unsupported claims | Root cause, chain, expected outcome | Score blind to which system produced the answer | Days 65 to 67 |
| Insufficient evidence | Rate of correct INSUFFICIENT_EVIDENCE on unanswerable scenarios, and false abstention on answerable ones | `expected_outcome` | Models tend to guess instead of abstaining | Days 65 to 67 |
| Calibration | Does the stated confidence match correctness? | Hypothesis scores | Self-reported confidence is poorly calibrated | Optional, after Day 70 |

## Data splits

- Seeds are divided into dev and held-out test. Tune thresholds on dev only. Report final numbers on test only, and never tune on test.
- Leakage rule: test incidents must be worded differently from knowledge-base incidents of the same fault family, or retrieval looks better than it is.
- Synthetic results are not real-world performance.

## End-to-end evaluation

- A runner executes the scenarios end to end and collects the component metrics.
- LLM output varies, so repeat the runs and report the mean and the spread.
- The runner bypasses the Redis cache.
- Record the model, the prompt version and the temperature for each run.

Baselines (same model, same scenarios, same rubric):
1. Raw logs, truncated to fit the context, sent to the LLM
2. Error lines only, sent to the LLM

Ablations (remove one stage at a time): no historical retrieval, no timeline, no grouping, no verification.

## Hard rules

- Never invent numbers or improvement percentages.
- Report what the runs produce, including where the pipeline does not win.
- State the dataset size, the number of scenarios and the number of repeated runs next to every result.
- Every number in the repository comes from a script that can be re-run.

## Open decisions (to settle before the component is built)

- The overlap threshold for incident matching, and why it was chosen
- The exact rubric wording and the number of repeated runs
- The dataset size (number of scenarios)