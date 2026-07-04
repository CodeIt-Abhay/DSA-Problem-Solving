# 290. Word Pattern

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-brightgreen?style=for-the-badge)
![Topic: Hash%20Table](https://img.shields.io/badge/Topic-Hash%20Table-blue?style=for-the-badge)
![Topic: String](https://img.shields.io/badge/Topic-String-blue?style=for-the-badge)

## 📝 Problem Description

Given a `pattern` and a string `s`, find if `s` follows the same pattern.

Here **follow** means a full match, such that there is a bijection between a letter in `pattern` and a non-empty word in `s`. Specifically:
* Each letter in `pattern` maps to exactly one unique word in `s`.
* Each unique word in `s` maps to exactly one unique letter in `pattern`.
* No two letters map to the same word, and no two words map to the same letter.

### Examples

#### Example 1
> **Input:** pattern = "abba", s = "dog cat cat dog"  
> **Output:** `true`  
> **Explanation:** 'a' maps to "dog", and 'b' maps to "cat".

#### Example 2
> **Input:** pattern = "abba", s = "dog cat cat fish"  
> **Output:** `false`  
> **Explanation:** The last letter 'a' is expected to map to "dog", but it encounters "fish".

#### Example 3
> **Input:** pattern = "aaaa", s = "dog cat cat dog"  
> **Output:** `false`  

### Constraints
* $1 \le \text{pattern.length} \le 30$
* `pattern` contains only lowercase English letters.
* $1 \le \text{s.length} \le 3000$
* `s` contains only lowercase English letters and spaces `' '`.
* `s` **does not contain** any leading or trailing spaces.
* All the words in `s` are separated by a **single space**.

---