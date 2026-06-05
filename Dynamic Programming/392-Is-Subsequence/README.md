# 392. Is Subsequence

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-brightgreen?style=for-the-badge)
![Topic: Two%20Pointers](https://img.shields.io/badge/Topic-Two%20Pointers-blue?style=for-the-badge)
![Topic: String](https://img.shields.io/badge/Topic-String-blue?style=for-the-badge)
![Topic: Dynamic%20Programming](https://img.shields.io/badge/Topic-Dynamic%20Programming-blue?style=for-the-badge)

## 📝 Problem Description

Given two strings `s` and `t`, return `true` *if `s` is a **subsequence** of `t`, or `false` otherwise*.

A **subsequence** of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., `"ace"` is a subsequence of `"abcde"` while `"aec"` is not).

### Examples

#### Example 1
> **Input:** `s = "abc"`, `t = "ahbgdc"`  
> **Output:** `true`  

#### Example 2
> **Input:** `s = "axc"`, `t = "ahbgdc"`  
> **Output:** `false`  

### Constraints
* $0 \le \text{s.length} \le 100$
* $0 \le \text{t.length} \le 10^4$
* `s` and `t` consist only of lowercase English letters.

---