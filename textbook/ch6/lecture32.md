# Pokemon Relationships

**Date:** April 18, 2025  
**Course:** CIS 235  
**Topic:** Exploring Object Relationships: Association, Aggregation, Composition

---

## Overview

This lecture explores object relationships in Java using Pokemon as a central example. We differentiate between three kinds of relationships:

- **Association**: General, non-inheritance-based relationship between classes
- **Aggregation**: A part-of relationship where parts can exist independently
- **Composition**: A strong relationship where the part cannot exist independently

We model these relationships with classes like `Trainer`, `Pokemon`, `Pokedex`, and `Pokeball`.

---

## Association

### Definition
Association describes a "has-a" relationship where two objects can reference each other but are not dependent on each other for existence.

### Example
```java
public class Trainer {
    private String name;
    private ArrayList<Pokemon> team;

    public Trainer(String name) {
        this.name = name;
        this.team = new ArrayList<>();
    }

    public void addPokemon(Pokemon p) {
        team.add(p);
        p.setTrainer(this);  // bidirectional link
    }

    public void printTeam() {
        for (Pokemon member : team) {
            System.out.println(member.getName());
        }
    }
}

public class Pokemon {
    private String name;
    private String species;
    private Trainer trainer;

    public Pokemon(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public String getName() { return name; }
    public String getSpecies() { return species; }
    public String getTrainerName() {
        return trainer != null ? trainer.getName() : "No Trainer";
    }
}
```

### Key Points
- Trainers can have teams of Pokemon.
- Pokemon may or may not have a Trainer.
- Bidirectional association is demonstrated by calling `setTrainer(this)`.

---

## Aggregation

### Definition
Aggregation is a more specific form of association. It represents a "whole-part" relationship where parts can exist independently of the whole.

### Example
```java
public class Pokedex {
    private ArrayList<Pokemon> entries;

    public Pokedex() {
        entries = new ArrayList<>();
    }

    public void addEntry(Pokemon p) {
        entries.add(p);
    }
}
```

### Key Points
- A `Pokedex` collects multiple `Pokemon` entries.
- `Pokemon` exists independently of the `Pokedex`.
- There is no bidirectional link; `Pokemon` does not store a reference to the `Pokedex`.

---

## Composition

### Definition
Composition is the strongest form of association. If the container object is destroyed, the contained object is destroyed too.

### Example
```java
public class Pokeball {
    private Pokemon containedPokemon;

    public Pokeball(String name, String species) {
        this.containedPokemon = new Pokemon(name, species);
    }

    public Pokemon getPokemon() {
        return containedPokemon;
    }
}
```

### Key Points
- The `Pokeball` *creates* the `Pokemon` inside itself.
- When a `Pokeball` is destroyed, so is its `Pokemon`.
- The lifetime of the `Pokemon` is tied to the lifetime of the `Pokeball`.

---

## Practice Problems

1. **Association**: Modify the `Trainer` class so that a `Trainer` can be removed from a `Pokemon` without deleting the `Pokemon`.
2. **Aggregation**: Extend `Pokedex` so that you can search for a `Pokemon` by species name.
3. **Composition**: Add a method to `Pokeball` that returns a `String` description of the contained `Pokemon`.
4. **Conceptual**: Explain the differences between association, aggregation, and composition in your own words. Give a real-world example of each.
5. **Code Debugging**: What happens if you forget to initialize the `ArrayList` in `Trainer`? Demonstrate the error.

---

**Next Class**: Wrap-up of object relationships and transition to interface-based multiple inheritance.

**Reminder**: Starting next Friday, classes will move online. Details to follow via Canvas.

---

**Have a great weekend!**

