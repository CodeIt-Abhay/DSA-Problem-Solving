# 169. Majority Element

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-brightgreen?style=for-the-badge)
![Topic: Array](https://img.shields.io/badge/Topic-Array-blue?style=for-the-badge)
![Topic: Hash%20Table](https://img.shields.io/badge/Topic-Hash%20Table-blue?style=for-the-badge)
![Topic: Divide%20and%20Conquer](https://img.shields.io/badge/Topic-Divide%20and%20Conquer-blue?style=for-the-badge)
![Topic: Sorting](https://img.shields.io/badge/Topic-Sorting-blue?style=for-the-badge)
![Topic: Counting](https://img.shields.io/badge/Topic-Counting-blue?style=for-the-badge)

## 📝 Problem Description

Given an array `nums` of size `n`, return *the majority element*.

The majority element is the element that appears more than $\lfloor n / 2 \rfloor$ times. You may assume that the majority element always exists in the array.

### Examples

#### Example 1
> **Input:** `nums = [3,2,3]`  
> **Output:** `3`  

#### Example 2
> **Input:** `nums = [2,2,1,1,1,2,2]`  
> **Output:** `2`  

### Constraints
* $n == \text{nums.length}$
* $1 \le n \le 5 \times 10^4$
* $-10^9 \le \text{nums}[i] \le 10^9$

---

**Follow-up:** Could you solve the problem in linear time and in $\mathcal{O}(1)$ space?