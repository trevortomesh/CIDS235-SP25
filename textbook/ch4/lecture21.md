# Arrays, Wrapper Classes, and Introducing ArrayLists

In this section, we build upon our understanding of arrays and wrapper classes to introduce one of Java's most flexible data structures: the `ArrayList`.

## Recap: Wrapper Classes

Before diving into `ArrayLists`, we reviewed the concept of **wrapper classes**. Wrapper classes allow primitive data types to be treated as objects. For example:

```java
int a = 5;
Integer a1 = Integer.valueOf(a);
```

This technique becomes important when we want to use data structures that work only with objects (like `ArrayLists`). Wrapper classes include:
- `Integer` (for `int`)
- `Double` (for `double`)
- `Boolean` (for `boolean`)
- `Character` (for `char`), and others

## The Limitations of Arrays

Arrays are useful and efficient, but they come with a few limitations:
- **Fixed size**: Once an array is declared, its length cannot change.
- **Manual management**: Adding and removing elements often requires manual shifting.
- **Limited built-in methods**: Arrays do not have convenience methods like `add`, `remove`, or `contains`.

This is where `ArrayList` shines.

## Introducing `ArrayList`

An `ArrayList` is a resizable array from the Java Collections Framework. It allows dynamic management of elements and provides many convenient methods.

### Example: Working with an ArrayList

```java
import java.util.ArrayList;

public class CityListDemo {
    public static void main(String[] args) {
        ArrayList<String> cityList = new ArrayList<>();

        cityList.add("Stillwater");
        cityList.add("Waunakee");
        cityList.add("Cameron");
        cityList.add("Somerset");
        cityList.add("Hudson");

        System.out.println(cityList);                         // Print all cities
        System.out.println(cityList.size());                  // Number of cities
        System.out.println(cityList.contains("Hudson"));     // Does list contain "Hudson"?
        System.out.println(cityList.indexOf("Cameron"));      // Index of "Cameron"
        System.out.println(cityList.get(2));                  // Get city at index 2

        cityList.remove("Stillwater");                        // Remove "Stillwater"
        System.out.println(cityList);                         // Updated list
    }
}
```

### Output:
```
[Stillwater, Waunakee, Cameron, Somerset, Hudson]
5
true
2
Cameron
[Waunakee, Cameron, Somerset, Hudson]
```

## Summary of Common ArrayList Methods
- `add(element)` – adds an item
- `remove(element)` – removes an item
- `get(index)` – retrieves the item at the given index
- `size()` – returns the number of elements
- `contains(element)` – checks for existence of an item
- `indexOf(element)` – returns the index of an item (or -1 if not found)

## Why Use ArrayLists?
ArrayLists give you the power of dynamic resizing, built-in convenience methods, and compatibility with Java's object-oriented collections framework.

## Optional Exercises
1. Add more cities to the list and experiment with `add(index, element)`.
2. Replace an element in the list using `set(index, element)`.
3. Sort the list alphabetically using `Collections.sort(cityList)`.
4. Try using an `ArrayList<Integer>` with wrapper classes.

In the next section, we'll explore sorting and iterating over ArrayLists using loops and enhanced for-loops.

