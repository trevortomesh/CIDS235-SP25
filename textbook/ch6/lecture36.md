# Abstract Classes, Interfaces, and Super Types

## Overview

In this section of CS 235, we delve into two essential concepts in Java: **abstract classes** and **interfaces**. These are foundational tools in object-oriented programming that help developers design more flexible and modular software. We will also clarify the important but often misunderstood difference between a **superclass** and a **super type**.

## Final Quiz Reminder

Your final quiz is due next **Friday**. It focuses primarily on **abstract classes** and **interfaces**, with a few questions involving inheritance. Also, remember your assignment is due on **Monday**.

## Commenting Code

Commenting your code is essential for readability and maintainability. You're encouraged to add meaningful comments to your code. You may use tools like large language models to help generate comments, but ensure you understand and approve what they write.

---

## Abstract Classes vs Interfaces

An **abstract class** can have both abstract methods (without implementation) and concrete methods (with implementation). You cannot instantiate an abstract class directly. You must extend it.

An **interface** is a purely abstract contract. It contains abstract method declarations only (until Java 8 introduced default methods). Any class that implements an interface **must** implement all of its methods unless the class is abstract.

---

## Example Domain: Creatures and Edibility

To illustrate abstract classes and interfaces, we explored a whimsical example:

### Classes:

* **Animal** (abstract class)

    * Field: `double weight`
    * Method: `String sound()`
* **Fruit** (abstract class)
* **Tiger** and **Chicken** extend **Animal**
* **Apple** and **Orange** extend **Fruit**

### Interface:

* **Edible** (interface)

    * Method: `String howToEat()`

### Relationships:

* **Chicken**, **Apple**, and **Orange** all implement **Edible**.
* **Animal** is the superclass for **Chicken** and **Tiger**.
* **Fruit** is the superclass for **Apple** and **Orange**.

---

## UML Representation

We used UML diagrams to visualize class relationships.

* **Solid lines** with arrows denote **inheritance**.
* **Dashed lines** with arrows denote **interface implementation**.

```plantuml
class Animal {
  - double weight
  + String sound()
}

interface Edible {
  + String howToEat()
}

abstract class Fruit implements Edible
class Apple extends Fruit
class Orange extends Fruit
class Chicken extends Animal implements Edible
class Tiger extends Animal

Animal <|-- Chicken
Animal <|-- Tiger
Fruit <|-- Apple
Fruit <|-- Orange
Edible <|.. Chicken
Edible <|.. Fruit
```

---

## Superclass vs Super Type

* A **superclass** is a direct parent class from which a subclass inherits.
* A **super type** is a broader term. Both superclasses and interfaces implemented by a class are considered supertypes.

| Entity             | Superclass? | Super Type? |
| ------------------ | ----------- | ----------- |
| Animal for Chicken | Yes         | Yes         |
| Edible for Chicken | No          | Yes         |
| Fruit for Apple    | Yes         | Yes         |
| Edible for Fruit   | No          | Yes         |

Thus:

* `Edible` is a **super type** of `Chicken` and `Fruit`, but **not** their parent class.
* `Animal` is both a **superclass** and a **super type** for `Chicken` and `Tiger`.
* `Fruit` is both a **superclass** and a **super type** for `Apple` and `Orange`.

---

## Why Fruit Can Omit `howToEat()`

The class `Fruit` does **not** implement `howToEat()`, even though it implements the `Edible` interface. Why?

Because `Fruit` is an **abstract class**. Abstract classes can defer implementation of interface methods to their subclasses. Hence, `Apple` and `Orange` must each implement `howToEat()` individually.

If you tried to compile `Apple` or `Orange` **without** implementing `howToEat()`, the compiler would produce an error:

> Class must either be declared abstract or implement the abstract method `howToEat()`.

---

## Practical Demonstration: Using Interfaces and Casting

In our demo:

```java
Object[] objects = { new Tiger(), new Chicken(), new Apple() };

for (Object obj : objects) {
  if (obj instanceof Edible) {
    Edible e = (Edible) obj;
    System.out.println(e.howToEat());
  }
  if (obj instanceof Animal) {
    Animal a = (Animal) obj;
    System.out.println(a.sound());
  }
}
```

This shows how polymorphism works. We:

* **Check if an object is a supertype**, like `Edible`.
* **Cast it** to access the interface method.

---

## Summary

* **Interfaces** define a contract; any class that implements them must follow it.
* **Abstract classes** provide a base for common code and shared logic.
* **Superclass** refers to direct inheritance; **super type** includes both parent classes and interfaces.
* **UML diagrams** visually differentiate inheritance (solid lines) and interfaces (dashed lines).
* Casting and `instanceof` let us safely use supertype functionality at runtime.

### Quick Reference:

* `implements` ➔ interface relationship
* `extends` ➔ class inheritance
* `abstract` ➔ class or method that cannot be instantiated directly
* `super type` ➔ general term including both parent classes and interfaces

---

## Practice Questions

1. What is the difference between a superclass and a super type?
2. Why can an abstract class skip implementing interface methods?
3. How do you denote an interface relationship in UML?
4. What error do you get if a concrete class does not implement all interface methods?
5. Why can you cast a `Chicken` as `Edible`?

---