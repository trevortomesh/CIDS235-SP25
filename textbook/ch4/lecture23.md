**CS 235: Custom Data Structures Using ArrayLists**

*Lecture Summary - March 28, 2025*

---

### Summary
In this lecture, we built on our discussion of `ArrayList`s by applying them to create a custom data structure: a **Stack**. We reviewed the conceptual model of stacks (Last-In-First-Out behavior), explored real-world analogies (Pringles cans and call stacks), and implemented our own `MyStack` class using Java's `ArrayList<Object>`. The lecture emphasized object-oriented design principles, encapsulation, and the foundational role stacks play in computing.

---

### Key Concepts

#### 1. Review of the Midterm
- Most students passed; no failing grades.
- Questions were intentionally tricky but not trick questions.
- Grades were posted promptly.

#### 2. `ArrayList` Recap
- Resizable alternative to arrays.
- Can store any object type.
- Supports useful methods: `.add()`, `.get()`, `.remove()`, `.size()`, `.contains()`.
- Great for object-oriented and generic programming.

#### 3. Introducing the Stack Data Structure
- Follows **First-In, Last-Out (FILO)** principle.
- Useful for managing method calls (e.g., the call stack).
- Operations:
    - `push`: adds an item to the top.
    - `pop`: removes and returns the item on top.
    - `peek`: returns the item on top without removing it.

#### 4. Designing a Custom `MyStack` Class
- Uses `ArrayList<Object>` to store stack elements.
- Class includes the following methods:

```java
public class MyStack {
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public void push(Object o) {
        list.add(o);
    }

    public Object peek() {
        return list.get(getSize() - 1);
    }

    public Object pop() {
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }
}
```

- `Object` is used to allow any type of item (circle, cat, loan, etc.) to be added.
- Demonstrates encapsulation: internal `ArrayList` is private and only accessed via methods.

#### 5. Stack Behavior Demonstration
- Used in `Main.java` to test stack operations:
    - Check if empty before and after `push()`.
    - Push different objects (e.g., `Circle`, `Cat`, `Loan`).
    - Print contents using `peek()` and `pop()`.

#### 6. Notes on Object Methods
- Can't call class-specific methods on objects retrieved from `MyStack` without casting.
- Leads into discussion of **polymorphism**, coming up in future lectures.

---

### Code Behavior Summary
```java
MyStack stack = new MyStack();
System.out.println(stack.isEmpty()); // true
stack.push(new Circle());
stack.push(new Cat());
System.out.println(stack.getSize()); // 2
System.out.println(stack.peek()); // address of Cat
System.out.println(stack.pop()); // removes and returns Cat
System.out.println(stack.peek()); // now shows Circle
```

---

### Key Takeaways
- Stacks are a foundational concept in computing.
- Java's `ArrayList<Object>` enables flexible, dynamic stack implementation.
- Good object-oriented design involves encapsulating internal data structures.
- The `MyStack` class prepares us for deeper topics like inheritance and polymorphism.

---

### Coming Up Next
We will begin exploring **inheritance and polymorphism**, starting with how Java classes extend other classes and override behaviors. This will help us resolve the limitation we encountered when calling class-specific methods on generic `Object` types.

---

### Practice Questions
1. What is the return type of the `peek()` method in the `MyStack` class?
2. Why do we use `getSize() - 1` to access the top element of the stack?
3. What Java class do we use internally in `MyStack` to manage the collection?
4. What happens if you call `pop()` on an empty stack? (Try it!)
5. Why can’t we call `getBreed()` on a `Cat` retrieved from `MyStack` without casting?

---

*End of Lecture Notes*

