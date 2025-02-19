# CS 235 - Lecture Summary (February 19, 2025)

## **Topic:** Instance Variables vs. Static Variables (Class Variables)

### **Overview:**
Today, we explored the difference between **instance variables** and **static variables** in Java. We discussed how instance variables are unique to each object, whereas static variables belong to the class itself, shared across all instances. We also introduced **static methods** and how they differ from instance methods.

---

### **Key Concepts:**

#### **1. Instance Variables:**
- Belong to individual objects created from a class.
- Each object has its own copy of instance variables.
- Example: Each `Circle` object has its own `radius`.

#### **2. Static Variables (Class Variables):**
- Belong to the class rather than any single instance.
- Shared across all instances of the class.
- Useful for keeping track of information common to all instances (e.g., the number of objects created).
- Declared using the `static` keyword.

#### **Example Code (Without the `this` keyword):**
```java
public class Circle {
    double radius; // Instance variable
    static int numberOfObjects = 0; // Static variable

    // Constructor with radius parameter
    public Circle(double r) {
        radius = r; // Assigns the radius (no 'this' keyword used)
        numberOfObjects++; // Increments the static variable when a Circle is created
    }

    // Static method to get the number of objects
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    // Instance method to calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
```

#### **3. Accessing Static Variables and Methods:**
- Preferred way: Use the class name (e.g., `Circle.getNumberOfObjects()`).
- Not recommended: Accessing through an object (e.g., `circle1.numberOfObjects`) as it may cause confusion.

#### **4. Practical Example:**
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Number of circles: " + Circle.getNumberOfObjects()); // 0

        Circle circle1 = new Circle(3.0);
        System.out.println("Number of circles: " + Circle.getNumberOfObjects()); // 1

        Circle circle2 = new Circle(5.0);
        System.out.println("Number of circles: " + Circle.getNumberOfObjects()); // 2

        System.out.println("Area of circle1: " + circle1.getArea());
        System.out.println("Area of circle2: " + circle2.getArea());
    }
}
```

#### **Output:**
```
Number of circles: 0
Number of circles: 1
Number of circles: 2
Area of circle1: 28.274333882308138
Area of circle2: 78.53981633974483
```

---

### **Important Points:**
- **Instance variables** are accessed through objects, whereas **static variables** are accessed through the class.
- **Static methods** cannot directly access **instance variables** because they do not belong to any specific instance.
- Be cautious when allowing static variables to be modified directly; it can lead to unintended consequences if misused.

---

### **UML Representation:**
**Circle Class:**
- *radius*: double (instance variable)
- _numberOfObjects_: int (static variable, underlined to indicate static)
+ Circle(double)
+ getArea(): double
+ _getNumberOfObjects()_: int

(Static members are underlined in UML to distinguish them from instance members.)

---

### **Practice Questions:**
1. What is the difference between an instance variable and a static variable?
2. Why is it generally not recommended to access a static variable through an instance?
3. What will be the value of `numberOfObjects` after creating three `Circle` objects?
4. Why can a static method not directly access an instance variable?
5. Modify the `Circle` class to include a method that resets `numberOfObjects` to zero. Why might this be risky?

---

### **Practice Problems:**

#### **Problem 1: Student Class Tracker**
Create a `Student` class with the following requirements:
- An **instance variable** `name` (String) for the student's name.
- A **static variable** `totalStudents` (int) that tracks how many `Student` objects have been created.
- A constructor that sets the name and increments `totalStudents`.
- A static method `getTotalStudents()` that returns the total number of students.

**Test:** Create three `Student` objects and print out the total number of students.

---

#### **Problem 2: Car Production Counter**
Create a `Car` class with:
- An **instance variable** `model` (String).
- An **instance variable** `year` (int).
- A **static variable** `carsProduced` that counts how many `Car` instances have been created.
- Add a constructor to initialize the `model` and `year` and increment `carsProduced`.
- Write a **static method** `getCarsProduced()` that returns the number of cars created.

**Bonus:** Add an instance method `displayCarInfo()` that prints the model and year.

---

#### **Problem 3: Bank Account Tracker**
Write a `BankAccount` class with:
- An **instance variable** `balance` (double).
- A **static variable** `totalAccounts` to keep track of the total number of accounts.
- A constructor that initializes the balance and increments `totalAccounts`.
- A **static method** `getTotalAccounts()` to return the total accounts.
- An **instance method** `deposit(double amount)` to add to the balance.

**Challenge:** Create a few accounts and print their balances and the total number of accounts.

---

#### **Problem 4: Static vs. Instance Methods**
In the `Circle` class:
- Add a **static method** `printTotalCircles()` that prints the number of circles created.
- Add an **instance method** `printRadius()` that prints the radius of the circle.

**Questions:**
- Why can `printRadius()` not be made static?
- What happens if you try to call `printRadius()` without creating a `Circle` object?

---

### **Next Class Preview:**
We will address the potential problems with static variable access and how to safeguard against unintended modifications.

---

### ✅ **Takeaway:**
- **Instance variables**: Belong to objects.
- **Static variables**: Belong to the class.
- **Static methods**: Operate at the class level and cannot access instance variables directly.
- **Best practice**: Access static members using the class name to avoid confusion.

---

🔔 **See you next class!** We'll be diving deeper into protecting static variables and refining class designs for better data integrity.

