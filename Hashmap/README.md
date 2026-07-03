# 🗝️ HashMap Data Structure | DSA Mastery

## 📖 Overview of HashMaps

A **HashMap** (or Hash Table) is a data structure that implements an associative array abstract data type, mapping unique **keys** to **values**. It provides incredibly fast data access by using a mathematical function, called a **hash function**, to compute an index into an array of buckets or slots, from which the desired value can be found.



Wherever you need to track frequencies, look up relationships instantly, or cache calculated states, a HashMap is the primary optimization tool to crush brute-force time boundaries.

---

## 🔑 Core Pillars & Mechanics

A HashMap maintains high performance by balancing three underlying structural mechanics:

| Component / Mechanic | Description |
|:---|:---|
| **Hash Function** | A deterministic algorithm that converts a variable-sized key into a fixed integer index within the array bounds. |
| **Collision Resolution** | The strategy used when two distinct keys generate the exact same array index (e.g., **Chaining** via Linked Lists/Red-Black Trees or **Open Addressing** via Probing). |
| **Load Factor & Rehashing** | The ratio of items stored to total capacity ($\text{Load Factor} = \frac{N}{\text{Capacity}}$). When this exceeds a threshold (typically `0.75`), the array size doubles and all keys are re-mapped. |

---

## ⚡ The Big-O Time Profile

Under ideal conditions where elements are uniformly distributed across buckets, a HashMap operates on **constant time complexity**:

* **Insertion / Put:** $\mathcal{O}(1)$ average case $\rightarrow$ $\mathcal{O}(N)$ worst case (when collisions stack keys into a single bucket chain).
* **Deletion / Remove:** $\mathcal{O}(1)$ average case $\rightarrow$ $\mathcal{O}(N)$ worst case.
* **Lookup / Get / Contains:** $\mathcal{O}(1)$ average case $\rightarrow$ $\mathcal{O}(N)$ worst case.
* **Space Complexity:** $\mathcal{O}(N)$ linear footprint required to maintain the map collection entries.

---

## 📌 Common Architectural Sub-Patterns

HashMap interview puzzles generally resolve into one of these core practical archetypes:

- **Frequency Counters:** Tracking counts of elements, characters, or substrings.  
  *Examples:* Two Sum, First Unique Character in a String, Top K Frequent Elements.
- **Index Re-Mapping & Complements:** Storing the index of past items to instantly look backwards and validate mathematical targets.  
  *Examples:* Two Sum, Subarray Sum Equals K.
- **Grouping & Categorization:** Hash matching structural representations to gather items together.  
  *Examples:* Group Anagrams.
- **Cache Design Protocols:** Combining HashMaps with Doubly Linked Lists to track insertion or access order sequences.  
  *Examples:* LRU Cache, LFU Cache.

---

# 🎯 The 3-Step Interview Recipe for HashMaps

When applying a HashMap to solve an algorithmic problem during an interview, walk through this systematic execution framework:

### 1. Define the Key-Value Contract
Determine exactly what mapping properties are required to unlock your solution.  
*Example:* Key = The remaining numerical value needed to hit target (`target - nums[i]`), Value = The current item's array index `i`.

### 2. Guard Against the `Null` / Missing Key Bug
Always enforce a structural boundary lookup check (`containsKey()`) before pulling values out to prevent `NullPointerException` crashes.

### 3. Leverage `getOrDefault()` for Clean Transitions
Instead of writing verbose `if-else` blocks to handle updating count trackers, write idiomatic, high-performance updates:
```java
map.put(key, map.getOrDefault(key, 0) + 1);