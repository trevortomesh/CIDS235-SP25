# Introduction to Object-Oriented Programming in CIDS 235

## Procedural vs. Object-Oriented Programming

In procedural programming, the focus is on **procedures**—step-by-step instructions that dictate how a program operates. A common analogy is that of a **recipe**: you begin with certain ingredients (variables), apply operations (methods or functions), and produce a result.

Object-oriented programming (OOP), on the other hand, still utilizes procedural elements like loops and conditionals but shifts the focus to **data abstraction**. Instead of just defining sequences of instructions, OOP emphasizes the **objects** within a program and their interactions.

## Understanding Objects and Classes

### Defining a Class

A **class** serves as a blueprint for creating objects. Consider a **Cat** class that encapsulates the attributes of a cat:

```java
public class Cat {
    String name;
    char sex;
    String color;
    String breed;
    int age;
    double weight;
}
```

This class **defines** what a cat is in terms of its attributes but does not yet create a specific cat.

### Creating an Object (Instance)

An **object** is a specific instance of a class. We can create an object (instance) of the `Cat` class like this:

```java
Cat glitch = new Cat();
glitch.name = "Glitch";
glitch.age = 14;
glitch.sex = 'M';
glitch.weight = 13.0;
glitch.color = "Tuxedo";
glitch.breed = "Domestic Short Hair";
```

Now, `glitch` is an actual **cat object** with assigned values.

### Accessing Object Attributes

We can access the attributes of an object using the **dot operator**:

```java
System.out.println("Cat name: " + glitch.name);
System.out.println("Cat age: " + glitch.age);
```

### Multiple Instances

We can create multiple objects from the same class:

```java
Cat haku = new Cat();
haku.name = "Haku";
haku.age = 5;
haku.sex = 'M';
haku.weight = 8.0;
haku.color = "Tuxedo";
haku.breed = "Domestic Short Hair";
```

Each instance (`glitch`, `haku`) represents a unique cat but follows the **same structure** defined by the `Cat` class.

---

## Expanding to Geometric Figures

OOP concepts apply to all sorts of objects, including **geometric figures**. Let's create a `Circle` class.

```java
public class Circle {
    double radius = 1.0;

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
```

### Creating Circle Objects

```java
Circle roundy = new Circle();
Circle roly = new Circle();
roly.radius = 30;
```

### Calculating Area and Perimeter

```java
System.out.println("Roundy has an area of " + roundy.getArea());
System.out.println("Roundy has a perimeter of " + roundy.getPerimeter());
System.out.println("Roly has an area of " + roly.getArea());
System.out.println("Roly has a perimeter of " + roly.getPerimeter());
```

### Key Takeaways
- A **class** is a blueprint for creating objects.
- **Objects** are instances of a class.
- The **dot operator (`.`)** allows access to object attributes and methods.
- Methods like `getArea()` and `getPerimeter()` encapsulate calculations **inside the class**.

---

## Looking Ahead: Constructors

Wouldn’t it be convenient if we could **set up an object** with a specific radius right when we create it, rather than assigning it afterward? This leads us to **constructors**, which we'll explore in our next session.

### Next Topic: Constructors in Java
- How constructors help initialize objects.
- Writing custom constructors for efficient object creation.
- Applying constructors to `Cat` and `Circle` classes.

See you next session!

---

# Practice Questions - Introduction to Object-Oriented Programming in CIDS 235

## 1. Understanding Objects and Classes
Consider the following `Dog` class:

```java
public class Dog {
    String name;
    int age;
    String breed;
}
```

Write Java code to:
- Create a new Dog object named buddy.
- Assign "Buddy" as the name, 4 as the age, and "Golden Retriever" as the breed.
- Print the dog’s name and age using System.out.println().

2. Object Interaction and Methods

Given the Circle class:

```java
public class Circle {
    double radius = 1.0;

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
```

• Create a Circle object named bigCircle and set its radius to 10.0.
• Print the area and perimeter of bigCircle.

3. Understanding Object Instances

Which of the following statements about objects and classes is true?

A) A class is an instance of an object. 

B) An object is an instance of a class.

C) A class and an object are the same thing.

D) Objects do not store data, only methods.

Bonus Challenge:

Modify the Cat class to include a method that prints the cat’s name and breed in a formatted sentence.