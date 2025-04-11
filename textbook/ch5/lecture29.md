**CS 235 - April 11, 2025: Polymorphism and Type Casting**

---

### Summary
In this lecture, we continued our discussion of **polymorphism**, focusing on **passing objects to methods** and how type casting interacts with inheritance in Java. We explored how objects declared as parent types can still retain their actual child-type identity, and how this is checked and leveraged at runtime using the `instanceof` keyword and explicit casting.

We reviewed a mammal example (cats and whales) to understand polymorphism in class hierarchies, and returned to our geometric objects example (circles and rectangles) to demonstrate type checks, upcasting/downcasting, and runtime method invocation safety.

---

### Key Concepts

#### Inheritance and Constructor Chains
- **Constructor Chaining**: When an object is created, all superclass constructors are implicitly or explicitly called from the top (e.g., `Object`) down to the bottom (e.g., `Faculty`).
- **Super Constructor Rule**: If a child constructor does not explicitly call `super(...)`, Java implicitly calls the no-argument constructor of the parent class.

#### Polymorphism
- **Definition**: The ability of an object to take many forms. An object of a subclass can be treated as an object of its superclass.
- **Example**: A `Cat` object is also a `Mammal` and also an `Object`.
- **Use Case**: Methods that operate on a superclass type can accept subclass instances (e.g., passing a `Cat` to a method expecting a `Mammal`).

#### Method Parameters and Casting
- **Declared Type vs. Actual Type**:
    - *Declared Type*: The type of the reference variable (e.g., `Object obj`).
    - *Actual Type*: The runtime type of the object stored in the variable (e.g., `new Circle(...)`).
- **Upcasting**: Casting a subclass to a superclass. Safe and implicit.
- **Downcasting**: Casting a superclass reference back to a subclass. Must be explicit and safe only if checked with `instanceof`.

#### `instanceof` Operator
- Used to test if an object is an instance of a particular class.
- Example:
  ```java
  if (obj instanceof Circle) {
      Circle c = (Circle) obj;
      System.out.println(c.getArea());
  }
  ```

---

### Circle and Rectangle Example

```java
public static void displayObject(Object obj) {
    System.out.println("Is the object a circle? " + (obj instanceof Circle));

    if (obj instanceof Circle) {
        Circle c = (Circle) obj;
        System.out.println("Circle area: " + c.getArea());
        System.out.println("Circle diameter: " + c.getRadius() * 2);
    } else if (obj instanceof Rectangle) {
        Rectangle r = (Rectangle) obj;
        System.out.println("Rectangle area: " + r.getArea());
    } else {
        System.out.println(obj.toString());
    }
}
```

This function demonstrates safe casting based on runtime type, showing how to extract subclass-specific behavior even when the reference is to a superclass.

---

### Important Notes
- You cannot access child-specific methods (like `meow()` for `Cat`) when using a reference to the parent (`Mammal`) unless you cast.
- Trying to cast an object to an unrelated type will cause a `ClassCastException` at runtime.
- Always use `instanceof` to avoid unsafe casts.

---

### Analogy
Think of polymorphism like inviting all mammals to a party (using the superclass reference). Once they are in the room, asking all of them to do something specific to one species (e.g., "meow like a cat") will fail unless you know who is actually a cat.

---

### Next Topic
We'll continue discussing **method overriding** and how Java resolves method calls at runtime using dynamic dispatch. Expect more practice with `super`, `this`, `@Override`, and polymorphic behavior.

---

**End of Lecture**

