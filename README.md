# 📘 Coding Practice

## 📂 HashMap

### 🔹 `LongestSubstring.java`
- **Problem**: Find the length of the longest substring without repeating characters.
- **Technique**: Sliding window.

### 🔹 `CharacterReplacement.java`
- **Problem**: Find the length of the longest substring after replacing at most `k` characters to make all characters the same.
- **Technique**: Sliding window with frequency counting.

---

## 📂 LinkedList

### 🔹 `ListReverse.java`
- **Problem**: Reverse a singly linked list.
- **Technique**: Iterative pointer manipulation (can be extended to recursive).

### 🔹 `MergeList.java`
- **Problem**: Merge two sorted singly linked lists.
- **Technique**: Iterative pointer manipulation (can be extended to recursive).

### 🔹 `CycleDetection.java`
- **Problem**: Detect if a cycle exists in a linked list.
- **Techniques**:
  - ✅ Floyd’s Tortoise and Hare — `O(n)` time, `O(1)` space.
  - 🧠 HashSet (alternate) — `O(n)` time, `O(n)` space.

### 🔹 `RemoveNode.java`
- **Problem**: Remove the N-th node from the end of the list.
- **Technique**: Two-pointer method with a dummy head to simplify edge cases.

### 🔹 `ReorderList.java`
- **Problem**: Reorder a linked list in-place as `L0 → Ln → L1 → Ln-1 → L2 → Ln-2 → …`
- **Technique**: Split list, reverse second half, and merge both halves.