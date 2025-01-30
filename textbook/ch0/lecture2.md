# CIDS 235: Programming Paradigms
## Lecture 2 - January 29, 2025

### Introduction

Good morning, everyone. Today, we will dive into the concept of **programming paradigms**—what they are, why they matter, and how they shape the way we write programs. To begin, let's define the word **paradigm** itself.

### What is a Paradigm?
A paradigm is a way of looking at things—a model, an example, or a pattern. When we talk about a **paradigm shift**, we mean a fundamental change in how we view or approach something. For example, in politics, a paradigm shift can occur after an election, altering national policies and priorities. In programming, paradigms shape the way we **conceptualize and structure code**.

### What is Programming?
Before discussing programming paradigms, let's briefly define **programming**. At its core, programming is about **problem-solving**—using computers to execute a set of instructions that help us achieve specific goals. Essentially, we program computers so they can perform tasks for us efficiently.

### What is a Programming Paradigm?
A **programming paradigm** is an approach to solving problems using a programming language or tool. Since there are multiple ways to solve problems computationally, different paradigms exist. Some paradigms are better suited for certain types of problems than others, and selecting the right paradigm can make development more efficient and maintainable.

## The Two General Families of Programming Paradigms
Programming paradigms can generally be classified into two main families:

1. **Imperative Paradigm**
2. **Declarative Paradigm**

### 1. Imperative Programming
Imperative programming focuses on **step-by-step instructions** that change the program’s state. This approach is akin to providing a recipe where each step modifies ingredients in a specific sequence. Most beginner programmers start with imperative programming.

#### Subparadigms of Imperative Programming
- **Procedural Programming:**
    - Focuses on **step-by-step procedures**.
    - Example: Writing a sequence of commands to accomplish a task.

- **Structured Programming:**
    - Adds control structures such as loops, conditionals, and subroutines.
    - Example: Using loops (`for`, `while`) and conditionals (`if-else`).

- **Object-Oriented Programming (OOP):**
    - Organizes data and behaviors into objects.
    - Example: Defining **classes** and **methods** to represent real-world entities.
    - Key principles: **Abstraction, Encapsulation, Inheritance, and Polymorphism**.

### 2. Declarative Programming
Declarative programming focuses on **what** the program should accomplish rather than **how** it should do it. It typically lacks flow control structures like loops and conditionals. Instead, it relies on **expressions and declarations**.

#### Subparadigms of Declarative Programming
- **Logic Programming:**
    - Uses logic-based rules to infer conclusions.
    - Example: **Prolog**, which operates on facts and rules.

- **Functional Programming:**
    - Focuses on mathematical **functions**.
    - Uses **immutable data** and **higher-order functions**.
    - Example: **R, Haskell, Lisp, Python (supports functional style)**.
    - Key feature: **Mapping, filtering, and reducing data sets**.

### Imperative vs. Declarative Paradigm
| Feature              | Imperative Programming       | Declarative Programming      |
|----------------------|----------------------------|------------------------------|
| How vs. What        | Focuses on **how** to solve a problem | Focuses on **what** to achieve |
| Flow Control        | Uses loops, conditionals    | Lacks explicit flow control  |
| Example Language   | Java, Python (OOP), C       | SQL, Prolog, R               |
| Use Case            | Step-by-step algorithms    | Querying databases, AI       |

## Why Do We Care About Paradigms?
Depending on the problem domain, different paradigms provide better solutions. For instance:
- **Data science** often benefits from **functional programming**.
- **Web development** uses **declarative paradigms** like HTML and **imperative paradigms** like JavaScript.
- **General application development** relies on **object-oriented programming**.

### Example: Printing "Hello, World!" Ten Times

#### Procedural Approach (Imperative):
```java
for (int i = 0; i < 10; i++) {
    System.out.println("Hello, World!");
}
```

#### Functional Approach (Declarative):
```javascript
Array(10).fill("Hello, World!").forEach(msg => console.log(msg));
```

## Summary
- A **paradigm** is a way of thinking or approaching problems.
- **Programming paradigms** define how we solve problems using programming languages.
- The **imperative paradigm** focuses on **step-by-step state changes**.
- The **declarative paradigm** focuses on **expressions and rules**.
- **Choosing the right paradigm** depends on the problem domain.

---

## Practice Questions

1. **Define the term "programming paradigm" and explain why different paradigms exist.**

2. **Compare and contrast imperative and declarative programming with examples.**

3. **Why is functional programming commonly used in data science? Provide an example of a functional programming approach to processing a dataset.**

---
This concludes Lecture 2. Next session, we will explore **functional programming in greater detail** before diving into **object-oriented programming**—the primary focus of the semester. Make sure to review today’s notes, and check Canvas for updates on the GitHub textbook project!

