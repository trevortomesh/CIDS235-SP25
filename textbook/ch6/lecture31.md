# CS 235 – April 16, 2025

## Recap: Polymorphism, `instanceof`, and `equals`

- **`instanceof` Operator**: Determines whether an object is an instance of a given class (or any superclass along the inheritance tree).
    - E.g. A `Cat` is an instance of `Cat`, `Mammal`, and `Object`.
    - Helps in type-safe casting.

- **Polymorphism Refresher**:
    - Allows writing generic methods (e.g. `displayObject(Object obj)`) that accept any object.
    - Use `instanceof` to determine the actual type before casting and accessing subclass-specific methods.
    - Example:
      ```java
      if (object instanceof Circle) {
          Circle c = (Circle) object;
          System.out.println("Area: " + c.getArea());
      }
      ```

- **Primitive Type Casting**:
  ```java
  int age = 45;
  byte newAge = (byte) age;  // Value is copied
  ```

- **Object Reference Casting**:
  ```java
  Object o = new Circle();
  Circle c = (Circle) o;     // Reference is shared
  System.out.println(c == o); // true
  ```
    - This does **not** create a new object. Both variables reference the same memory location.

## Class Relationships

### Three Common Types:
1. **Association**
2. **Aggregation**
3. **Composition**

### 1. Association
- A **loose relationship** between classes.
- Example: `Student` takes a `Course`
- UML: simple line connecting `Student` ↔ `Course`
- Neither depends on the other for existence.

```java
class Student {
    private Course[] courseList = new Course[5];
    void addCourse(Course c) { ... }
}

class Course {
    private Student[] classList = new Student[30];
    void addStudent(Student s) { ... }
}
```

### 2. Aggregation
- A **has-a** relationship where one class owns or contains another, but both can exist independently.
- Example: `Student` has an `Address`

```java
class Student {
    private Address address;
    void setAddress(Address a) {
        this.address = a;
    }
}
```

- UML: **open diamond** from `Student` → `Address`
- Multiplicity:
    - One `Student` has **1** `Address`
    - One `Address` can belong to **1–4** `Students`

### 3. Composition
- A **strong** form of aggregation.
- One class is **dependent** on the other for existence.
- If the containing object is deleted, the composed object should also be deleted.
- Example: `Student` has a `Name`

```java
class Student {
    private Name name;
}
```

- UML: **filled diamond** from `Student` → `Name`
- The `Name` cannot exist independently of the `Student`

## UML Summary
```
Student ⬩───▶ Address    (Aggregation)
Student ◆───▶ Name       (Composition)
Student ───▶ Course      (Association)
Faculty ───▶ Course      (Association)
Course ───▶ Student      (Association)
Course ───▶ Faculty      (Association)
```

## Notes
- Use method calls to establish relationships between objects (e.g., `addStudent()`, `setFaculty()`).
- Remember: `==` checks reference equality, not content.
- Avoid runtime `ClassCastException` by using `instanceof` before casting.

## Coming Up
- More on composition and dependencies.
- Applying these concepts in design.

---

🧠 _Takeaway_: All compositions are aggregations, and all aggregations are associations—but not the other way around.

📆 See you Friday!

