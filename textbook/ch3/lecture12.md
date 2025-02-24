# CS 235 - Lecture Summary (February 24, 2025)

## **Topic:** Wrapping Up Static Variables and Introducing Encapsulation

### **Overview:**
Today, we concluded our discussion on **static variables** and **static methods**, clarifying why they are often called **class variables** and **class methods**. We then transitioned into the concept of **encapsulation**, a core principle of object-oriented programming (OOP), which focuses on protecting data fields from accidental or unauthorized modification.

---

### **Key Concepts:**

#### **1. Why Are Static Variables Called Class Variables?**
- **Static variables** belong to the **class itself**, not to any specific instance.
- Accessible from the class name or any instance (though accessing from instances is discouraged).
- Useful for storing data shared across all instances (e.g., tracking the number of created objects).
- **Instance variables** belong to specific objects and vary from instance to instance.

**Example:**
```java
public class Circle {
    private double radius; // Instance variable
    private static int numberOfObjects = 0; // Static variable (class variable)

    public Circle(double r) {
        radius = r; 
        numberOfObjects++; // Increment when a Circle is created
    }

    public static int getNumberOfObjects() {
        return numberOfObjects; // Static method
    }

    public double getArea() {
        return Math.PI * radius * radius; // Instance method
    }
}
```

#### **2. Accessing Static and Instance Variables:**
- **Static variables** are accessed via the class name (e.g., `Circle.getNumberOfObjects()`).
- **Instance variables** are accessed through specific instances (e.g., `circle1.getArea()`).
- Attempting to access an instance variable from a static context results in an error.

---

### **Encapsulation:**
- **Encapsulation** protects data fields from unintended modifications by restricting direct access.
- Achieved using **visibility modifiers**:
    - `public`: Accessible from anywhere.
    - `private`: Accessible only within the class.
- **Private fields** are accessed indirectly through **getters** and **setters**.

**Why encapsulate?**
- Prevents accidental changes to critical data.
- Keeps class implementation hidden from external classes (improves modularity and security).
- Allows controlled access to fields.

---

### **Refactored Circle Class with Encapsulation:**
```java
public class Circle {
    private double radius; // Private instance variable
    private static int numberOfObjects = 0; // Private static variable

    // Constructor
    public Circle(double r) {
        setRadius(r); // Use setter for encapsulation
        numberOfObjects++;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius with validation
    public void setRadius(double newRadius) {
        if (newRadius >= 0) {
            radius = newRadius;
        }
    }

    // Getter for static variable numberOfObjects
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }
}
```

#### **Accessing Encapsulated Fields in Main:**
```java
public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3.0);
        Circle circle2 = new Circle(5.0);

        System.out.println("Number of circles: " + Circle.getNumberOfObjects()); // 2
        System.out.println("Circle1 radius: " + circle1.getRadius()); // 3.0

        circle1.setRadius(4.0); // Change radius via setter
        System.out.println("Circle1 updated radius: " + circle1.getRadius()); // 4.0
    }
}
```

---

### **Encapsulation Benefits Demonstrated:**
- **Protected Data:** You cannot do `circle1.radius = 10;` because `radius` is private.
- **Controlled Updates:** `numberOfObjects` can only be changed through the constructor.
- **Safe Access:** Getters provide safe read access without allowing direct changes.

---

### **Practice Problems:**

#### **Problem 1: Book Class with Encapsulation**
Create a `Book` class with:
- Private instance variables: `title` (String), `author` (String), `pages` (int).
- Private static variable: `bookCount` to track how many books have been created.
- Public methods:
    - Constructor that increments `bookCount`.
    - `getTitle()`, `getAuthor()`, and `getPages()` getters.
    - `setPages(int pages)` setter with validation (pages > 0).
    - `getBookCount()` static method.

**Tasks:**
1. Create three `Book` objects and print the total number of books.
2. Try changing `pages` directly (should fail) and then use `setPages()`.
3. Access book details using getters.

---

#### **Problem 2: BankAccount Class with Private Balance**
Design a `BankAccount` class:
- Private instance variable: `balance` (double).
- Private static variable: `totalAccounts` (int).
- Public methods:
    - Constructor initializing balance and incrementing `totalAccounts`.
    - `deposit(double amount)` and `withdraw(double amount)` with validation.
    - `getBalance()` getter.
    - Static `getTotalAccounts()` method.

**Tasks:**
1. Create two accounts with initial balances.
2. Deposit and withdraw valid amounts, ensuring negative values are rejected.
3. Print the total number of accounts created.

---

#### **Problem 3: Temperature Class**
Create a `Temperature` class that:
- Has a private `celsius` variable.
- Provides a `setCelsius(double c)` and `getCelsius()`.
- Includes a `getFahrenheit()` method to convert Celsius to Fahrenheit.

**Tasks:**
1. Create an object and set the temperature.
2. Print temperatures in both Celsius and Fahrenheit.
3. Attempt to access `celsius` directly (observe the error).

---

#### **Problem 4: Encapsulation Violation Scenario**
Imagine a `Car` class with a public `speed` variable.
- Modify the class to make `speed` private.
- Add `accelerate(int amount)` and `decelerate(int amount)` methods.
- Add a `getSpeed()` getter.

**Questions:**
1. Why was making `speed` private a good idea?
2. How do getters and setters help maintain safe speed changes?

---

### **Next Class Preview:**
We’ll explore **abstraction** and how it helps hide complexity while exposing only relevant details.

---

### ✅ **Takeaways:**
- **Static variables** (class variables) belong to the class and are shared across instances.
- **Encapsulation** protects data by making fields private and controlling access through getters and setters.
- **Static methods** can’t access instance variables directly.
- **Good practice:** Always use class names to access static fields and methods.

---

🔔 **Reminder:** Make sure to follow JavaDoc formatting when documenting your code. Use getters and setters where appropriate to protect data fields.

💻 **See you next class!** 🚀

