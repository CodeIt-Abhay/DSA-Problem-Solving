# 796. Rotate String

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-brightgreen?style=for-the-badge)
![Topic: String](https://img.shields.io/badge/Topic-String-blue?style=for-the-badge)
![Topic: String%20Matching](https://img.shields.io/badge/Topic-String%20Matching-blue?style=for-the-badge)

## 📝 Problem Description

Given two strings `s` and `goal`, return `true` *if and only if `s` can become `goal` after some number of **shifts** on `s`*.

A **shift** on `s` consists of moving the leftmost character of `s` to the rightmost position.

* For example, if `s = "abcde"`, then it will be `"bcdea"` after one shift.

### Examples

#### Example 1
> **Input:** `s = "abcde"`, `goal = "cdeab"`  
> **Output:** `true`  

#### Example 2
> **Input:** `s = "abcde"`, `goal = "abced"`  
> **Output:** `false`  

### Constraints
* $1 \le \text{s.length, goal.length} \le 100$
* `s` and `goal` consist of lowercase English letters.

---