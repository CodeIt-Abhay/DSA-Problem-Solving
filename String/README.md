# 🚀 String Mastery | DSA Problem Solving

## 📖 Overview of Strings

A **String** is a sequential data structure that stores a collection of characters used to represent textual data.

While conceptually simple as a sequence of characters, the architectural implementation, memory models, and underlying behaviors vary significantly across programming languages.

Strings allow:

- Character tracking using index
- Efficient parsing and text processing
- Global language localization (via Unicode)
- Foundation for text-processing pipelines

---

## 🔑 Key Characteristics of Strings

| Feature | Description |
|----------|-------------|
| Indexed Sequence | Individual characters are accessed using index numbers |
| Immutability / Mutability | Varies by language (e.g., Immutable in Java/Python, Mutable in C++) |
| Memory Pooling | Uses a String Constant Pool to reduce duplication overhead |
| Encoding Standards | Maps binary chunks to readable text using ASCII or UTF-8/UTF-16 |
| Variable Length | Often treated as dynamic, length-prefixed array structures |

---

## 📌 Why Strings Are Important in DSA

Strings are heavily used in:

- Text-Matching Algorithms
- Regular Expressions (Regex)
- Sliding Window Substring Problems
- Frequency Hashing (Anagram Patterns)
- Two Pointer Symmetric Problems
- Advanced Trees (Tries / Prefix Trees)
- Dynamic Programming (Edit Distance, LCS)
- Parsing / Compression (Huffman Coding)

Mastering strings is crucial for modern software engineering, web scraping, and database querying.

---

## ⚡ Time Complexity of Common Operations

| Operation | Time Complexity (Immutable) | Time Complexity (Mutable) |
|------------|-----------------------------|---------------------------|
| Access Index | O(1)                        | O(1)                      |
| Traversal    | O(n)                        | O(n)                      |
| Searching    | O(n)                        | O(n)                      |
| Concatenation| O(n + m)                    | O(m) *amortized*          |
| Substring    | O(k)                        | O(k)                      |

> ⚠️ **Performance Warning:** In immutable environments, appending a character inside a loop (`str += char`) forces an underlying full array copy operation every loop pass. This turns a simple routine into a hidden $\mathcal{O}(n^2)$ time disaster. Use classes like `StringBuilder` (Java/C#) or `.join()` mechanics (Python) to safely append strings in linear time.

---

# 🎯 About This Repository

Welcome to the **String** section of my DSA journey.  
This repository contains **LeetCode String problems solved topic-wise** with:

✅ Optimized Approaches  
✅ Clean Code  
✅ Interview-Oriented Solutions  
✅ Multiple Problem-Solving Patterns  
✅ Complexity Analysis

---

# 🧠 String Patterns Covered

| Pattern | Status |
|----------|---------|
| Basic Traversal & Parsing | ✅ |
| Two Pointers (Palindromes) | ✅ |
| Sliding Window (Substrings) | ✅ |
| Frequency Hashing (Anagrams)| ✅ |
| String Matching (KMP, Rabin-Karp) | ✅ |
| Trie-Based Prefix Lookups | ✅ |
| Math-Based String Conversions | ✅ |
| Dynamic Programming (LCS, Edit Distance) | ✅ |  

---
