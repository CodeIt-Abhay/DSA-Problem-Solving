# 189. Rotate Array

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-orange?style=for-the-badge)
![Topic: Array](https://img.shields.io/badge/Topic-Array-blue?style=for-the-badge)
![Topic: Two%20Pointers](https://img.shields.io/badge/Topic-Two%20Pointers-blue?style=for-the-badge)
![Topic: Math](https://img.shields.io/badge/Topic-Math-blue?style=for-the-badge)

## 📝 Problem Description

Given an integer array `nums`, rotate the array to the right by `k` steps, where `k` is non-negative.

### Examples

#### Example 1
> **Input:** `nums = [1,2,3,4,5,6,7]`, `k = 3`  
> **Output:** `[5,6,7,1,2,3,4]`  
> **Explanation:**  
> rotate 1 steps to the right: `[7,1,2,3,4,5,6]`  
> rotate 2 steps to the right: `[6,7,1,2,3,4,5]`  
> rotate 3 steps to the right: `[5,6,7,1,2,3,4]`  

#### Example 2
> **Input:** `nums = [-1,-100,3,99]`, `k = 2`  
> **Output:** `[3,99,-1,-100]`  
> **Explanation:**   
> rotate 1 steps to the right: `[99,-1,-100,3]`  
> rotate 2 steps to the right: `[3,99,-1,-100]`  

### Constraints
* $1 \le \text{nums.length} \le 10^5$
* $-2^{31} \le \text{nums}[i] \le 2^{31} - 1$
* $0 \le k \le 10^5$

---

**Follow-up:**
* Try to come up with as many solutions as you can. There are at least **three** different ways to solve this problem.
* Could you do it in-place with $\mathcal{O}(1)$ extra space?