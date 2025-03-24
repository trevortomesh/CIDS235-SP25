# Midterm Review: Object-Oriented Programming Fundamentals

**Course:** CIS 235  
**Date:** March 24, 2025

---

## Overview
This section provides a comprehensive review for the upcoming CIS 235 midterm exam. The content is drawn from our in-class review session on March 24, 2025. It outlines key topics, practice quiz questions, and important conceptual clarifications to help you prepare effectively.

---

## Midterm Exam Logistics
- **Date:** In-class, during regular session time.
- **Duration:** 50 minutes (you may finish early).
- **Format:** Multiple choice, Scantron-based.
- **Materials:** Bring a No. 2 pencil (instructor will have extras, but they're not ideal).
- **Restrictions:** No notes, phones, or internet access.
- **Focus:** Strongly based on quiz material, especially Quizzes 1 and 2.
- **Weight:** 10% of final grade (final exam is also 10%).

The exam is intended to verify your understanding and ensure the work you’ve submitted on quizzes and assignments has been your own.

---

## Key Topics to Study

### 1. **Constructors and Classes**
- A constructor is used to **construct objects**.
- A constructor does **not return a data type**.
- UML diagrams will help you identify constructors and differentiate them from methods.

### 2. **UML Diagrams**
- Be able to identify:
    - **Class name** (typically at the top)
    - **Data fields (instance variables)**
    - **Constructors and methods**
    - **Objects** (usually in separate boxes or referenced with colons, e.g., `circle3 : Circle`)
- **Static fields and methods** are underlined in UML diagrams.

### 3. **Data Fields vs. Variables**
- A **data field** is a variable associated with an object.
- **Instance variables** are specific to each object.
- **Static variables** (also known as **class variables**) belong to the class and not to individual objects.

### 4. **Encapsulation**
- The practice of hiding implementation details.
- Achieved by marking data fields as **private** and providing **getters and setters**.

### 5. **Access Modifiers**
- `private`: accessible only within the class
- `public`: accessible from anywhere
- **Default (package-private)**: accessible within the same package (not emphasized in this course)

### 6. **Getter and Setter Methods**
- **Getter**: returns the value of a private data field.
- **Setter**: modifies the value of a private data field indirectly.
- Getters and setters support encapsulation and allow for controlled access to data fields.

### 7. **Passing Objects to Methods**
- Java is **pass-by-value**.
- When you pass an object, you pass a **reference to the object by value** (i.e., the object's address).

### 8. **Static Methods**
- Associated with the class, not individual objects.
- Marked with the keyword `static` and underlined in UML diagrams.

### 9. **Class Naming Conventions**
- Class names should begin with a **capital letter** (e.g., `Circle`, `Main`).

### 10. **Object Features**
- Objects have **data fields** and **methods**.
- A **class** is a **blueprint for an object**.

---

## Sample Quiz Review Questions

### Quiz 1 Examples:
- What is the purpose of a constructor? → To construct objects.
- What is a UML label for an object? → Typically placed in a separate box, labeled like `circle3 : Circle`.
- What is an instance variable? → A data field that belongs to a specific object.

### Quiz 2 Examples:
- What is the main purpose of a getter? → To return the value of a private field.
- What is a static method? → A method associated with the class, not the instance.
- What is data encapsulation? → A way to hide implementation details and protect internal state.

---

## Study Tips
- Review UML diagrams and practice interpreting them.
- Be able to distinguish between instance and static methods/fields.
- Understand the mechanics and purpose of constructors, getters, and setters.
- Practice tracing Java code and predicting output.
- Reflect on object-oriented principles: encapsulation, abstraction, and reuse.

---

## Final Notes
- If you require accommodations, please email your instructor in advance.
- Notes and recording from this session will be made available.

Good luck studying—and see you at the exam!

