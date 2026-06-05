# 300. Longest Increasing Subsequence

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-orange?style=for-the-badge)
![Topic: Array](https://img.shields.io/badge/Topic-Array-blue?style=for-the-badge)
![Topic: Binary%20Search](https://img.shields.io/badge/Topic-Binary%20Search-blue?style=for-the-badge)
![Topic: Dynamic%20Programming](https://img.shields.io/badge/Topic-Dynamic%20Programming-blue?style=for-the-badge)

## 📝 Problem Description

Given an integer array `nums`, return *the length of the longest strictly **increasing subsequence***.

A **subsequence** is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements. For example, `[3,6,2,7]` is a subsequence of the array `[0,3,1,6,2,2,7]`.

### Examples

#### Example 1
> **Input:** `nums = [10,9,2,5,3,7,101,18]`  
> **Output:** `4`  
> **Explanation:** The longest increasing subsequence is `[2,5,7,101]`, therefore the length is 4.  
> (Another valid subsequence is `[2,3,7,18]`).

#### Example 2
> **Input:** `nums = [0,1,0,3,2,3]`  
> **Output:** `4`  

#### Example 3
> **Input:** `nums = [7,7,7,7,7,7,7]`  
> **Output:** `1`  

### Constraints
* $1 \le \text{nums.length} \le 2500$
* $-10^4 \le \text{nums}[i] \le 10^4$

---