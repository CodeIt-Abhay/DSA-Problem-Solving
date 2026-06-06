# 1143. Longest Common Subsequence

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-orange?style=for-the-badge)
![Topic: String](https://img.shields.io/badge/Topic-String-blue?style=for-the-badge)
![Topic: Dynamic%20Programming](https://img.shields.io/badge/Topic-Dynamic%20Programming-blue?style=for-the-badge)

## 📝 Problem Description

Given two strings `text1` and `text2`, return *the length of their **longest common subsequence***. If there is no **common subsequence**, return `0`.

A **subsequence** of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.

* For example, `"ace"` is a subsequence of `"abcde"` while `"aec"` is not.

A **common subsequence** of two strings is a subsequence that is common to both strings.

### Examples

#### Example 1
> **Input:** `text1 = "abcde"`, `text2 = "ace"`  
> **Output:** `3`  
> **Explanation:** The longest common subsequence is `"ace"`, so its length is 3.

#### Example 2
> **Input:** `text1 = "abc"`, `text2 = "abc"`  
> **Output:** `3`  
> **Explanation:** The longest common subsequence is `"abc"`, so its length is 3.

#### Example 3
> **Input:** `text1 = "abc"`, `text2 = "def"`  
> **Output:** `0`  
> **Explanation:** There is no such common subsequence, so the result is 0.

### Constraints
* $1 \le \text{text1.length, text2.length} \le 1000$
* `text1` and `text2` consist of lowercase English characters only.

---