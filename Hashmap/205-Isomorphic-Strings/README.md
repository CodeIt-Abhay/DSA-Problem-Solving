# 205. Isomorphic Strings

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-brightgreen?style=for-the-badge)
![Topic: Hash%20Table](https://img.shields.io/badge/Topic-Hash%20Table-blue?style=for-the-badge)
![Topic: String](https://img.shields.io/badge/Topic-String-blue?style=for-the-badge)

## 📝 Problem Description

Given two strings `s` and `t`, *determine if they are isomorphic*.

Two strings `s` and `t` are **isomorphic** if the characters in `s` can be replaced to get `t`.

All occurrences of a character must be replaced with another character while preserving the character order. No two characters may map to the same character, but a character may map to itself.

### Examples

#### Example 1
> **Input:** s = "egg", t = "add"  
> **Output:** `true`  
> **Explanation:** 'e' maps to 'a', and 'g' maps to 'd'.

#### Example 2
> **Input:** s = "foo", t = "bar"  
> **Output:** `false`  
> **Explanation:** 'o' cannot map to both 'a' and 'r' simultaneously.

#### Example 3
> **Input:** s = "paper", t = "title"  
> **Output:** `true`  

### Constraints
* $1 \le \text{s.length} \le 5 \times 10^4$
* `t.length == s.length`
* `s` and `t` consist of any valid ASCII characters.

---