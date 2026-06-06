# 416. Partition Equal Subset Sum

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-orange?style=for-the-badge)
![Topic: Array](https://img.shields.io/badge/Topic-Array-blue?style=for-the-badge)
![Topic: Dynamic%20Programming](https://img.shields.io/badge/Topic-Dynamic%20Programming-blue?style=for-the-badge)

## 📝 Problem Description

Given an integer array `nums`, return `true` *if you can partition the array into two subsets such that the sum of the elements in both subsets is equal, or `false` otherwise*.

### Examples

#### Example 1
> **Input:** `nums = [1,5,11,5]`  
> **Output:** `true`  
> **Explanation:** The array can be partitioned as `[1, 5, 5]` and `[11]`.

#### Example 2
> **Input:** `nums = [1,2,3,5]`  
> **Output:** `false`  
> **Explanation:** The array cannot be partitioned into equal sum subsets.

### Constraints
* $1 \le \text{nums.length} \le 200$
* $1 \le \text{nums}[i] \le 100$

---