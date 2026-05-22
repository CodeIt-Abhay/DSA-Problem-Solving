# 020. Valid Parentheses

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-brightgreen?style=for-the-badge)
![Topic: String](https://img.shields.io/badge/Topic-String-blue?style=for-the-badge)
![Topic: Stack](https://img.shields.io/badge/Topic-Stack-blue?style=for-the-badge)

## 📝 Problem Description

Given a string `s` containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`, determine if the input string is valid.

An input string is valid if:
1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.
3. Every close bracket has a corresponding open bracket of the same type.

### Examples

#### Example 1
> **Input:** `s = "()"`  
> **Output:** `true`  

#### Example 2
> **Input:** `s = "()[]{}"`  
> **Output:** `true`  

#### Example 3
> **Input:** `s = "(]"`  
> **Output:** `false`  

### Constraints
* $1 \le \text{s.length} \le 10^4$
* `s` consists of parentheses only: `'()[]{}'`.