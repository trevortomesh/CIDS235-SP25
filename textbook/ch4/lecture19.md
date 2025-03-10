# CIDS 235 — Assignment 2 Overview and Lecture Notes (March 10, 2025)

## Summary

Welcome back to CIDS 235! Today is March 10 — Mario Day (MAR10). This lecture focused on your second assignment, "Object-Oriented Battle Creatures Arena," and covered a deep dive into arrays and strings in Java.

### 📌 Assignment 2 Overview

**Title:** Object-Oriented Battle Creatures Arena

**Objective:** Enhance your previous battle creature implementation by designing a reusable, object-oriented battle system using Java. You’ll build three core classes:
- `BattleCreature`
- `Arena`
- `Main`

You’ll also complete a structured program write-up using a web form hosted on GitHub that auto-generates a PDF for submission.

#### 🔨 Required Classes & Methods

##### 1. BattleCreature Class
- Data fields:
    - `String nickname`
    - `String species`
    - `String type` ("fire", "water", "earth", "wind")
    - `String description`
    - `String originalCreator`
    - `int level`
    - `int healthPoints`
- Constructors:
    - You may choose how many constructors and which data fields to include in each signature. All fields must be initialized.
- Methods:
    - `getDescription()` — Returns `description + originalCreator`
    - Plus any getters and setters as appropriate.

##### 2. Arena Class
- Manages battles between two creatures.
- Required methods:
    - `addCreature(BattleCreature creature)`
    - `startBattle()` — Implement logic (can be randomized, HP/level-based, or more complex).

##### 3. Main Class
- Drives the simulation:
    - Create your own `BattleCreature`
    - Borrow a classmate's creature
    - Add both to `Arena`
    - Call `startBattle()`

##### Borrowing a Creature
- You must integrate a peer’s creature. Collect species, nickname, type, description, level, and HP.
- Include a short acknowledgement in your write-up.

##### Write-Up Submission
- Use the GitHub PDF Generator tool provided.
- Paste code, describe how requirements were fulfilled, include program output, and upload UML diagrams.

---

## Lecture Topic: Strings and Arrays

Today’s lecture centered on the core Java concepts you’ll need to implement Assignment 2 effectively: **strings and arrays**.

### 🔤 Strings in Java
- **Strings are objects**, not primitive types.
- **Immutable:** Strings cannot be changed once created. Assigning a new value to a string reference creates a new object in memory.
- String methods include:
    - `.charAt(index)` — Get a character by index
    - `.length()` — Get number of characters
    - `.equals()` / `.compareTo()` — Compare strings
    - `.trim()` — Remove whitespace
    - `.toUpperCase()` / `.toLowerCase()`

### 📚 String Constructors
- `String myStr = new String(charArray);` — Create a string from a character array
- `String myStr = "Hello";` — Preferred shortcut

### 📂 String Split & Tokenization
- `split(" ")` splits a string into an array based on delimiters (tokens):
```java
String myString = "Hello World";
String[] words = myString.split(" ");
System.out.println(words[0]); // Hello
System.out.println(words[1]); // World
```

### 🔢 Arrays in Java
- Arrays are fixed in size and store elements of the same type.
- Example:
```java
char[] letters = {'G', 'O', 'O', 'D', ' ', 'D', 'A', 'Y', '!'};
String message = new String(letters);
System.out.println(message); // GOOD DAY!
```

- You can also iterate through arrays using for-each loops:
```java
for (String word : words) {
  System.out.println(word);
}
```

### 🧠 Key Takeaways
- Strings are arrays of characters.
- Strings and arrays are central to building meaningful data structures.
- The `split()` method is useful for tokenizing string input.
- You are extending Java’s type system every time you create a class — this is the core idea behind object-oriented design.

### 🔗 Class Contracts and Encapsulation
- **Encapsulation**: Keeping data fields private and exposing only necessary behavior through public methods.
- **Class Contract**: The set of public constructors and methods available to clients using your class.

---

## 💡 Reflection
Understanding the class contract and how strings and arrays are structured allows you to build more flexible, modular systems. In Assignment 3, you’ll leverage your well-designed classes in new contexts — possibly even with graphical interfaces.

---

Let me know if you'd like a downloadable version of this section or a visual UML example.

