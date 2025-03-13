# Lecture Summary: March 12, 2025 – CS 235

### Summary
This lecture continued our exploration of arrays and strings, with a focus on how arrays and strings relate to object-oriented programming in Java. Key topics included string immutability, array-object relationships, arrays of objects, multidimensional arrays, and wrapper classes for primitive types. These topics are not bonus material — they are the central focus of this lecture and foundational for the upcoming assignment work.

---

### Strings Revisited
- **Strings Are Objects:** Strings in Java are not just sequences of characters — they are instances of the `String` class. This means they have methods (e.g., `length()`, `charAt()`, `toUpperCase()`), just like any other object.
- **Immutability:** Strings are immutable. When you reassign a string (e.g., `s = "Python"`), Java doesn't modify the original string. It creates a new object in memory and reassigns the reference.
- **Strings as Character Arrays:** Internally, strings are implemented as arrays of characters. When we create a string using `String s = "Java";`, we are effectively defining a fixed-length character array. Changing it requires creating a new array (i.e., new object).

### Arrays Refresher
- **Arrays Can Store Primitive and Derived Types:** Arrays can store primitives like `int`, `char`, `double`, but they can also store derived data types, like objects (e.g., `Circle[] circles`).
- **Arrays Are Objects Too:** Arrays have properties like `.length` and methods like `.clone()` — they are themselves objects.
- **2D Arrays:** Two-dimensional arrays are arrays of arrays. Example:
```java
int[][] arr = {
    {1, 2, 3},
    {4, 5, 6}
};
System.out.println(arr[1][1]); // prints 5
```

### Arrays of Objects
- You can store objects in arrays just like primitives:
```java
Circle circly = new Circle(2.0);
Circle circleGuy = new Circle(7.323);
Circle[] circleArray = {circly, circleGuy};
```
- You can loop through these arrays and call methods on each object:
```java
for (int i = 0; i < circleArray.length; i++) {
    System.out.println(circleArray[i].getArea());
}
```
- Arrays of objects are actually arrays of reference variables pointing to the actual object locations in memory.

### Passing Arrays of Objects to Methods
You can pass an array of objects to a method:
```java
public static void printCircleArray(Circle[] circles) {
    for (Circle c : circles) {
        printCircle(c);
    }
}
```

### Multidimensional Object Arrays
- You can create multidimensional arrays of objects:
```java
Cat[][] trevorsCats = {
    {new Cat("Glitch"), new Cat("Susu")},
    {new Cat("Genki"), new Cat("Haku")}
};
```
- Combining different object types in the same array is not currently possible using what we've learned. We'll revisit this idea with polymorphism in future lectures.

### Wrapper Classes
- Primitive types cannot have methods. To allow method use, Java provides **wrapper classes** like `Integer`, `Double`, `Character`, etc.
```java
int a = 5;
Integer aWrapped = Integer.valueOf(a);
System.out.println(aWrapped.byteValue());
```
- These wrapper classes allow you to treat primitives as objects, enabling additional functionality and compatibility in object-oriented contexts.

---

### Key Concepts Covered
- Strings are immutable object instances of the `String` class
- Arrays are objects and can store both primitive and object types
- Arrays can be passed to methods and used for object storage
- Wrapper classes allow primitives to behave like objects

---

### Coming Up Next
On Friday, we will continue discussing wrapper classes and explore special use cases like **BigInteger** and **BigDecimal** for extremely large numbers and precise decimal arithmetic.

If you're working on Assignment 2, this material is especially relevant — particularly passing arrays of objects to methods and organizing your arena battles using object arrays.

Let me know if you have any questions, and great job following along!

