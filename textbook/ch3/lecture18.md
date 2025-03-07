# **Object-Oriented Programming: Class Abstraction and Encapsulation... and Strings**

## **Midterm Schedule Update**
The midterm exam has been rescheduled to **March 20, 2025** (Wednesday after spring break). Originally planned for next week, the change was made to ensure adequate preparation, as only one quiz had been given at the time. Additionally, **Assignment 2** will be assigned on **March 10** and will be due on **March 31**. This assignment will focus on **encapsulation**.

## **Object-Oriented Thinking and Abstraction**
Object-oriented programming (OOP) allows us to abstract away complex implementations, focusing instead on essential building blocks that matter to the **client** (user of the class). The key idea behind **abstraction** is to separate **implementation details** from **how a class is used**.

### **The Loan Class Example**
In our previous lecture, we explored how **abstraction** allows us to design a class without needing to know the underlying implementation. Consider the `Loan` class:

- **Data Fields**:
    - `annualInterestRate` (double)
    - `loanAmount` (double)
    - `numberOfYears` (int)
    - `loanDate` (Date)
- **Constructors**:
    - Default constructor
    - Parameterized constructor
- **Methods**:
    - Getters: `getAnnualInterestRate()`, `getNumberOfYears()`, `getLoanAmount()`, `getLoanDate()`
    - Setters: `setAnnualInterestRate()`, `setNumberOfYears()`, `setLoanAmount()`
    - `getMonthlyPayment()`, `getTotalPayment()`

This **class contract** defines how users interact with the `Loan` class without needing to know the inner workings of each method.

### **Class Contracts and Large Language Models (LLMs)**
With advancements in AI, programmers can now define **class contracts**, input them into tools like ChatGPT, and have the **implementation automatically generated**. This concept is called **metaprogramming** and is a growing trend in software development.

## **Encapsulation and Abstraction in Practice**
Encapsulation is the mechanism of restricting direct access to some components of an object, which allows abstraction to function effectively.

### **Example: Java’s Built-in `Math.random()`**
The `Math.random()` method provides a **random number** but hides the underlying implementation. Users do not need to understand how the **pseudo-random number generator** works to utilize it effectively. Similarly, **class abstraction** separates what a class does from how it does it.

## **Strings in Java: An Object-Oriented Approach**
Most students are familiar with using `String` but may not realize that **`String` is a class** in Java.

```java
String message = new String("Hello World");  // Equivalent to String message = "Hello World";
```

- **A `String` is immutable**, meaning modifications create a new string rather than altering the original.
- Internally, Java stores a `String` as an **array of characters**.
- Strings have built-in methods like `.charAt()`, `.length()`, `.toUpperCase()`, and `.toLowerCase()`.

### **String Splitting Example**
We can split a string into **tokens** (substrings) using `split()`:

```java
String myString = "Hello World";
String[] strArray = myString.split(" ");
System.out.println(strArray[1]);  // Outputs: World
```

- The `split(" ")` method breaks the string into words based on spaces.
- The resulting `strArray` contains `["Hello", "World"]`, and `strArray[1]` gives `"World"`.

## **Key Takeaways**
1. **Class Abstraction** allows developers to focus on how a class is used rather than how it is implemented.
2. **Encapsulation** protects data fields and ensures interaction is limited to defined methods.
3. **Class Contracts** define **public-facing** methods and data fields, enabling tools like ChatGPT to automate implementation.
4. **Strings** in Java are **objects**, not primitive data types, and support various built-in methods for manipulation.

---
## **Practice Questions**
### **Multiple Choice**
1. What is the main purpose of class abstraction?
    - (A) To allow direct modification of class variables
    - (B) To separate implementation details from usage
    - (C) To require every method to be public
    - (D) To remove the need for constructors  
      **Answer:** B

2. Which of the following is **NOT** an advantage of encapsulation?
    - (A) Protecting internal class implementation
    - (B) Reducing complexity for users
    - (C) Allowing direct access to instance variables
    - (D) Enforcing access control using private fields  
      **Answer:** C

3. How do you retrieve the third character from a `String` variable `str`?
    - (A) `str.get(2);`
    - (B) `str.charAt(2);`
    - (C) `str[2];`
    - (D) `str.substring(3,3);`  
      **Answer:** B

### **True/False**
4. Java’s `String` class is immutable. **(True/False)**  
   **Answer:** True

5. In Java, the `this` keyword can be used to refer to both instance variables and instance methods. **(True/False)**  
   **Answer:** True

### **What is the Output?**
6. What will be printed by the following code?

```java
String message = "Hello World";
System.out.println(message.charAt(6));
```
- (A) `H`
- (B) `W`
- (C) Compilation Error
- (D) `o`

**Answer:** B (The 6th index corresponds to `W`)

7. What will be the result of this code?

```java
String text = "Java";
text.toUpperCase();
System.out.println(text);
```
- (A) `JAVA`
- (B) `Java`
- (C) `java`
- (D) Compilation Error

**Answer:** B (Since `String` is immutable, `text` remains unchanged.)

---
This section provides an overview of **class abstraction, encapsulation, and string manipulation in Java** while reinforcing **best practices for object-oriented programming**. 🚀

