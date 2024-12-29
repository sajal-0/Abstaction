### README: Banking Application - Abstraction Practice

#### Overview
This project demonstrates the concept of **abstraction** in Java by simulating basic banking operations such as checking balance, withdrawing money, and depositing money. It uses interfaces and a concrete class to showcase **polymorphism** and **dynamic method dispatch**.

---

#### Features
1. **Interfaces**:
   - `KOTAKBank` and `SBIBank` define the blueprint for banking operations.
   - Methods:
     - `checkBalance()`
     - `withDraw(int amt)`
     - `deposit(int amt)`
2. **Concrete Implementation**:
   - `STATEBank` implements both interfaces, providing the actual logic for banking operations.
3. **Dynamic Dispatch**:
   - Demonstrates polymorphism by referencing the `STATEBank` object with both `SBIBank` and `KOTAKBank` references.
4. **User Interaction**:
   - Users can:
     - Check their balance.
     - Withdraw money (with validations).
     - Deposit money.

---

#### How to Run
1. Clone or download the project to your local machine.
2. Compile the Java files using:
   ```bash
   javac com/Bank/*.java
   ```
3. Run the `Test` class to start the application:
   ```bash
   java com.Bank.Test
   ```

---

#### Project Structure
```plaintext
com/Bank/
├── KOTAKBank.java   # Interface defining KOTAK bank operations
├── SBIBank.java     # Interface defining SBI bank operations
├── STATEBank.java   # Concrete class implementing both interfaces
└── Test.java        # Main class to execute and test the functionality
```

---

#### Example Workflow
1. **SBI User**:
   - Check balance.
   - Withdraw money (validated against user and ATM balance).
   - Deposit money.
2. **KOTAK User**:
   - Similar operations as above.

---

#### Concepts Demonstrated 
- **Abstraction**: Defined by the `KOTAKBank` and `SBIBank` interfaces.
- **Encapsulation**: User balance and ATM balance are managed securely.
- **Polymorphism**: Demonstrated through dynamic method dispatch.
- **Static vs Instance Variables**: ATM balance is shared across all users (static), while user balance is instance-specific.

---

#### Notes
- This project is for **academic practice** to understand abstraction and polymorphism in Java.
- Input validation is implemented, but further enhancements (e.g., handling incorrect inputs) can be added.

---

Enjoy learning and coding! 😊


