# CIDS 235 - Functional Programming

## Introduction
**Date:** January 31, 2025  
**Topic:** Introduction to Functional Programming

Functional programming is a paradigm that treats computation as the evaluation of mathematical functions while avoiding changes in state and mutable data. It is particularly useful in data science and parallel computing.

### Core Principles of Functional Programming
1. **Pure Functions** - Functions that always return the same output for the same input and have no side effects.
2. **Immutability** - Avoid modifying existing data; instead, create new data structures.
3. **First-Class Functions** - Functions can be assigned to variables, passed as arguments, and returned from other functions.
4. **Higher-Order Functions** - Functions that take other functions as arguments or return them as results.
5. **Lambda Functions** - Anonymous functions that are used for short operations.
6. **Built-in Functional Programming Tools** - Python provides functions like `map()`, `filter()`, and `reduce()` to facilitate functional programming.

---

## Pure Functions
A **pure function** satisfies two conditions:
1. Always returns the same output for the same input.
2. Does not modify any external state (no side effects).

### Example of a Pure Function
```python
def add(x, y):
    return x + y

print(add(5, 10))  # Output: 15
```

### Example of an Impure Function
```python
total = 0

def add_to_total(x):
    global total
    total += x  # Modifies external state
    return total

print(add_to_total(10))  # Output: 10
print(add_to_total(5))   # Output: 15
```
The second function is **impure** because it modifies `total`, a global variable.

---

## Immutability
Functional programming discourages modifying data structures. Instead of changing a dataset, **create a new version** with the necessary modifications.

### ❌ Modifying a List (Not Recommended)
```python
lst = [1, 2, 3, 4]
lst.append(5)  # Modifies the original list
print(lst)  # Output: [1, 2, 3, 4, 5]
```

### ✅ Immutable Approach (Recommended)
```python
lst = [1, 2, 3, 4]
new_lst = lst + [5]  # Creates a new list
print(new_lst)  # Output: [1, 2, 3, 4, 5]
print(lst)  # Output: [1, 2, 3, 4] (Original remains unchanged)
```

💡 **Why is this important?**
- Ensures data integrity.
- Useful in **data science**, where datasets should never be modified directly.

---

## First-Class and Higher-Order Functions
### First-Class Functions
Functions in Python can be assigned to variables and passed around like data types.

```python
def square(x):
    return x * x

f = square  # Assign function to a variable
print(f(5))  # Output: 25
```

### Higher-Order Functions
A **higher-order function** takes another function as an argument.

```python
def apply_twice(func, x):
    return func(func(x))

print(apply_twice(square, 2))  # Output: 16 (2² = 4, 4² = 16)
```

---

## Lambda Functions
**Lambda functions** are small, anonymous functions for quick operations.

### Equivalent to a Named Function
```python
# Named function
def square(x):
    return x * x

# Lambda function
square_lambda = lambda x: x * x

print(square_lambda(4))  # Output: 16
```

### Using Lambdas in Functional Programming
```python
numbers = [1, 2, 3, 4]
squared_numbers = list(map(lambda x: x * x, numbers))
print(squared_numbers)  # Output: [1, 4, 9, 16]
```

---

## Built-in Functional Programming Tools in Python
### **Map Function**
Applies a function to every item in an iterable.
```python
numbers = [1, 2, 3, 4]
squared = list(map(lambda x: x * x, numbers))
print(squared)  # Output: [1, 4, 9, 16]
```

### **Filter Function**
Filters elements based on a condition.
```python
numbers = [1, 2, 3, 4, 5, 6]
evens = list(filter(lambda x: x % 2 == 0, numbers))
print(evens)  # Output: [2, 4, 6]
```

### **Reduce Function** (from `functools` module)
Reduces an iterable to a single value by applying a function cumulatively.
```python
from functools import reduce
numbers = [1, 2, 3, 4]
product = reduce(lambda x, y: x * y, numbers)
print(product)  # Output: 24
```

---

## Why Use Functional Programming?
✅ **Easier Debugging** – Less dependency on global state.  
✅ **Avoids Concurrency Issues** – No shared mutable state.  
✅ **More Readable Code** – Functions describe transformations clearly.  
✅ **Less Bug-Prone** – No unexpected side effects.

---

## **Next Steps**
On **Monday**, we will start discussing **Object-Oriented Programming (OOP)**, which is the primary paradigm for this course.

📌 **Reminder:** Office hours are available today if you have questions.

📅 **Have a great weekend!**

