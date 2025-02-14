# Unified Modeling Language (UML), Class Diagrams, Getters and Setters

## Introduction to UML

Unified Modeling Language (UML) is a standard way to visualize the design of a system. It provides a way to represent classes, their attributes, and their methods without diving directly into the code. This is useful for planning and understanding class structures, especially in large-scale software development.

For this course, we will focus on **class diagrams**, which represent classes and their relationships with other classes.

## Using PlantUML for UML Diagrams

PlantUML is a tool that allows you to generate UML diagrams using simple scripting. Instead of drawing diagrams manually, you can write a script that describes the structure, and PlantUML will generate the corresponding diagram.

To start a UML diagram in PlantUML, use:
```plaintext
@startuml
@enduml
```
Everything between these tags defines the diagram.

## Defining a Class in UML

A **class diagram** consists of three main parts:
1. **Class Name**
2. **Attributes (Data Fields)**
3. **Methods (Functions or Behaviors)**

For example, to define a `Circle` class in PlantUML:

```plaintext
@startuml
class Circle {
    radius: double
    Circle()
    Circle(newRadius: double)
    getArea(): double
    getPerimeter(): double
    setRadius(newRadius: double)
}
@enduml
```

### Breakdown of the Diagram
- `radius: double` → Represents a data field.
- `Circle()` → The **default constructor** (no parameters).
- `Circle(newRadius: double)` → The **parameterized constructor** (takes an initial radius).
- `getArea(): double` → A method that calculates the area.
- `getPerimeter(): double` → A method that calculates the perimeter.
- `setRadius(newRadius: double)` → A method that allows updating the radius.

## Understanding Constructors

Constructors are special methods used to initialize an object when it is created. There are two types of constructors:
- **Default Constructor**: Sets default values (e.g., radius = 1.0).
- **Parameterized Constructor**: Allows setting initial values at the time of object creation.

For example, in Java:
```java
public class Circle {
    double radius;
    
    // Default constructor
    public Circle() {
        radius = 1.0;
    }
    
    // Parameterized constructor
    public Circle(double newRadius) {
        radius = newRadius;
    }
}
```

## Getters and Setters

**Getters** allow retrieving values from a class, while **setters** allow modifying them.

```java
public double getArea() {
    return Math.PI * radius * radius;
}

public void setRadius(double newRadius) {
    radius = newRadius;
}
```

### Why Use Getters and Setters?
- They help control how data is accessed and modified.
- They allow validation before setting a value.
- They encapsulate internal class details.

## Practice Questions

1. **Define a UML class diagram for a `Rectangle` class that includes width, height, a default constructor, a parameterized constructor, and methods to calculate area and perimeter.**
2. **What is the difference between a constructor and a regular method?**
3. **Explain why constructors do not have a return type.**
4. **Why is it a good practice to use setter methods instead of directly modifying data fields?**
5. **Write Java code for a `Rectangle` class that includes getters, setters, and constructors.**

---
This covers the basics of UML class diagrams and object-oriented programming concepts like constructors and methods. Next, we will discuss **reference variables** and how objects interact in memory.

