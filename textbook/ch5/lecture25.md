**CS 235 Lecture Summary - April 2, 2025: Inheritance and the Object Class**

---

### Summary
In this lecture, we revisited the concept of the `Object` class in Java and its role as the root of the class hierarchy. Every class implicitly extends `Object`, meaning every instance of a class also inherits the methods defined in `Object`. These include methods like `toString()`, `equals()`, `getClass()`, and others.

We discussed the limitations of generic `Object` instances due to their abstract and formless nature, and how extending the `Object` class with specific classes (like `Circle`, `Rectangle`, or `Cat`) provides useful structure and methods.

Building on this foundation, we introduced the `GeometricObject` class, which is meant to abstract away common properties of shapes (like `Circle` and `Rectangle`). These shared properties include:
- `color` (a `String`)
- `filled` (a `boolean` indicating whether the shape is filled)
- `dateCreated` (a `Date` object from `java.util.Date`)

This class also includes common methods:
- `getColor()` and `setColor(String color)`
- `isFilled()` and `setFilled(boolean filled)`
- `getDateCreated()`
- Overridden `toString()` method to show creation date, color, and fill status

We then explored **inheritance** by creating a `Circle` class that **extends** `GeometricObject`, thus inheriting its data fields and methods. When constructing a `Circle`, we now supply a radius, color, and fill status. These values are then used to:
- Set the radius (specific to `Circle`)
- Use the inherited `setColor()` and `setFilled()` methods

Finally, we demonstrated how method overriding works with `toString()`, allowing subclasses to provide more meaningful output. For example, `System.out.println(circleObj)` will use the overridden `toString()` in `GeometricObject` to print out a string including color, fill status, and date created.

---

### Key Concepts
- **Inheritance**: Subclasses automatically inherit fields and methods from their superclasses.
- **Superclass vs. Subclass**: `Object` is the ultimate superclass; custom classes like `Circle` or `Rectangle` can be both subclasses (of `GeometricObject`) and superclasses (if extended further).
- **Overriding Methods**: A subclass can override a method from its superclass to change behavior.
- **Constructor Chaining**: Subclasses can and should invoke their superclass constructors and methods.

---

### UML Summary (Textual Form)
```
Object
  └── GeometricObject
          ├── Circle
          └── Rectangle
```

---

### Optional Exercises
1. Create a new class `Triangle` that extends `GeometricObject` and includes side lengths `a`, `b`, and `c`. Add methods to compute perimeter and area (use Heron’s formula).
2. Override the `toString()` method in `Triangle` to include side lengths and inherited fields.
3. In `Main.java`, create instances of `Circle`, `Rectangle`, and `Triangle` with different colors and fill statuses. Print them using `System.out.println()`.
4. Modify the `GeometricObject` class to also store the name of the shape.
5. Create a method in `GeometricObject` called `describe()` that returns a more detailed multi-line string.
