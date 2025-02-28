# **Encapsulation and Passing Objects to Methods (Continued)**
## **CIS 235 – February 28, 2025**

## **Encapsulation Recap**
- **Encapsulation** ensures an object's data is protected from direct modification.
- **Visibility Modifiers:**
    - `public`: Accessible from anywhere.
    - `private`: Accessible only within the same class.
    - **Default (Package-Private)**: Accessible within the same package.

---

## **Reference Variables & Passing Objects to Methods**
- **Objects are manipulated through reference variables.**
    - Example: `Circle c1 = new Circle(5.0);`
    - `c1` is a **reference variable** pointing to a memory location where the object resides.
- **Java is a pass-by-value language, not pass-by-reference.**
    - When passing **primitive types** (e.g., `int`), the **value is copied**, so changes inside a method **don’t** affect the original variable.
    - When passing **objects**, the **value of the reference (memory address) is copied**, meaning the method can modify the original object but not change its reference.

### **Example 1: Pass by Value with a Primitive**
```java
public static void addTwo(int x) {
    x = x + 2;
    System.out.println(x); // Prints 7 if x was 5
}

int a = 5;
addTwo(a);
System.out.println(a); // Still prints 5
```
> *Changes inside the method don’t affect `a` because Java passes by value.*

---

### **Example 2: Pass by Value with an Object Reference**
```java
public static void printCircle(Circle c) {
    c.setRadius(10);
}

Circle c1 = new Circle(5);
printCircle(c1);
System.out.println(c1.getRadius()); // Prints 10
```
> *The reference to `c1` was copied, but both references point to the same object. Changes inside the method persist outside.*

---

## **Garbage Collection in Java**
- **Java’s garbage collector** automatically removes objects from memory when they are no longer referenced.
- Unlike **C/C++**, Java prevents **memory leaks** by deallocating unused objects.
- If an object is **no longer accessible**, it is eligible for garbage collection.

---

## **Scope of Variables in a Class**
- **Instance Variables (`private double radius;`)**
    - **Belong to individual objects** and can only be accessed inside instance methods.
- **Static Variables (`private static int numberOfObjects;`)**
    - **Belong to the class itself** and are shared across all instances.
    - Accessible inside **static methods only**.
- **Scope of Variables:**
    - A class-level variable is accessible **anywhere within the class** (except in static methods, if it’s an instance variable).

---

## **Introduction to the `this` Keyword**
- `this` differentiates **instance variables** from method parameters.
- Example:
  ```java
  public class Circle {
      private double radius;
      
      public Circle(double radius) {
          this.radius = radius;  // ‘this.radius’ refers to the instance variable
      }
  }
  ```
- **Why use `this`?**
    - Avoids confusion when parameter names match instance variables.
    - Refers to the **current object** inside an instance method.

---

## **Practice Questions**
### **Conceptual Questions**
1. What is the main purpose of encapsulation in object-oriented programming?
2. What are the three main visibility modifiers in Java, and how do they differ?
3. Why does Java use pass-by-value rather than pass-by-reference?
4. What is a **reference variable** in Java, and how does it differ from a primitive variable?
5. Why does modifying an object inside a method affect the original object, but modifying a primitive does not?

### **Code-Based Questions**
6. What will be the output of the following code?
   ```java
   public static void changeValue(int x) {
       x = 10;
   }

   public static void main(String[] args) {
       int num = 5;
       changeValue(num);
       System.out.println(num);
   }
   ```
   **a)** 5  
   **b)** 10  
   **c)** Error

7. What will be the output of the following code?
   ```java
   public class Circle {
       private double radius;

       public Circle(double radius) {
           this.radius = radius;
       }

       public void setRadius(double radius) {
           this.radius = radius;
       }

       public double getRadius() {
           return this.radius;
       }
   }

   public static void modifyCircle(Circle c) {
       c.setRadius(20);
   }

   public static void main(String[] args) {
       Circle myCircle = new Circle(10);
       modifyCircle(myCircle);
       System.out.println(myCircle.getRadius());
   }
   ```
   **a)** 10  
   **b)** 20  
   **c)** Error

8. If a class has the following variables:
   ```java
   private static int numCircles;
   private double radius;
   ```
    - Which variable belongs to **the class itself**?
    - Which variable belongs to **each individual instance**?

9. Explain what happens when you pass an object to a method in Java. What gets passed—the object itself or something else?

10. Modify the following class to prevent negative radius values:
    ```java
    public class Circle {
        private double radius;

        public void setRadius(double r) {
            radius = r;
        }

        public double getRadius() {
            return radius;
        }
    }
    ```

---

## **Next Steps**
- **More on the `this` keyword** and **method scope** next class.
- **Assignments will be graded by Monday.**
- **Office hours this afternoon** for questions.

---
