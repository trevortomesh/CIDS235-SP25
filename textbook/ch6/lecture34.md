# Abstract Classes, Relationships, and Method Design in Java (CS 235 - April 23, 2025)

Welcome back to CS 235! This was our final in-person meeting for the semester (April 23, 2025). From here forward, activities will be online. You'll receive Zoom links and updates via Canvas.

---

## 🧠 Review of Class Relationships
We revisited class relationships using our ongoing Pokémon examples. Here's a recap:

### Composition
- **Poké Ball → Pokémon**: If the Poké Ball is destroyed, the Pokémon inside is also destroyed.
- **UML Notation**: Filled diamond arrow pointing to the class that contains the other.
- **Code Behavior**: `Pokeball` creates the `Pokemon` within its constructor.

### Aggregation
- **Pokédex → Pokémon**: Pokédex *aggregates* Pokémon, but both can exist independently.
- **Trainer → Pokémon**: A Trainer aggregates Pokémon as a team.
- **UML Notation**: Open diamond arrow pointing to the aggregator class.

### Summary
| Relationship    | UML Symbol       | Lifecycle Dependency | Example         |
|-----------------|------------------|-----------------------|-----------------|
| Association     | Solid line       | Independent           | Trainer → Pokémon |
| Aggregation     | Open diamond     | Independent           | Pokédex → Pokémon  |
| Composition     | Filled diamond   | Dependent             | Poké Ball → Pokémon |

---

## 🧩 Abstract Classes in Java
Next, we introduced **abstract classes**, an essential tool for designing reusable and extensible class hierarchies.

### What Is an Abstract Class?
An abstract class:
- Cannot be instantiated directly.
- Can contain both abstract (no implementation) and concrete methods.
- Serves as a template for child classes.

### Example: Mammal Hierarchy
```java
abstract class Mammal {
  abstract void giveBirth();
  public void regulateTemperature() {
    // concrete shared behavior
  }
}

class Cat extends Mammal {
  void giveBirth() {
    // implementation for cats
  }
}
```

You can't do:
```java
Mammal m = new Mammal(); // ❌ Error
```
But you *can* do:
```java
Mammal m = new Cat(); // ✔ Allowed
```

### Geometric Object Example
We defined an abstract class `GeometricObject`:
```java
public abstract class GeometricObject {
  public abstract double getArea();
  public abstract double getPerimeter();
  // concrete methods like getColor, isFilled, etc.
}
```
And implemented it in subclasses:
```java
public class Circle extends GeometricObject {
  public double getArea() { return Math.PI * radius * radius; }
  public double getPerimeter() { return 2 * Math.PI * radius; }
}

public class Rectangle extends GeometricObject {
  public double getArea() { return width * height; }
  public double getPerimeter() { return 2 * (width + height); }
}
```

---

## 🎯 Benefits of Abstract Classes and Methods
### 1. Enforce Implementation:
Abstract methods require that subclasses implement the specified methods, which leads to consistency.

### 2. Enable Polymorphism:
We wrote a utility method to compare geometric objects without worrying about their specific type:
```java
public static boolean equalArea(GeometricObject o1, GeometricObject o2) {
  return o1.getArea() == o2.getArea();
}
```
Even though `Circle` and `Rectangle` use different formulas, they share the same interface.

### 3. Allow Concrete Reuse:
Abstract classes can also contain fully implemented methods that subclasses inherit without modification.

---

## 📌 Key Rules and Notes
- **Cannot instantiate** an abstract class.
- **Can define constructors** in an abstract class (used via subclasses).
- **Abstract methods cannot be static**.
- A **non-abstract subclass must implement all** abstract methods of its abstract superclass.
- You can create **arrays or collections** of abstract types:
```java
GeometricObject[] shapes = new GeometricObject[10];
shapes[0] = new Circle(...);
```

---

## 🧪 Practice Questions
1. **Identify the relationship**: A `Library` has many `Books`. If the library is closed, the books remain. What kind of relationship is this?
2. **Write a UML diagram** for an abstract class `Instrument` with child classes `Guitar` and `Piano`.
3. **Abstract method**: Add an abstract method `playNote()` to the `Instrument` class. Implement it in `Guitar` and `Piano`.
4. **Polymorphic behavior**: Write a method `playConcert(Instrument[] instruments)` that loops through and calls `playNote()`.

---

**Next Steps**
On Friday, look for an online activity on Canvas (no live class). Then we continue via Zoom starting Monday. Thanks for an awesome in-person semester!

---

**CS 235 - Java OOP Series**  
*Instructor: Dr. Trevor Tomesh*  
*April 23, 2025*

