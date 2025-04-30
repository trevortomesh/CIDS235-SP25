# CS 235 - Interfaces and Pseudo-Multiple Inheritance

## Summary
This section introduces Java interfaces, explaining how they allow for shared behavior across unrelated classes, and how they simulate multiple inheritance. Through an entertaining example involving animals and fruit, students explore how interfaces allow classes to share functionality (like being edible) without sharing a class hierarchy. The section also reinforces polymorphism using `instanceof` and casting, highlighting a real-world scenario where interfaces add power and flexibility to object-oriented designs.

---

## Key Concepts

### Abstract Classes Recap
Before diving into interfaces, we revisited abstract classes:
- You cannot instantiate abstract classes directly.
- Abstract classes can contain both abstract and non-abstract methods.
- They are useful for sharing partial implementations across child classes.

### Why Interfaces?
Java does **not support multiple inheritance** (i.e., a class cannot have more than one parent class), but sometimes we want unrelated classes to share a common behavior. For example:
- `Fruit` and `Animal` are unrelated by inheritance, but both might be edible.
- You cannot say `Fruit extends Animal` or vice versa.
- **Interfaces solve this** by letting unrelated classes implement a shared contract.

### Syntax of an Interface
```java
public interface Edible {
    String howToEat();
}
```
- Interfaces contain **abstract methods only** (until Java 8+, where default/static methods were introduced).
- No implementation is provided.

### Implementing an Interface
Any class (abstract or concrete) can implement an interface:
```java
public abstract class Fruit implements Edible {
    // No need to implement howToEat here unless desired.
}

public class Apple extends Fruit {
    @Override
    public String howToEat() {
        return "Make apple cider.";
    }
}
```
You can also implement an interface directly from a class:
```java
public class Chicken extends Animal implements Edible {
    @Override
    public String howToEat() {
        return "Fry the chicken.";
    }

    @Override
    public String sound() {
        return "Cluck cluck!";
    }
}
```

### Key Benefits
- You can treat any `Edible` object polymorphically.
- A class can implement multiple interfaces, even if it can't inherit from multiple classes.

---

## Example: Edible Interface in Action

### The Cast of Classes
```java
interface Edible {
    String howToEat();
}

abstract class Animal {
    public abstract String sound();
}

abstract class Fruit implements Edible {}

class Apple extends Fruit {
    @Override
    public String howToEat() { return "Make apple cider."; }
}

class Orange extends Fruit {
    @Override
    public String howToEat() { return "Make orange juice."; }
}

class Chicken extends Animal implements Edible {
    @Override
    public String sound() { return "Cluck cluck!"; }

    @Override
    public String howToEat() { return "Fry the chicken."; }
}

class Tiger extends Animal {
    @Override
    public String sound() { return "Roar!"; }
}
```

### Using `instanceof` with Interfaces
We can check whether objects are `Edible` and/or `Animal` at runtime:
```java
Object[] objects = { new Tiger(), new Chicken(), new Apple() };

for (Object obj : objects) {
    if (obj instanceof Edible) {
        System.out.println(((Edible) obj).howToEat());
    }
    if (obj instanceof Animal) {
        System.out.println(((Animal) obj).sound());
    }
}
```

### Sample Output
```
Roar!
Fry the chicken.
Cluck cluck!
Make apple cider.
```

---

## Takeaways
- Interfaces define behavior, not structure.
- Java allows a class to implement multiple interfaces but only extend one class.
- `instanceof` and casting allow polymorphic behavior based on interfaces.
- Interfaces let you unify operations across unrelated types.

---

## Next Steps
In our next session, we will:
- Explore interface inheritance (an interface extending another interface)
- Introduce default methods in interfaces
- Compare abstract classes vs interfaces in Java 8+

Please review the example in this section and try writing your own interface-based example to practice. Bring your questions Friday!

---

## Practice Questions
1. What is the main difference between an interface and an abstract class?
2. Can you instantiate an interface? Why or why not?
3. Why might you choose an interface over inheritance for two unrelated types?
4. What does the `instanceof` keyword do in Java?
5. How do you use casting to invoke a method from an interface?

---

