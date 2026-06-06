# 072. Edit Distance

![Difficulty: Hard](https://img.shields.io/badge/Difficulty-Hard-red?style=for-the-badge)
![Topic: String](https://img.shields.io/badge/Topic-String-blue?style=for-the-badge)
![Topic: Dynamic%20Programming](https://img.shields.io/badge/Topic-Dynamic%20Programming-blue?style=for-the-badge)

## 📝 Problem Description

Given two strings `word1` and `word2`, return *the minimum number of operations required to convert `word1` to `word2`*.

You have the following three operations permitted on a word:
1. Insert a character
2. Delete a character
3. Replace a character

### Examples

#### Example 1
> **Input:** `word1 = "horse"`, `word2 = "ros"`  
> **Output:** `3`  
> **Explanation:** > horse -> rorse (replace 'h' with 'r')  
> rorse -> rose (remove 'r')  
> rose -> ros (remove 'e')  

#### Example 2
> **Input:** `word1 = "intention"`, `word2 = "execution"`  
> **Output:** `5`  
> **Explanation:** > intention -> inention (remove 't')  
> inention -> enention (replace 'i' with 'e')  
> enention -> exention (replace 'n' with 'x')  
> exention -> exection (replace 'n' with 'c')  
> exection -> execution (insert 'u')  

### Constraints
* $0 \le \text{word1.length, word2.length} \le 500$
* `word1` and `word2` consist of lowercase English letters.

---