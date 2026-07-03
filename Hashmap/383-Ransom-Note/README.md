# 383. Ransom Note

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-brightgreen?style=for-the-badge)
![Topic: Hash%20Table](https://img.shields.io/badge/Topic-Hash%20Table-blue?style=for-the-badge)
![Topic: String](https://img.shields.io/badge/Topic-String-blue?style=for-the-badge)
![Topic: Counting](https://img.shields.io/badge/Topic-Counting-blue?style=for-the-badge)

## 📝 Problem Description

Given two strings `ransomNote` and `magazine`, return `true` *if `ransomNote` can be constructed by using the letters from `magazine` and `false` otherwise*.

Each letter in `magazine` can only be used once in `ransomNote`.

### Examples

#### Example 1
> **Input:** ransomNote = "a", magazine = "b"  
> **Output:** `false`  

#### Example 2
> **Input:** ransomNote = "aa", magazine = "ab"  
> **Output:** `false`  

#### Example 3
> **Input:** ransomNote = "aa", magazine = "aab"  
> **Output:** `true`  

### Constraints
* $1 \le \text{ransomNote.length, magazine.length} \le 10^5$
* `ransomNote` and `magazine` consist of lowercase English letters.

---