**CS 235 Lecture Summary: April 4, 2025**

**Topic:** Inheritance, Polymorphism, and Constructor Chaining in Java

---

### Overview:
Today we continued our exploration of **inheritance**, focusing on how Java classes can inherit from both built-in and user-defined parent classes. We also covered **constructor chaining**, **method overriding**, and the use of the **`super`** keyword. These concepts are central to understanding **object-oriented programming** (OOP) and the relationships between classes in a hierarchy.

---

### Key Concepts:

#### 1. **Shared Properties in Shapes**
- Classes like `Circle`, `Rectangle`, and `Triangle` share properties:
    - `color` (String)
    - `filled` (boolean)
    - `dateCreated` (Date)
- These shared properties were abstracted into a **parent class**: `GeometricObject`

#### 2. **Hierarchy and Inheritance**
- Every class in Java **implicitly extends** the built-in `Object` class.
- Our custom classes (`Circle`, `Rectangle`) extend the `GeometricObject` class.
- Inheritance allows child classes to use methods and fields defined in their superclasses.
- A `Circle` is simultaneously a `Circle`, a `GeometricObject`, and an `Object`.

#### 3. **Method Inheritance and Overriding**
- Inherited methods from `GeometricObject`: `getColor()`, `isFilled()`, `getDateCreated()`, etc.
- Inherited methods from `Object`: `toString()`, `equals()`, `hashCode()`, etc.
- The `toString()` method was **overridden** in `GeometricObject` to print color, filled status, and creation date.
- The overridden method was inherited by both `Circle` and `Rectangle`, giving them meaningful string representations.

#### 4. **Constructor Overloading and Chaining**
- Multiple constructors were created in both `Circle` and `Rectangle`.
- Constructors in child classes can call **superclass constructors** using the `super()` keyword.
- `super(color, filled)` calls the parent constructor with specific arguments.
- This reduces redundancy (no need to call setter methods explicitly).
- **Important Rule:** A call to `super()` must be the first statement in a constructor.

#### 5. **Constructor Chaining Analogy**
- Creating an object like a `Circle` involves chaining constructor calls up the class hierarchy.
    - From `Circle` → `GeometricObject` → `Object`
- Analogy: Samsung factory starts with a block of iron and refines it step-by-step into an appliance like a phone. Each level adds more specific characteristics.

---

### Code Demonstrations:
- Instantiating `Circle` and `Rectangle` objects and using inherited methods.
- Confirming default values like `0.0` for `double` fields.
- Demonstrating that constructors do **not** get inherited, but **can** be invoked using `super()`.

---

### Vocabulary:
- **Inheritance**: Mechanism to acquire fields and methods from a parent class.
- **Polymorphism**: An object can be treated as an instance of its parent class or interface.
- **Overriding**: Child class redefines a method of the parent class.
- **Overloading**: Multiple methods with the same name but different parameter lists.
- **Constructor Chaining**: One constructor calls another in the inheritance chain.
- **`super` keyword**: Used to refer to the superclass, call its methods or constructors.

---

### Questions to Reflect On:
1. What’s the difference between overriding and overloading a method?
2. Why must a call to `super()` be the first line in a constructor?
3. What methods does every Java class inherit from the `Object` class?
4. Why does Java allow a class to be described at multiple levels of abstraction?
5. How does constructor chaining ensure that each layer of a class hierarchy is properly initialized?

---

### Up Next:
On Monday we will talk more about **constructor chaining**. 

---

**End of Summary**

