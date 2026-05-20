# 014. Longest Common Prefix

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-brightgreen?style=for-the-badge)
![Topic: String](https://img.shields.io/badge/Topic-String-blue?style=for-the-badge)
![Topic: Trie](https://img.shields.io/badge/Topic-Trie-blue?style=for-the-badge)

## 📝 Problem Description

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string `""`.

### Examples

#### Example 1
> **Input:** `strs = ["flower","flow","flight"]`  
> **Output:** `"fl"`  

#### Example 2
> **Input:** `strs = ["dog","racecar","car"]`  
> **Output:** `""`  
> **Explanation:** There is no common prefix among the input strings.

### Constraints
* $1 \le \text{strs.length} \le 200$
* $0 \le \text{strs}[i].text{length} \le 200$
* `strs[i]` consists of only lowercase English letters if it is non-empty.