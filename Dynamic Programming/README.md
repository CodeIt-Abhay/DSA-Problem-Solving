# 🚀 Dynamic Programming Mastery | DSA Problem Solving

## 📖 Overview of Dynamic Programming

**Dynamic Programming (DP)** is an algorithmic paradigm that solves a complex problem by breaking it down into simpler subproblems, solving each subproblem exactly once, and storing their solutions to avoid redundant computations.

It is an optimization over plain recursion. Wherever we see a recursive solution that has repeated calls for the same inputs, we can optimize it using Dynamic Programming.

Dynamic Programming relies on two primary application mechanics:
- **Top-Down (Memoization):** Starts with the main problem and recursively breaks it down, caching the results of subproblems in an array or hash map.
- **Bottom-Up (Tabulation):** Starts with the smallest subproblems, fills a table iteratively, and builds up to the final solution.

---

## 🔑 Core Pillars of Dynamic Programming

A problem can be solved using Dynamic Programming if and only if it exhibits these two fundamental mathematical properties:

| Property | Description |
|----------|-------------|
| **Overlapping Subproblems** | The space of subproblems must be small, meaning the same subproblems are solved over and over again instead of generating new ones. |
| **Optimal Substructure** | The optimal solution to the global problem can be constructed efficiently from the optimal solutions of its localized subproblems. |

---

## 📌 Common Sub-Patterns & Archetypes

Mastering DP requires recognizing the structural fingerprint of the problem. Most LeetCode DP problems map directly to one of these core archetypes:

- **Fibonacci Sequence Patterns:** Climbing Stairs, Min Cost Climbing Stairs, House Robber.
- **0/1 Knapsack Frameworks:** Subset Sum, Partition Equal Subset Sum, Target Sum.
- **Unbounded Knapsack Frameworks:** Coin Change, Coin Change II, Combination Sum IV.
- **Longest Common Subsequence (LCS):** Longest Palindromic Subsequence, Edit Distance, Distinct Subsequences.
- **Longest Increasing Subsequence (LIS):** Russian Doll Envelopes, Largest Divisible Subset.
- **Matrix / Grid DP:** Unique Paths, Minimum Path Sum, Maximal Square.
- **Interval DP:** Longest Palindromic Substring, Minimum Cost to Cut a Stick.

---

## ⚡ Memoization vs Tabulation: A Direct Contrast

| Feature | Top-Down (Memoization) | Bottom-Up (Tabulation) |
|:---|:---|:---|
| **Core Strategy** | Recursion + Cache Lookup | Iterative Table Filling |
| **State Transitions** | Solves from $N$ down to Base Case | Solves from Base Case up to $N$ |
| **Stack Overhead** | Risk of `StackOverflowError` due to deep recursion | No recursion overhead; safe for large bounds |
| **Memory Efficiency** | Only computes subproblems required by the call path | Computes all subproblem states systematically |
| **Space Optimization**| Difficult to optimize space bounds | Frequently optimized from $\mathcal{O}(N)$ to $\mathcal{O}(1)$ space |

---

# 🎯 The 3-Step DP Recipe for Interviews

When asked a DP question in an interview, do not immediately write code. Walk through these three explicit execution steps:

### 1. Define the State
Determine exactly what your DP array or parameters represent.  
*Example:* Let `dp[i]` be the maximum profit obtainable from house `0` to house `i`.

### 2. Derive the State Transition Relation
Find the mathematical link between the current state and prior states.  
*Example:* `dp[i] = Math.max(dp[i-1], nums[i] + dp[i-2])`

### 3. Identify Base Cases
Define the initial starting boundaries where the answer is known implicitly without calculations.  
*Example:* `dp[0] = nums[0]`, `dp[1] = Math.max(nums[0], nums[1])`

---

# 🧠 Dynamic Programming Sub-Patterns Covered

| Pattern | Status |
|----------|---------|
| Linear / 1D DP (Fibonacci-style) | ✅ |
| Grid / 2D Matrix DP | ✅ |
| 0/1 Knapsack & Variances | ✅ |
| Unbounded Knapsack & Coin Patterns | ✅ |
| String Matching & Edit Distances (LCS) | ✅ |
| Array Subsequences & Multi-pointer State (LIS) | ✅ |
| DP with Bitmasking | ✅ |
| Game Theory / Minimax DP | ✅ |

---
