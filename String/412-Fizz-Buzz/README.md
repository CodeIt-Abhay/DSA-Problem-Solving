# 412. Fizz Buzz

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-brightgreen?style=for-the-badge)
![Topic: Array](https://img.shields.io/badge/Topic-Array-blue?style=for-the-badge)
![Topic: Math](https://img.shields.io/badge/Topic-Math-blue?style=for-the-badge)
![Topic: String](https://img.shields.io/badge/Topic-String-blue?style=for-the-badge)

## 📝 Problem Description

Given an integer `n`, return *a string array `answer` (**1-indexed**) where*:

* `answer[i] == "FizzBuzz"` if `i` is divisible by `3` and `5`.
* `answer[i] == "Fizz"` if `i` is divisible by `3`.
* `answer[i] == "Buzz"` if `i` is divisible by `5`.
* `answer[i] == "i"` (as a string) if none of the above conditions are true.

### Examples

#### Example 1
> **Input:** `n = 3`  
> **Output:** `["1","2","Fizz"]`  

#### Example 2
> **Input:** `n = 5`  
> **Output:** `["1","2","Fizz","4","Buzz"]`  

#### Example 3
> **Input:** `n = 15`  
> **Output:** `["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]`  

### Constraints
* $1 \le n \le 10^4$