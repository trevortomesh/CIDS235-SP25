# CS 235 - March 5, 2025

## Class Abstraction and Encapsulation

### Introduction
Today, we continued our discussion on **class abstraction**, one of the key pillars of **object-oriented programming (OOP)**. We also revisited the importance of encapsulation and how abstraction simplifies software development.

### Key Concepts
#### Abstraction in OOP
- Abstraction is the **separation of a class's implementation from its usage**.
- Users of a class should not need to know how the class works internally, only how to interact with it.
- This makes programs easier to understand and maintain.

#### Examples of Abstraction
1. **Scanner Class**
    - When using `Scanner`, we do not need to know how `nextInt()` works internally; we just use it.
    - `Scanner input = new Scanner(System.in);`
    - `int num = input.nextInt();`

2. **Math.random()**
    - We use `Math.random()` without understanding its underlying algorithm.
    - It returns a pseudo-random double between `0.0` and `1.0`.

3. **Class Contracts**
    - The public-facing interface of a class, which includes:
        - Method signatures
        - Public constructors
        - Public fields
    - Users interact with this contract without needing to understand the underlying implementation.

### Understanding Method Signatures
- **A method signature** includes:
    - Method name
    - Parameter list
- Example:
  ```java
  public double getInterestRate()
  ```
  The method name is `getInterestRate`, and it takes no parameters.

### Practical Application: Loan Class
To demonstrate abstraction, we designed a **Loan class** that models a financial loan with the following attributes:
- `annualInterestRate` (double)
- `loanAmount` (double)
- `numberOfYears` (int)
- `loanDate` (Date)

The class also includes methods to:
- Get and set interest rates, loan amounts, and term lengths.
- Compute monthly and total payments.

### Automating Code Generation with AI
- The future of programming will involve defining **class contracts** and using AI tools to generate implementations.
- Example:
    - We provided ChatGPT with a **Loan class contract**.
    - ChatGPT generated a complete Java implementation.
- The key takeaway: **understanding class contracts is becoming an essential skill**.

## Practice Questions
1. **Conceptual Questions**
    - What is the difference between abstraction and encapsulation?
    - Why is abstraction useful in object-oriented programming?
    - How does method overloading relate to abstraction?

2. **Code-Based Questions**
    - Write a simple **Car** class with attributes `make`, `model`, and `year`, along with appropriate getter and setter methods.
    - Implement a `BankAccount` class with methods to deposit and withdraw money while ensuring that negative balances are not allowed.
    - Using method overloading, create multiple constructors for the `Loan` class that allow different ways to instantiate a loan.

3. **Understanding Class Contracts**
    - Given the following class contract, implement the corresponding Java class:
      ```
      private double annualInterestRate
      private double loanAmount
      private int numberOfYears
      private java.util.Date loanDate

      public Loan( )
      public Loan(double annualInterestRate, int numberOfYears, double loanAmount)
      public double getAnnualInterestRate()
      public int getNumberOfYears( )
      public double getLoanAmount( )
      public java.util.Date getLoanDate( )
      public void setAnnualInterestRate(double annualInterestRate)
      public void setNumberOfYears(int numberOfYears)
      public void setLoanAmount(double loanAmount)
      public double getMonthlyPayment( )
      public double getTotalPayment( )
      ```

### Conclusion
- **Abstraction allows programmers to work with complex systems without needing to understand their implementation details.**
- **Encapsulation ensures that the internal details remain hidden, enforcing proper use of the class.**
- **Future programmers will focus on defining class contracts while AI assists in generating implementations.**
---

## Practice Problems
1. **Understanding Class Contracts:**
    - Given the following class contract, write the corresponding Java class:
      ```java
      public class Book {
          private String title;
          private String author;
          private int pages;
          
          public Book(String title, String author, int pages) { ... }
          public String getTitle() { ... }
          public void setTitle(String title) { ... }
      }
      ```

2. **Encapsulation & Getters/Setters:**
    - Why is it good practice to make instance variables `private` and provide `public` getters and setters?
    - Modify the `Book` class to enforce that the number of pages must be greater than 0 when setting it.

3. **AI-Assisted Code Generation:**
    - Define a class contract for a `Student` class with the following attributes:
        - `name` (String)
        - `studentID` (int)
        - `GPA` (double)
    - Generate the corresponding class using an AI tool (or manually) and test it in a Java program.

4. **Method Overloading:**
    - Modify the `Loan` class to include an overloaded constructor that takes only `loanAmount` and sets default values for other attributes.

5. **Applying Abstraction:**
    - Consider the `Math` class in Java. Why do you think `Math.random()` is a `static` method? How does this relate to abstraction?

---

_This concludes the class discussion for March 5, 2025._


