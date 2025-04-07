**CS 235 - April 9, 2025**

**Topic: Constructor Chaining and Inheritance**

---

### Summary:

In today’s class, we explored constructor chaining and how inheritance plays a role in constructing objects in Java. We discussed how every class implicitly or explicitly extends the `Object` class, and how constructors behave in a multi-level inheritance hierarchy. Dr. T used a university staff hierarchy (`Person`, `Employee`, `Faculty`) to illustrate the concept of constructor chaining.

---

### Key Concepts:

**1. Inheritance and Constructors:**
- Every class in Java inherits from the `Object` class.
- Constructors are not inherited like methods and properties.
- When an object is instantiated, constructors are called from top to bottom along the inheritance chain.
- This automatic behavior is called **constructor chaining**.

**2. Constructor Chaining:**
- Each constructor (unless explicitly stated otherwise) begins by calling the constructor of its parent class.
- This behavior ensures that the object is built in layers from its most abstract form (i.e., `Object`) to its most specific (i.e., `Faculty`).
- Constructors can be invoked using the `super()` keyword.
- `super()` must be the **first line** in any constructor if it is used.
- Java automatically inserts a call to the no-argument `super()` constructor if no other constructor call is specified.

**3. Example Hierarchy:**
```java
class Person {
    public Person() {
        System.out.println("1. Performs person tasks");
    }
}

class Employee extends Person {
    public Employee() {
        this("default");
        System.out.println("3. Performs employee tasks");
    }

    public Employee(String s) {
        System.out.println("2. Invokes employee's overloaded constructor");
    }
}

class Faculty extends Employee {
    public Faculty() {
        System.out.println("4. Performs faculty tasks");
    }
}
```

**4. Execution Flow:**
Instantiating a `Faculty` object triggers the following:
```
1. Performs person tasks
2. Invokes employee's overloaded constructor
3. Performs employee tasks
4. Performs faculty tasks
```
This sequence reflects the constructor calls from superclass to subclass.

**5. The `this()` Keyword:**
- Used to call another constructor in the **same class**.
- Also must be the first statement in the constructor body.

**6. Stack Trace Analogy:**
- When constructors are called, they are pushed onto the call stack.
- The execution follows a **Last In, First Out** (LIFO) model.
- Understanding this stack behavior helps in debugging when a runtime error occurs.

**7. Stack Trace Example:**
When Java prints a stack trace after a runtime error, it shows the sequence of method calls that led to the error. This reflects the current state of the call stack at the time the error occurred.

---

### Additional Notes:
- Constructor chaining is mostly implicit but can be controlled for clarity and precision using `super()`.
- Java does not allow multiple explicit constructor calls in the same constructor.

---

### Next Class:
We'll take a deeper look at **overriding methods** and how it differs from **overloading**. Overriding is defining a method in a subclass that already exists in a parent class, while overloading refers to multiple methods with the same name but different parameters.

---

