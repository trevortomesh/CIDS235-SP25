**Encapsulation, Passing Objects to Methods, and Variable Scope in Java**

### Encapsulation and Data Protection
Encapsulation is a fundamental concept in object-oriented programming that helps protect data within a class. By restricting direct access to data fields and requiring methods to be used for retrieval and modification, we ensure better control over how data is manipulated.

- **Public variables and methods**: These can be accessed from any other class.
- **Private variables and methods**: These are only accessible within the class they are declared in.
- **Package-private (default) visibility**: When no access modifier is specified, the field or method is accessible only within the same package.

Encapsulation allows us to enforce constraints on how data is accessed and modified, improving maintainability and reducing the risk of unintended side effects.

### Passing Objects to Methods
Java is a **pass-by-value** language, meaning that when passing a variable to a method, Java passes the value associated with that variable rather than the variable itself.

- **Primitive types**: When you pass an `int`, `double`, or other primitive types, the method receives a copy of the value, meaning changes inside the method do not affect the original variable.
- **Objects (Reference Variables)**: When an object is passed to a method, the method receives a copy of the reference (i.e., memory address) pointing to the object, not the actual object.
    - This means that while the reference itself cannot be changed inside the method (i.e., reassigned), modifications to the object's fields do persist outside the method.

Example:
```java
public class Example {
    public static void modifyValue(int x) {
        x = x + 10; // Does not affect original variable
    }
    
    public static void modifyObject(MyClass obj) {
        obj.value = obj.value + 10; // Affects original object
    }
}
```

### Reference Variables and Memory Management
Reference variables store memory addresses rather than the actual objects. When you assign an object to a reference variable, you are storing a location in memory where the object resides.

- **Modifying fields of an object affects all references to that object.**
- **Creating a new object within a method does not affect the original reference.**
- **Java includes automatic garbage collection to clean up objects that are no longer accessible.**

Example:
```java
public static void main(String[] args) {
    MyClass obj1 = new MyClass(5);
    modifyObject(obj1);
    System.out.println(obj1.value); // Will print updated value
}
```

### Scope of Variables
Variables in Java exist within specific scopes, which define where they can be accessed:

- **Instance variables**: Defined in a class, accessible throughout the instance's lifetime.
- **Static variables**: Shared among all instances of a class, associated with the class itself rather than an instance.
- **Local variables**: Declared inside a method, accessible only within that method.

Example of Scope:
```java
class Example {
    private int instanceVar; // Belongs to each instance
    static int staticVar;    // Shared among all instances

    public void method() {
        int localVar = 5; // Exists only within this method
    }
}
```

### The `this` Keyword
In Java, `this` is used to differentiate between instance variables and parameters or local variables with the same name. It refers to the current instance of the class.

Example:
```java
public class Circle {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius; // Differentiates between parameter and instance variable
    }
}
```

### **Practice Problems**

1. **Encapsulation Basics**
    - Define a `Person` class with private fields `name` and `age`.
    - Provide public getter and setter methods for these fields.
    - Ensure that `age` cannot be set to a negative number.

2. **Passing Objects vs. Primitive Types**
    - Write a method that takes an integer parameter and increases it by 5.
    - Write another method that takes an object with a `value` field and increases its `value` by 5.
    - Call both methods from `main` and observe the difference in behavior.

3. **Understanding Scope**
    - Create a class with an instance variable, a static variable, and a local variable inside a method.
    - Try to access each variable from different parts of the class and see what happens.

4. **Using `this`**
    - Modify an existing class so that a constructor uses `this` to differentiate between a parameter and an instance variable.

5. **Garbage Collection**
    - Create a program that creates multiple objects inside a method.
    - Use `System.gc();` to request garbage collection and observe its effect.

---
This summary captures the key ideas from the lecture, including encapsulation, reference variables, memory management, and scope, along with practice problems for reinforcement.

