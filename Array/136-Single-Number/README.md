# 136. Single Number

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-brightgreen?style=for-the-badge)
![Topic: Array](https://img.shields.io/badge/Topic-Array-blue?style=for-the-badge)
![Topic: Bit%20Manipulation](https://img.shields.io/badge/Topic-Bit%20Manipulation-blue?style=for-the-badge)

## 📝 Problem Description

Given a **non-empty** array of integers `nums`, every element appears *twice* except for one. Find that single one.

You must implement a solution with a **linear runtime complexity** and use only **constant extra space**.

### Examples

#### Example 1
> **Input:** `nums = [2,2,1]`  
> **Output:** `1`  

#### Example 2
> **Input:** `nums = [4,1,2,1,2]`  
> **Output:** `4`  

#### Example 3
> **Input:** `nums = [1]`  
> **Output:** `1`  

### Constraints
* $1 \le \text{nums.length} \le 3 \times 10^4$
* $-3 \times 10^4 \le \text{nums}[i] \le 3 \times 10^4$
* Each element in the array appears twice except for one element which appears only once.