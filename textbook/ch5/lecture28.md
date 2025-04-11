**CS 235 Lecture Summary - April 11, 2025**

### 📢 Announcements
- In-person classes will end after April 23.
- Starting April 24, all classes will be held **online via Zoom**.
- On April 25, there **may not be class** due to the instructor's schedule. A **pre-recorded lecture or activity** may be assigned instead.

---

## 🧱 Constructor Chaining Recap
Java uses **constructor chaining** to initialize an object from its base class upward:
- Every class in Java extends `Object` by default.
- When you create an object (e.g., of class `Faculty`), constructors for **all parent classes** are invoked in order:
    - `Object` constructor
    - `Person` constructor
    - `Employee` constructor
    - `Faculty` constructor

### ➕ Call Stack Order
Constructors are pushed onto a call stack (LIFO - Last In, First Out):
1. Main
2. Faculty
3. Employee
4. Person
5. Object

Then the stack is popped in reverse to initialize the object fully.

This structure guarantees that all levels of inheritance are initialized in the correct order.

---

## 🧬 Polymorphism and Inheritance
### Example:
```java
class Mammal {}
class Cat extends Mammal {}
class Whale extends Mammal {}
```
If `Cat` extends `Mammal`, then an instance of `Cat` is **also** an instance of `Mammal`.
This leads to **polymorphism**:
- A `Cat` **is-a** `Mammal`
- A `Whale` **is-a** `Mammal`

Therefore, if a method expects a `Mammal`, you can pass it a `Cat` or `Whale`.

```java
public static void printMammal(Mammal m) {
    System.out.println(m.name);  // OK
    m.meow();                    // ❌ Error! Not all mammals meow
}
```

### ⚠️ Important:
Passing a `Cat` to a method expecting a `Mammal` limits access to **Mammal-level** attributes and methods. You lose access to `Cat`-specific functionality like `meow()` unless you **cast** the object back.

---

## 🔗 Constructor Matching
Constructors in child classes must either:
- Call a **default constructor** from the superclass, or
- Call a **parameterized constructor** using `super()`

If no matching constructor exists, you get an error.

### Example Fix:
```java
public Cat(String name) {
    super(name, 5, 'M', "black", 12.0);
    this.breed = "DSH";
}
```
This ensures that `Mammal` fields are initialized **before** `Cat`-specific fields.

---

## 🐾 Summary
- All Java classes extend `Object`
- Constructors are chained up the hierarchy using `super()`
- Polymorphism allows a subclass to be treated as its superclass
- When treating a subclass as a superclass, you **lose access** to subclass-specific methods

Coming up next: **Overriding vs Overloading**

Stay tuned and have a great weekend!

