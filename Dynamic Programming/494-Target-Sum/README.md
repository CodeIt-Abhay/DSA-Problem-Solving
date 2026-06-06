# 494. Target Sum

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-orange?style=for-the-badge)
![Topic: Array](https://img.shields.io/badge/Topic-Array-blue?style=for-the-badge)
![Topic: Dynamic%20Programming](https://img.shields.io/badge/Topic-Dynamic%20Programming-blue?style=for-the-badge)
![Topic: Backtracking](https://img.shields.io/badge/Topic-Backtracking-blue?style=for-the-badge)

## 📝 Problem Description

You are given an integer array `nums` and an integer `target`.

You want to build an **expression** out of nums by adding one of the symbols `'+'` and `'-'` before each integer in `nums` and then concatenate all the integers.

* For example, if `nums = [2, 1]`, you can add a `'+'` before `2` and a `'-'` before `1` and concatenate them to build the expression `"+2-1"`.

Return the number of different **expressions** that you can build, which evaluates to `target`.

### Examples

#### Example 1
> **Input:** `nums = [1,1,1,1,1]`, `target = 3`  
> **Output:** `5`  
> **Explanation:** There are 5 ways to assign symbols to make the sum of nums be target 3.  
> `-1 + 1 + 1 + 1 + 1 = 3`  
> `+1 - 1 + 1 + 1 + 1 = 3`  
> `+1 + 1 - 1 + 1 + 1 = 3`  
> `+1 + 1 + 1 - 1 + 1 = 3`  
> `+1 + 1 + 1 + 1 - 1 = 3`  

#### Example 2
> **Input:** `nums = [1]`, `target = 1`  
> **Output:** `1`  

### Constraints
* $1 \le \text{nums.length} \le 20$
* $0 \le \text{nums}[i] \le 1000$
* $0 \le \sum \text{nums}[i] \le 1000$
* $-1000 \le \text{target} \le 1000$