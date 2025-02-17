# CIDS 235 - Reference Variables and Memory Management

## Reference Variables

- Objects are complex data structures that cannot be stored in a single variable like primitives (integers, doubles, characters).
- Instead, we use **reference variables**, which store memory addresses pointing to objects.
- Example: `int i = 1;` directly stores `1`, but `Circle c = new Circle();` stores a reference to the circle object in memory.

## Arrays and Memory Representation

- Arrays are **contiguous** (memory slots are touching) and **homogeneous** (same data type).
- Example: `int[] myArray = {1, 2, 7, 9, 13};`
- The array reference variable stores the memory address of the first element, allowing indexing calculations.

## Differences Between Primitive and Reference Types

| Type | Stored Data |
|------|------------|
| **Primitive (int, double, char, etc.)** | Stores the actual value |
| **Reference (objects, arrays)** | Stores memory address pointing to object |

Example:
```java
int i = 1; // Stores 1 directly
Circle c = new Circle(); // Stores reference to memory location of circle
```

## Object Assignment and Memory Referencing

- Assigning reference variables copies the memory address, **not** the object itself.
- Example:
```java
Circle c1 = new Circle(5); // c1 points to a circle with radius 5
Circle c2 = new Circle(9); // c2 points to a different circle with radius 9
c1 = c2; // Now c1 and c2 point to the same circle
```
- This means `c1` no longer references the original circle (radius 5), making it **eligible for garbage collection**.

## Garbage Collection in Java

- Java has **automatic garbage collection** to remove objects no longer referenced.
- Example:
```java
c1 = null; // The circle c1 was pointing to may now be collected
```
- **C++ does not have automatic garbage collection**, requiring manual memory management.

## Memory Leaks

- In C++, if objects are not manually deleted, they stay in memory, leading to **memory leaks**.
- Java prevents this with garbage collection.

## Static Variables

- **Instance Variables** belong to an object (each instance has its own copy).
- **Static Variables** belong to the **class**, shared by all instances.
- Example:
```java
public class Circle {
    public double radius; // Instance variable
    public static int circleCount = 0; // Static variable
}
```
- Every circle object has its own `radius`, but `circleCount` is shared across all circles.

## Review Questions

1. What is the difference between a primitive variable and a reference variable?
2. How does Java store arrays in memory?
3. What happens when you assign one reference variable to another in Java?
4. Explain the concept of garbage collection in Java.
5. What is a memory leak, and how does Java prevent them?
6. What is the difference between an instance variable and a static variable?
7. What happens if you set a reference variable to `null`?
8. Why do Java objects use reference variables instead of being stored directly like primitives?
9. How do reference variables allow for efficient memory usage in Java?
10. In what scenarios would you want to use a static variable instead of an instance variable?