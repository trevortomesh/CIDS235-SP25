## CIDS 235 - Object-Oriented Programming: Classes and Objects

### Introduction to Classes and Objects

Classes are fundamental to object-oriented programming (OOP) as they serve as blueprints for creating objects. An **object** consists of:

1. **Data fields** (also known as variables or attributes)
2. **Methods** (functions that define object behavior)

For example, consider a **Cat** class:
- Attributes: `name`, `age`, `sex`, `color`, `breed`
- Methods: `meow()`, `eat()`, `sleep()`

Similarly, a **Circle** class:
- Attributes: `radius`
- Methods: `getArea()`, `getPerimeter()`

A **class** itself does not store data but defines how objects are created and behave.

---

### Unified Modeling Language (UML) for Classes

UML is a standardized way to represent object-oriented systems. Below is an example UML representation of a `Circle` class:

```
 Circle
-------------------
 radius: double
-------------------
 getArea(): double
 getPerimeter(): double
```

This UML diagram helps visualize:
- **Class name** (Circle)
- **Data fields** (`radius: double`)
- **Methods** (`getArea()`, `getPerimeter()`)

UML is essential for designing software, especially for communicating with non-programmers or collaborating in teams.

---

### Creating Objects from Classes

Once a class is defined, multiple objects (instances) can be created from it. Example:

```java
Circle roundy = new Circle();  // Creates an instance of Circle
roundy.radius = 3.0;
```

Similarly, for a **Cat** object:

```java
Cat zoe = new Cat();
zoe.name = "Zoe";
zoe.age = 8;
zoe.sex = 'F';
zoe.color = "Gray";
zoe.breed = "Domestic Short Hair";
zoe.weight = 6.0;
```

Here, **each object has its own attributes** but follows the structure defined by the class.

---

### Constructors: Automating Object Initialization

A **constructor** is a special method that initializes new objects. It has the same name as the class and does not return a value.

#### Default Constructor

```java
public class Circle {
    double radius;
    
    // Default constructor
    public Circle() {
        radius = 1.0;
    }
}
```

This constructor initializes a new `Circle` object with a default radius of `1.0`.

#### Parameterized Constructor

```java
public class Circle {
    double radius;
    
    // Parameterized constructor
    public Circle(double newRadius) {
        radius = newRadius;
    }
}
```

Using this constructor:

```java
Circle roundy = new Circle(3.0);
Circle roly = new Circle(30.0);
```

This approach allows each object to be created with a **custom radius**.

---

### Applying Constructors to a Cat Class

Similarly, for the `Cat` class:

```java
public class Cat {
    String name;
    int age;
    char sex;
    String color;
    String breed;
    double weight;
    
    // Default constructor
    public Cat() {
        name = "Garfield";
        age = 10;
        sex = 'M';
        color = "Orange";
        breed = "Domestic Short Hair";
        weight = 24.0;
    }
    
    // Parameterized constructor
    public Cat(String newName, int newAge, char newSex, String newColor, String newBreed, double newWeight) {
        name = newName;
        age = newAge;
        sex = newSex;
        color = newColor;
        breed = newBreed;
        weight = newWeight;
    }
}
```

Now, objects can be created efficiently:

```java
Cat zoe = new Cat("Zoe", 8, 'F', "Gray", "Domestic Short Hair", 6.0);
Cat glitch = new Cat("Glitch", 14, 'M', "Tuxedo", "Domestic Short Hair", 13.0);
```

This makes object creation **cleaner and more structured**.

---

### Methods: Defining Object Behavior

Objects can have methods that define their actions. Example:

```java
public void meow() {
    System.out.println(name + " says meow");
}
```

Calling this method:

```java
zoe.meow();
glitch.meow();
```

Output:
```
Zoe says meow
Glitch says meow
```

---

### Encapsulation: Protecting Data

Encapsulation ensures that object data is accessed only through defined methods. This is done using **private** variables and **public** getter and setter methods.

```java
public class Cat {
    private String name;
    private int age;

    public Cat(String newName, int newAge) {
        name = newName;
        age = newAge;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String newName) {
        name = newName;
    }
}
```

This prevents direct modification of attributes while allowing controlled access.

---

### Summary

- **Objects** have attributes (data fields) and behaviors (methods).
- **Classes** define the blueprint for creating objects.
- **Constructors** automate object initialization.
- **Encapsulation** ensures data integrity.
- **UML diagrams** help visualize class structures.

Mastering these concepts is fundamental to **object-oriented programming (OOP)**.

---

### Practice Questions

1. **Conceptual:**
    - What is the difference between a **class** and an **object**?
    - How does a **constructor** improve object creation?

2. **Code Writing:**
    - Write a Java class for a `Car` with attributes (`make`, `model`, `year`, `mileage`) and a constructor to initialize them.
    - Add a method `displayInfo()` that prints out the car’s details.

3. **Debugging:**
    - What is wrong with this constructor?

      ```java
      public class Student {
          String name;
          int age;
          
          public void Student(String newName, int newAge) {
              name = newName;
              age = newAge;
          }
      }
      ```
    - How can you fix it?

---

