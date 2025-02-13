**Object-Oriented Programming and Modeling in Computer Science**

### **Introduction**
On February 3, 2025, we transitioned from discussing functional programming to the central focus of this course: **Object-Oriented Programming (OOP)**. Functional programming, which we covered in our previous session, emphasizes **mathematical functions** and transformations of data. In contrast, OOP provides a structured way to model real-world entities and their interactions using **objects and classes**.

### **Programming Paradigms**
Programming paradigms can be broadly categorized into two families:
1. **Imperative Programming** – Concerned with *how* computation is performed step-by-step using flow control mechanisms such as loops and conditionals.
2. **Declarative Programming** – Focuses on *what* the computation should achieve, often lacking explicit control flow (e.g., HTML).

Functional programming, which belongs to the declarative family, operates by applying transformations to data using **pure functions** that avoid side effects. However, in this course, we will primarily focus on **Object-Oriented Programming**, a paradigm that models real-world entities as objects.

### **Why Model the World?**
Computer science is deeply tied to mathematical modeling. The primary goal of computational models is to:
- **Solve problems** efficiently.
- **Predict future events** based on existing data.
- **Understand complex systems** by abstracting away unnecessary details.

For example, climate scientists build models to predict environmental changes, while architects create digital models of buildings before construction. Similarly, software engineers build object-oriented models to simulate real-world objects and behaviors within a program.

### **Procedural vs. Object-Oriented Programming**
Traditional procedural programming structures programs in a **step-by-step** manner using variables and functions, leading to scalability issues as complexity grows. Consider the following problem:

#### **Building a Database for Pets**
Suppose we need to maintain a database of pets in a veterinary clinic. A procedural approach might define separate variables for each property:
```java
String cat1Name = "Glitch";
String cat2Name = "Haku";
int cat1Age = 14;
int cat2Age = 5;
double cat1Weight = 12.0;
double cat2Weight = 9.0;
```
As the dataset grows, maintaining individual variables for each pet becomes **error-prone and difficult to manage**. This problem amplifies when we introduce **different species** (e.g., dogs, birds) with distinct attributes and behaviors.

### **The Need for Object-Oriented Programming**
OOP offers a solution by grouping related data and behaviors into **objects**, which are instances of **classes**. This shift addresses several challenges:
1. **Encapsulation** – Ties data and associated methods together, reducing unintended interactions between different parts of the program.
2. **Inheritance** – Allows for hierarchical relationships, so a `Dog` class can inherit properties from a more general `Animal` class.
3. **Polymorphism** – Enables the same function to work differently for different objects (e.g., a dog barks while a cat meows).

### **Transitioning to Object-Oriented Thinking**
Observing our procedural pet database, we recognize patterns:
- All cats share properties such as `name`, `age`, `weight`, and `color`.
- Some animals, like **dogs and cats**, share similar attributes but differ in behavior (e.g., barking vs. meowing).
- Animals may require methods for actions such as `makeSound()` and `giveMedication()`.

Rather than treating each pet as separate variables, OOP allows us to define a **blueprint (class)** that represents a **generalized concept of a pet**, which can be instantiated into specific objects.

### **Looking Ahead**
On Wednesday, we will **refactor our procedural pet database into an object-oriented design**. We will create **classes** to encapsulate related properties and behaviors, demonstrating the power of OOP in simplifying complex software systems.

**Key Takeaways:**
- OOP organizes data and behavior into **objects and classes**, making code more modular and reusable.
- **Encapsulation**, **inheritance**, and **polymorphism** enhance software design and maintainability.
- Procedural programming struggles with scalability, while OOP offers a **structured approach** to managing complexity.

In our next session, we will begin coding an object-oriented solution to manage our pet database efficiently. Be sure to review IntelliJ IDEA setup and be prepared to apply OOP concepts in Java!

### **Questions**
1. What is the main problem with procedural programming when dealing with large amounts of related data, and how does object-oriented programming aim to solve it?
2. In the context of object-oriented programming, explain the difference between a class and an object using the example of cats and dogs from the lecture.
3. Why is abstraction an important concept in object-oriented programming, and how does it help in building models of real-world entities?