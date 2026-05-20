# 027. Remove Element

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-brightgreen?style=for-the-badge)
![Topic: Array](https://img.shields.io/badge/Topic-Array-blue?style=for-the-badge)
![Topic: Two%20Pointers](https://img.shields.io/badge/Topic-Two%20Pointers-blue?style=for-the-badge)

## 📝 Problem Description

Given an integer array `nums` and an integer `val`, remove all occurrences of `val` in `nums` [**in-place**](https://en.wikipedia.org/wiki/In-place_algorithm). The order of the elements may be changed. Then return *the number of elements in `nums` which are not equal to `val`*.

Consider the number of elements which are not equal to `val` be `k`, to get accepted, you need to do the following things:
1. Change the array `nums` such that the first `k` elements of `nums` contain the elements which are not equal to `val`. The remaining elements of `nums` are not important as well as the size of `nums`.
2. Return `k`.

### Examples

#### Example 1
> **Input:** `nums = [3,2,2,3]`, `val = 3`  
> **Output:** `2, nums = [2,2,_,_]`  
> **Explanation:** Your function should return k = 2, with the first two elements of nums being 2. It does not matter what you leave beyond the returned k (hence they are underscores).

#### Example 2
> **Input:** `nums = [0,1,2,2,3,0,4,2]`, `val = 2`  
> **Output:** `5, nums = [0,1,4,0,3,_,_,_]`  
> **Explanation:** Your function should return k = 5, with the first five elements of nums containing 0, 1, 3, 0, and 4. Note that the five elements can be returned in any order.

### Constraints
* $0 \le \text{nums.length} \le 100$
* $0 \le \text{nums}[i] \le 50$
* $0 \le \text{val} \le 100$