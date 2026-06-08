# 🟦 Matrix | DSA Problem Solving

## 📖 Overview of Matrix

**Matrix problems** are a class of array-based problems that operate on a 2D grid of values. Unlike Matrix DP, these problems do not involve optimizing over subproblems — instead, they demand precise **simulation**, **traversal**, and **in-place transformation** of the grid itself.

The core challenge is manipulating the matrix correctly without corrupting values you still need to read, while keeping space usage minimal. These problems train your ability to reason about index arithmetic, directional movement, and state encoding inside the grid.

---

## 🔑 Core Techniques in Matrix Problems

| Technique | When It Applies |
|-----------|----------------|
| **In-Place Encoding** | Store two states in one cell (e.g., sign, sentinel values) to avoid using extra space. |
| **Layer-by-Layer Processing** | Operate on the outermost ring first, then move inward (Rotate Image, Spiral Matrix). |
| **Directional Simulation** | Maintain a direction vector `(dr, dc)` and rotate it when a boundary is hit. |
| **HashSet per Constraint Group** | Validate each row, column, and box independently using sets (Valid Sudoku). |
| **Two-Pass Marking** | First pass marks cells to change; second pass applies the change (Set Matrix Zeroes). |

---

## 📌 Problems Covered

| Problem | Difficulty | Core Technique |
|---------|------------|---------------|
| **Valid Sudoku** | 🟡 Medium | HashSet validation per row, column, and 3×3 box |
| **Spiral Matrix** | 🟡 Medium | Directional traversal with boundary shrinking |
| **Rotate Image** | 🟡 Medium | Transpose + horizontal flip in-place |
| **Set Matrix Zeroes** | 🟡 Medium | In-place sentinel encoding to avoid extra space |
| **Game of Life** | 🟡 Medium | Bit-encoded in-place state simulation |

---

## ⚠️ Common Mistakes & Edge Cases

| Mistake | Correct Approach |
|---------|-----------------|
| Zeroing rows/columns immediately in Set Matrix Zeroes | Use two passes — first mark, then apply. |
| Forgetting to guard `top <= bottom` in Spiral Matrix | Always guard inner traversals after shrinking boundaries. |
| Transposing the full matrix (including `i == j`) in Rotate Image | Only swap `j > i` pairs; the diagonal swaps with itself and is a no-op. |
| Reading `board[i][j]` directly for neighbor count in Game of Life | Use `board[i][j] & 1` to extract the original state after encoding has started. |
| Using one shared HashSet for all rows in Valid Sudoku | Each row, column, and box needs its own independent set. |

---

## 📊 Complexity Summary

| Problem | Time | Space |
|---------|------|-------|
| Valid Sudoku | `O(1)` (fixed 9×9) | `O(1)` |
| Spiral Matrix | `O(m × n)` | `O(1)` |
| Rotate Image | `O(n²)` | `O(1)` |
| Set Matrix Zeroes | `O(m × n)` | `O(1)` |
| Game of Life | `O(m × n)` | `O(1)` |

---

## 🧩 Pattern Recognition Checklist

Use these questions to identify which matrix technique to apply:

- [ ] Does the problem ask to **validate constraints per row, column, or region**? → **HashSet per group** (Valid Sudoku)
- [ ] Does the problem require **reading all elements in a non-standard order**? → **Boundary simulation** (Spiral Matrix)
- [ ] Does the problem ask to **transform the grid geometrically** (rotate, reflect)? → **Transpose + flip** (Rotate Image)
- [ ] Does the problem need to **propagate a value to an entire row or column**? → **Two-pass sentinel marking** (Set Matrix Zeroes)
- [ ] Does the problem require **simultaneous state updates** across the grid? → **In-place bit encoding** (Game of Life)