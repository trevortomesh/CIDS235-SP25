**Lecture Write-Up: CIDS 235 (February 14, 2025)**

---

### **Introduction**
Happy Valentine’s Day! Today, we covered key concepts in object-oriented programming, focusing on how objects are represented in memory, reference variables, and the dot operator.


### **Quiz Announcement**
- **Quiz 1 is now available** and consists of **10 questions**.
- You have **15 minutes** to complete it.
- The quiz is open **until next Friday at 11:59 PM**.
- Midterm is scheduled for **March 12th**.
- The final exam and midterm will be based on quiz material.


### **Review: Classes, Objects, and UML**
- Discussed **Plant UML** for diagram generation.
- Reviewed **program write-ups** and how to structure explanations.
- Objects are created from **classes**, which serve as **blueprints**.
- Used **dot notation** (e.g., `object.method()`) to access object members.


### **Reference Variables and Memory Representation**
#### **Dot Operator (`.`) and Dereferencing**
- Objects are accessed via **reference variables**, not stored directly.
- The **dot operator (`.`)** is used to access methods and attributes.
- Reference variables store **memory addresses**, not actual objects.

#### **Example: Understanding Object Storage**
```java
Circle roundy = new Circle(5);
Circle roly = new Circle(10);
System.out.println(roundy);
System.out.println(roly);
```
- The output displays **memory locations**, showing that variables store **references**.

#### **Arrays as Reference Variables**
- Arrays store references to memory locations, not actual values.
- Accessing an array’s memory location directly prints its **reference address**.

#### **Primitive vs. Reference Data Types**
- **Primitive types** (e.g., `int`, `double`, `boolean`) store **actual values**.
- **Reference types** (e.g., `String`, `Circle`, `Cat`) store **memory addresses**.
- Strings are **objects**, even though they appear as primitive-like variables.


### **Key Takeaways**
- **Classes** define objects.
- **Reference variables** store addresses, not actual objects.
- **The dot operator (`.`) is used for dereferencing and accessing object members.**
- **Primitive types store values directly, while reference types store addresses.**
- **Strings are objects, not primitive data types.**


### **Practice Problems**
1. **Understanding Object References**
   ```java
   class Student {
       String name;
       int age;
   }
   
   public class TestStudent {
       public static void main(String[] args) {
           Student s1 = new Student();
           s1.name = "Alice";
           s1.age = 20;
           
           Student s2 = s1;
           s2.name = "Bob";
           
           System.out.println(s1.name);
       }
   }
   ```
   **Question:** What will be printed, and why?

2. **Memory Addresses of Objects**
    - Create a `Car` class with attributes for `make` and `year`.
    - Instantiate two `Car` objects.
    - Print their references.

3. **Primitive vs. Reference Types**
    - What is the difference between `int x = 5;` and `Integer y = new Integer(5);`?
    - Explain what happens in memory.

4. **Working with the Dot Operator**
   Given the following class definition:
   ```java
   class Book {
       String title;
       double price;
   }
   ```
   Write a program to:
    - Create a `Book` object.
    - Set its `title` and `price`.
    - Print both attributes using the dot operator.


### **Next Class Preview**
- **Comparison of primitive and reference types.**
- **More on constructors and object creation.**
- **Encapsulation and access control.**

See you all next time!

