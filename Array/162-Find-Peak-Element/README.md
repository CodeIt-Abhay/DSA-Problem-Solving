# 162. Find Peak Element

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-orange?style=for-the-badge)
![Topic: Array](https://img.shields.io/badge/Topic-Array-blue?style=for-the-badge)
![Topic: Binary%20Search](https://img.shields.io/badge/Topic-Binary%20Search-blue?style=for-the-badge)

## 📝 Problem Description

A peak element is an element that is strictly greater than its neighbors.

Given a **0-indexed** integer array `nums`, find a peak element, and return its index. If the array contains multiple peaks, return the index to **any of the peaks**.

You may imagine that `nums[-1] = -∞` and `nums[n] = -∞`. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.

You must write an algorithm that runs in $\mathcal{O}(\log n)$ time.

### Examples

#### Example 1
> **Input:** `nums = [1,2,3,1]`  
> **Output:** `2`  
> **Explanation:** 3 is a peak element and your function should return the index number 2.

#### Example 2
> **Input:** `nums = [1,2,1,3,5,6,4]`  
> **Output:** `5`  
> **Explanation:** Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.

### Constraints
* $1 \le \text{nums.length} \le 1000$
* $-2^{31} \le \text{nums}[i] \le 2^{31} - 1$
* `nums[i] != nums[i + 1]` for all valid `i`.