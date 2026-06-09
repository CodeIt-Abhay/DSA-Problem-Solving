# 073. Set Matrix Zeroes

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-orange?style=for-the-badge)
![Topic: Array](https://img.shields.io/badge/Topic-Array-blue?style=for-the-badge)
![Topic: Hash%20Table](https://img.shields.io/badge/Topic-Hash%20Table-blue?style=for-the-badge)
![Topic: Matrix](https://img.shields.io/badge/Topic-Matrix-blue?style=for-the-badge)

## 📝 Problem Description

Given an `m x n` integer matrix `matrix`, if an element is `0`, set its entire row and column to `0`'s.

You must do it [**in-place**](https://en.wikipedia.org/wiki/In-place_algorithm).

### Examples

#### Example 1
![Set Matrix Zeroes Example 1](https://assets.leetcode.com/uploads/2020/08/17/mat1.jpg)
> **Input:** matrix = [[1,1,1],[1,0,1],[1,1,1]]  
> **Output:** `[[1,0,1],[0,0,0],[1,0,1]]`  

#### Example 2
![Set Matrix Zeroes Example 2](https://assets.leetcode.com/uploads/2020/08/17/mat2.jpg)
> **Input:** matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]  
> **Output:** `[[0,0,0,0],[0,4,5,0],[0,3,1,0]]`  

### Constraints
* `matrix.length == m`
* `matrix[0].length == n`
* $1 \le m, n \le 200$
* $-2^{31} \le \text{matrix}[i][j] \le 2^{31} - 1$

---