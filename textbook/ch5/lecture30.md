# CS 235 – Polymorphism and Casting (April 14, 2025)

## Summary
This lecture continued our discussion of polymorphism, casting, and object-oriented behavior in Java. We explored how classes relate through inheritance, how polymorphism enables generic programming, and how Java handles object references versus primitive data types during casting. The focus was on using the `instanceof` operator, method overriding, casting with the object class, and understanding what happens when reference variables are reassigned.

## Topics Covered

### Polymorphism Recap
- Polymorphism allows a subclass to be treated as an instance of its superclass.
- You can use a superclass reference to refer to subclass objects (e.g., `Mammal m = new Cat()`).
- When a subclass is cast to its superclass, you can only use members of the superclass.

### `instanceof` Operator
- Used to determine whether an object is an instance of a specific class or a subclass thereof.
- Syntax: `object instanceof ClassName` → returns a boolean.
- Enables safe downcasting when handling objects generically (e.g., via an `Object` parameter).

### `displayObject` Method Example
```java
public static void displayObject(Object object) {
    if (object instanceof Circle) {
        Circle circle = (Circle) object;
        System.out.println("Circle area: " + circle.getArea());
    } else if (object instanceof Rectangle) {
        Rectangle rectangle = (Rectangle) object;
        System.out.println("Rectangle area: " + rectangle.getArea());
    } else {
        System.out.println(object.toString());
    }
}
```
- Shows how to check type at runtime and cast accordingly.
- Demonstrates polymorphism by calling overridden `getArea()` methods.

### Implicit vs. Explicit Casting
- **Implicit cast**: Smaller/specific type → broader/general type.
    - Example: `Object obj = new Circle();`
- **Explicit cast**: Broader type → specific type (requires `instanceof` check).
    - Example: `Circle c = (Circle) obj;`
- Invalid casts (e.g., `Rectangle r = (Rectangle) obj;` when `obj` is not a Rectangle) throw `ClassCastException` at runtime.

### Object Reference Behavior
- Reference variables store memory addresses, not actual object data.
- Casting or assigning a reference does not create a new object—it just gives another name to the same object.
```java
Object o = new Circle();
Circle c = (Circle) o;
System.out.println(c.equals(o)); // true
```
- Both `o` and `c` point to the same memory location.

### `.equals()` and `.toString()` Methods
- Defined in the `Object` class and inherited by all Java classes.
- Default `equals()` compares memory addresses.
- Default `toString()` returns class name + hash unless overridden.
- Many standard classes (e.g., `String`, `Date`) override `equals()` to compare contents.

### Casting and Operator Precedence
- Dot operator (`.`) has higher precedence than casting.
- Use parentheses to ensure casting happens before method calls:
```java
((Circle) object).getRadius()
```

### Primitive vs. Reference Type Casting
- Primitive casting (e.g., `int` to `byte`) creates a new value.
- Reference casting (e.g., `Object` to `Circle`) creates a new reference, not a new object.

## Key Takeaways
- Casting must be done with care—use `instanceof` to check before casting.
- Java's type system allows flexible polymorphism, but accessing subclass-specific methods requires appropriate casting.
- Reference variables store memory addresses—casting them does not create new objects.
- `Object` is the superclass of all classes in Java—methods like `equals()` and `toString()` are always available.
- Understand declared type vs. actual type when reasoning about inheritance and polymorphism.

## Next Topic
We will shift into discussing class relationships: **Association**, **Aggregation**, and **Composition**. These are critical to understanding how objects relate to and interact with one another in more complex systems.

---

📝 *This lecture summary is part of the Living Textbook initiative.*

