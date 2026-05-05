# 🚀 Assignment 3 – Sorting and Searching Algorithm Analysis System

---

# 📌 Project Overview

This project implements and compares three algorithms:

- **Bubble Sort** (Basic Sorting)
- **Merge Sort** (Advanced Sorting)
- **Binary Search** (Searching)

The purpose of this experiment is to analyze algorithm performance using different array sizes and input types.

Execution time was measured using `System.nanoTime()` to compare practical performance with theoretical Big-O complexity.

---

# 🧠 Selected Algorithms

---

## 🔹 1. Bubble Sort

### How It Works

Bubble Sort repeatedly compares adjacent elements and swaps them if they are in the wrong order.  
After each full pass, the largest element moves to the end of the array.

### Time Complexity

- Best Case: **O(n)**
- Average Case: **O(n²)**
- Worst Case: **O(n²)**

Bubble Sort is simple but inefficient for large datasets.

---

## 🔹 2. Merge Sort

### How It Works

Merge Sort uses the **divide-and-conquer** approach:

1. Divide the array into two halves
2. Recursively divide until single elements remain
3. Merge subarrays back together in sorted order

### Time Complexity

- Best Case: **O(n log n)**
- Average Case: **O(n log n)**
- Worst Case: **O(n log n)**

Merge Sort performs significantly better than Bubble Sort for medium and large arrays.

---

## 🔹 3. Binary Search

### How It Works

Binary Search works only on sorted arrays.

Steps:

1. Check the middle element
2. If target is smaller → search left half
3. If target is larger → search right half
4. Repeat until found

### Time Complexity

- Best Case: **O(1)**
- Average Case: **O(log n)**
- Worst Case: **O(log n)**

Binary Search is very efficient because it removes half of the search space during each step.

---

## Why does Binary Search require a sorted array?

Binary Search depends on the order of elements.

Without sorting, the algorithm cannot determine whether the target is located on the left or right side of the array.

---

# 🧪 Experimental Setup

## Array Sizes Tested

- Small — 10 elements
- Medium — 100 elements
- Large — 1000 elements

## Input Types

- Random arrays
- Already sorted arrays

Execution time was measured using:

```java
System.nanoTime();