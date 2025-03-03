# CS 235 - Lecture Summary (March 3, 2025)

## Pass by Value vs. Pass by Reference

### Key Concepts:
- **Java is a Pass-by-Value Language**: When passing a variable to a method, Java passes a copy of the value, not the variable itself.
- **Passing Primitive Types**:
    - Example: `int x = 5; methodX(x);` → The method receives `5`, not `x`.
    - Any modifications inside `methodX` do not affect `x` in the calling method.
- **Passing Objects**:
    - Example: `Circle roundy = new Circle(); printCircle(roundy);`
    - What gets passed is **not the object itself** but **the reference (address) of the object**.
    - Modifying object properties inside the method affects the original object because both references point to the same memory location.

### Illustration:
- **Pass-by-Value (Primitives)**: The method works with a copy.
- **Pass-by-Reference-Like Behavior (Objects)**: The method modifies the original object due to shared reference.

---

## Scope of Variables in Java

### Types of Variables:
1. **Instance Variables** (Non-Static Fields):
    - Defined within a class but outside of methods.
    - Persist as long as the object exists.
    - Accessed using `this` keyword.

2. **Static Variables** (Class Fields):
    - Defined with `static` keyword.
    - Shared across all instances of the class.
    - Belong to the class rather than a specific object.

3. **Local Variables**:
    - Declared inside a method.
    - Exist only within the method scope.
    - Cannot be accessed outside the method.

### Example:
```java
public class Circle {
    private double radius;  // Instance variable
    private static int numberOfObjects = 0;  // Static variable

    public Circle(double radius) {
        this.radius = radius;  // 'this' differentiates instance variable
        numberOfObjects++;
    }
    
    public void someMethod() {
        int localVar = 10;  // Local variable
    }
}
```

### The `this` Keyword:
- Used to refer to the **current instance** of a class.
- Distinguishes between **instance variables** and **local variables** with the same name.
- Example:
```java
public Circle(double radius) {
    this.radius = radius;  // Refers to instance variable, not local one
}
```

---

## Constructor Overloading

### Overloading Constructors:
- Multiple constructors can exist within the same class, each with different parameters.
- Example:
```java
public class Circle {
    private double radius;
    
    public Circle() {
        this(1.0); // Calls parameterized constructor
    }
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public Circle(int radius) {
        this((double) radius); // Converts int to double and calls constructor
    }
}
```
- **Key Takeaways**:
    - The `this` keyword can invoke other constructors (constructor chaining).
    - The first statement in a constructor must be a call to another constructor (`this(...)`).

---

## Method Overloading

### What is Method Overloading?
- Multiple methods with the same name but different parameter lists.
- The compiler determines which method to call based on arguments passed.
- Example:
```java
public class Example {
    public void add(int x, int y) {
        System.out.println(x + y);
    }
    
    public void add(double x, double y) {
        System.out.println(x + y);
    }
    
    public void add(int x) {
        System.out.println(x + 2);
    }
}
```

---

## Object-Oriented Programming (OOP) and Class Design

### Key Principles:
1. **Encapsulation**: Protecting data fields by making them private and using getters/setters.
2. **Class Contracts**:
    - Defines how a class should be used.
    - Specifies available constructors and methods.
    - Example:
   ```java
   Circle c1 = new Circle();  // Default constructor
   Circle c2 = new Circle(5.0);  // Parameterized constructor
   ```

### Importance of Class Design:
- Focus is on **class structure**, not the main program.
- Classes should be reusable and modular.
- The **main program** should simply orchestrate interactions between objects.
- Example:
```java
public static void main(String[] args) {
    Circle myCircle = new Circle(10);
    System.out.println("Radius: " + myCircle.getRadius());
}
```

---

## Next Topics:
- Class Abstraction
- Superclasses and Subclasses
- Further Exploration of Encapsulation

---

# Practice Questions

1. **Pass by Value:**
    - What happens when you pass an `int` variable to a method in Java?
    - How is passing an object different from passing a primitive?

2. **Scope of Variables:**
    - What is the difference between instance, static, and local variables?
    - How does `this` help differentiate between instance and local variables?

3. **Constructor Overloading:**
    - Write a class `Rectangle` with overloaded constructors:
        - Default constructor (width = 1, height = 1)
        - Constructor accepting width and height
        - Constructor accepting width only (assume height = width)

4. **Method Overloading:**
    - Implement a class `Calculator` with overloaded `add()` methods for:
        - Two integers
        - Two doubles
        - A single integer (adds 10 by default)

5. **Encapsulation and Class Contracts:**
    - Why is it important to encapsulate data fields?
    - How does a class contract help other programmers use your class?

---

## Summary
- Java passes values, not variables, to methods.
- Object references behave like pass-by-reference due to memory addresses.
- Variables have different scopes: instance, static, and local.
- Overloaded constructors and methods improve class usability.
- Object-Oriented Programming is about **class design** rather than the main program.
- A good class design includes **encapsulation, contracts, and modularity**.

---

We will continue discussing class abstraction and subclassing in the next lecture.

