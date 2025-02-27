# CS 235 - Lecture Summary (February 26, 2025)

## **Topic:** Encapsulation and Passing Objects to Methods

### **Overview:**
Today, we deepened our understanding of **encapsulation**, an essential concept in object-oriented programming. We discussed **visibility modifiers**, the importance of restricting direct access to data fields, and how to access and modify private fields using **getters and setters**. We also introduced the idea of **passing objects as arguments to methods**.

---

### **Key Concepts:**

#### **1. Visibility Modifiers in Java:**
- **Public (`public`)**: Accessible from any other class.
- **Private (`private`)**: Accessible only within the same class.
- **Package-Private (default visibility)**: Accessible only within the same package.
- **Protected (`protected`)**: Accessible within the same package and by subclasses.

**Example Code:**
```java
public class Circle {
    private double radius; // Private instance variable
    private static int numberOfObjects = 0; // Private static variable

    public Circle(double r) {
        setRadius(r); // Using setter for encapsulation
        numberOfObjects++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        if (newRadius > 0) {
            radius = newRadius;
        } else {
            radius = 1; // Default value for invalid input
        }
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }
}
```

#### **2. Why Use Encapsulation?**
- **Protects data from unintended modification** (e.g., preventing direct changes to `numberOfObjects`).
- **Improves maintainability** (changes to data fields are controlled through getters and setters).
- **Ensures validity** (e.g., ensuring radius is non-negative).

#### **3. Passing Objects to Methods**
- Java is **pass-by-value**, meaning when you pass an object to a method, you are passing **the reference** (memory address) of that object, not the actual object.
- Changes made to the object's attributes within the method persist outside the method.

**Example Code:**
```java
public class Main {
    public static void printCircle(Circle c) {
        System.out.println("The area of the circle with radius " + c.getRadius() + " is " + c.getArea());
    }

    public static void main(String[] args) {
        Circle myCircle = new Circle(5.0);
        printCircle(myCircle); // Passing an object to a method
    }
}
```

#### **Output:**
```
The area of the circle with radius 5.0 is 78.53981633974483
```

---

### **Practice Problems:**

#### **Problem 1: Student Class with Encapsulation**
Create a `Student` class with:
- Private instance variables: `name` (String), `age` (int), `gpa` (double).
- A **static variable** `studentCount` to track the number of students.
- A constructor that increments `studentCount`.
- Getters and setters for all fields with validation (`age` should be > 0, `gpa` should be between 0.0 and 4.0).

**Tasks:**
1. Create multiple student objects and print the total count.
2. Try modifying the `gpa` directly (should fail) and use the setter instead.
3. Access student details using getters.

---

#### **Problem 2: BankAccount Class with Secure Balance**
Design a `BankAccount` class with:
- Private instance variable: `balance` (double).
- A **static variable** `totalAccounts`.
- Public methods:
    - `deposit(double amount)` and `withdraw(double amount)` (validating that balance doesn’t go negative).
    - `getBalance()` getter.
    - Static method `getTotalAccounts()`.

**Tasks:**
1. Create bank accounts and test deposits/withdrawals.
2. Print the total number of accounts created.
3. Try directly modifying `balance` (should fail) and use setters.

---

#### **Problem 3: Passing Objects to Methods**
Modify the `Circle` class:
- Add a **static method** `printCircleInfo(Circle c)` that prints the radius and area of a given circle.
- Create `Circle` objects and pass them to `printCircleInfo()`.

**Questions:**
- What happens when you modify the circle’s radius inside `printCircleInfo()`?
- Does the change persist outside the method?

---

### **Next Class Preview:**
We will continue exploring **passing objects to methods** and begin discussing **arrays of objects**.

---

### ✅ **Takeaways:**
- **Encapsulation** protects data and ensures maintainability.
- **Visibility modifiers** determine access to variables and methods.
- **Passing objects to methods** sends a reference, not the actual object.
- **Good practice:** Always use getters and setters instead of direct variable manipulation.

---

🔔 **Reminder:** Follow JavaDoc formatting when documenting your code. Properly encapsulate class fields to protect data integrity.

💻 **See you next class!** 🚀

