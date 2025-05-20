

## 🎯 **Mini Project – Guess the Number (OOP Edition)**

---
<details>
<summary>

### 📘 **Version 1: Step-by-Step Instructions**

This version is ideal for students who benefit from clear, incremental guidance.

---
</summary>

#### 🧱 Step 1: Create the Interface

* Create an interface called `PlayableGame`.
* Add one method to it: `void startGame();`

---

#### 🧱 Step 2: Create the Game Class

* Create a class called `GuessingGame` that implements the `PlayableGame` interface.
* Add the following **fields**:

  * A target number (between 1 and 100).
  * A `Scanner` to read user input.
  * An `ArrayList<Integer>` to store the player's guesses.

---

#### 🧱 Step 3: Set Up the Constructor

* In the constructor:

  * Generate the target number using a `Random` object.
  * Initialize the `Scanner` and the `ArrayList`.

---

#### 🧱 Step 4: Implement the Game Logic

* In the `startGame()` method:

  * Print a welcome message.
  * Use a `while` loop to repeatedly ask the user to guess a number.
  * Compare the guess to the target:

    * Print "Too high!" or "Too low!" if incorrect.
    * Print a congratulations message if correct.
  * After each guess, add it to the `ArrayList`.

---

#### 🧱 Step 5: Create the Launcher

* Make a `GameLauncher` class with a `main` method.
* In `main`, create an instance of `GuessingGame` and call `startGame()`.

---

#### ✅ Optional Extras

* After the game ends, print all previous guesses.
* Ask the user if they want to play again.

---

### 🎯 What You'll Practice

* Interfaces and implementing them
* Classes and constructors
* Scanner for user input
* Loops and conditional logic
* Working with `ArrayList`

</details>
<details>
<summary>

### 🧭 **Version 2: High-Level Instructions**

This version is better for students who enjoy figuring things out themselves or need a challenge.

---
</summary>

## 🔨 Your Task: Build a Text-Based Number Guessing Game in Java

You’ll create a simple Java game where the computer picks a random number between 1 and 100, and the player tries to guess it. The game should tell the player whether their guess is too high or too low, and continue until they get it right.

---

### 💡 Requirements:

* Use **OOP principles**: create an interface and a class that implements it.
* Use a **Scanner** to read input.
* Use an **ArrayList** to store the guesses.
* Use **loops** and **if/else logic** to control game flow.

---

### 🧩 Structure:

* Create a `PlayableGame` interface with a `startGame()` method.
* Create a class `GuessingGame` that implements the interface.
* In the game class:

  * Generate a random number between 1 and 100.
  * Use a loop to allow the player to guess until they get it right.
  * After each guess, tell them if it’s too high or too low.
  * Keep track of all guesses and show how many it took to win.

---
</details>

### 🚀 Need more Challenges?!

* Display all past guesses after the player wins.
* Ask if they want to play again.
* Set difficulty levels (1–50, 1–100, 1–500).

