# CIS 235 - April 20, 2025

## Final Assignment Introduction: Evolutionary Battle Creatures

### 📢 Announcements
- **Friday, April 25**: No in-person class. You will complete a virtual activity posted on Canvas.
- **Monday, April 28 and onward**: All sessions will be held via Zoom. Thanks for your continued patience!

---

## 🧪 Final Assignment Overview
You will build on your previous **Battle Creature** assignment to demonstrate core object-oriented programming concepts:
- Inheritance
- Constructor chaining
- Method overriding

You will create an **evolving creature battle simulator** with three main classes:

### 🔧 Classes Required
1. **BattleCreature (Base Class)**
    - Use your previous implementation.
    - Retain all relevant data fields and methods.

2. **EvolvedCreature (Subclass of BattleCreature)**
    - **Additional Fields**:
        - `evolutionName` (String): Name of the evolved form
        - `specialMove` (String): Unique move
        - `bonusHP` (int): Bonus HP upon evolution
    - **Constructor Chaining**: Must call the parent constructor
    - **Override**: `getDescription()` should be overridden to include new data

3. **Arena**
    - Accepts only `BattleCreature` objects
    - Enhancements:
        - Detect if a creature is evolved
        - Log special abilities during battles
        - Demonstrate polymorphism by treating all creatures as `BattleCreature` references

---

## ✅ Tasks and Deliverables
### 🗂 Tasks
- **Design UML Diagram**:
    - Show inheritance and aggregation relationships

- **Demonstrate Constructor Chaining**:
    - Initialize both parent and child fields in the subclass constructor

- **Override Methods**:
    - Override `getDescription()` to show evolution info

- **Simulate a Battle**:
    - Add both `BattleCreature` and `EvolvedCreature` instances
    - Run a battle and show polymorphic behavior

### 📄 Deliverables
Use the provided **write-up tool**:
- **Program Overview**
- **UML Diagram Screenshot**
- **Constructor Chaining Snippet and Explanation**
- **Method Overriding Snippet and Explanation**
- **Arena Class & Polymorphism Explanation**
- **Extras (if any)**
- **Conclusion**
- **Full Code**
- **Acknowledgments**

**Note**: A consent checkbox for AI-assisted grading will be added to the tool. If you do not consent, **please include that in your program overview manually.**

---

## 🔁 Class Relationships Review
### Key Relationships
- **BattleCreature → EvolvedCreature**: Inheritance (use `extends` in Java, shown with a triangle in UML)
- **Arena → BattleCreature**: Aggregation (Arena holds references to creatures)

### Example with Pokémon:
- **Trainer → Pokémon**: Association (loose, optional, bidirectional)
- **Pokédex → Pokémon**: Aggregation (Pokédex contains entries)
- **PokéBall → Pokémon**: Composition (strong dependency; Pokémon is created in the PokéBall)

### UML Notation:
| Relationship    | Symbol         | Lifetime Dependency         |
|------------------|------------------|------------------------------|
| Association      | Line             | Independent                 |
| Aggregation      | Open Diamond     | Independent                 |
| Composition      | Filled Diamond   | Dependent (contained object is deleted when container is deleted) |

---

## 🌟 Design Tips
- Use **constructor chaining** (`super(...)`) in your `EvolvedCreature`
- Override `getDescription()` in `EvolvedCreature` to enhance output
- Use **instanceof** and **casting** to detect and use subclass-specific behavior
- Your `Arena` class should accept `BattleCreature` references to enable **polymorphism**

---

## 🧠 Practice Questions
1. **What is the relationship type between `EvolvedCreature` and `BattleCreature`?**
    - _Answer: Inheritance._

2. **If an arena holds a list of `BattleCreature` objects, but some are `EvolvedCreature`, how can you access their extra methods?**
    - _Answer: Use `instanceof` to check the type and cast appropriately._

3. **Why is `PokéBall → Pokémon` a composition and not aggregation?**
    - _Answer: Because the `Pokémon` is created inside and managed by the `PokéBall`. If the `PokéBall` is deleted, so is the `Pokémon`._

4. **Can aggregation exist between objects of the same class? Give an example.**
    - _Answer: Yes. Example: a `Person` class can have a `Person spouse` field._

5. **Why should we model `Move` as a composition within `Pokémon` if it's unique to each one?**
    - _Answer: Because the `Move` only makes sense in the context of its owning `Pokémon`._

---

## 🏁 Next Steps
- Wednesday: Review more examples with `Course`, `Student`, and `Faculty`
- Friday: Virtual activity
- Following Monday: Final topics, including **abstract classes**

🎉 You're almost at the finish line! Keep going strong!

_Office hours available today (except at 4 PM). Feel free to drop in!_