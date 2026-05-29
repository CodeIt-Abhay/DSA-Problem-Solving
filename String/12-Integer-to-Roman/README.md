# 012. Integer to Roman

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-orange?style=for-the-badge)
![Topic: Hash%20Table](https://img.shields.io/badge/Topic-Hash%20Table-blue?style=for-the-badge)
![Topic: Math](https://img.shields.io/badge/Topic-Math-blue?style=for-the-badge)
![Topic: String](https://img.shields.io/badge/Topic-String-blue?style=for-the-badge)

## 📝 Problem Description

Seven different symbols represent Roman numerals with the following values:

| Symbol | Value |
|--------|-------|
| I      | 1     |
| V      | 5     |
| X      | 10    |
| L      | 50    |
| C      | 100   |
| D      | 500   |
| M      | 1000  |

Roman numerals are heavily structured around combinations from highest to lowest value. However, the numeral for four is not `IIII`. Instead, the number four is written as `IV`. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as `IX`. 

There are six instances where subtraction is used:
* `I` can be placed before `V` (5) and `X` (10) to make 4 and 9. 
* `X` can be placed before `L` (50) and `C` (100) to make 40 and 90. 
* `C` can be placed before `D` (500) and `M` (1000) to make 400 and 900.

Given an integer `num`, convert it to a roman numeral.

### Examples

#### Example 1
> **Input:** `num = 3749`  
> **Output:** `"MMMDCCXLIX"`  
> **Explanation:** 3000 = MMM, 700 = DCC, 40 = XL, 9 = IX.

#### Example 2
> **Input:** `num = 58`  
> **Output:** `"LVIII"`  
> **Explanation:** 50 = L, 8 = VIII.

#### Example 3
> **Input:** `num = 1994`  
> **Output:** `"MCMXCIV"`  
> **Explanation:** 1000 = M, 900 = CM, 90 = XC, 4 = IV.

### Constraints
* $1 \le \text{num} \le 3999$

---
