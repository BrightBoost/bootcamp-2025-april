# 🎮 Java Console Game Recap Projects

## Number Guessing Game
Create a console game where the computer picks a number between 1 and 100, and the player has to guess it.

### 🎯 Requirements
- Use `Scanner` to get the user's guesses.
- Use `Random` to pick the secret number.
- After each guess, print if the guess is too high or too low.
- End the game when the user guesses correctly and show how many tries it took.
- Allow the player to play again (optional).

<!-- 💡 Hint: Use `Random rand = new Random(); int number = rand.nextInt(100) + 1;` -->

## Rock Paper Scissors
Simulate a Rock, Paper, Scissors game where the user plays against the computer.

### 🎯 Requirements
- Let the user type 'rock', 'paper', or 'scissors'.
- Generate a computer move randomly.
- Decide the winner based on the classic rules.
- Keep score and show the result each round.
- Optionally, let the user play a best-of-3 or best-of-5.

<!-- 💡 Hint: Use `.equalsIgnoreCase()` to compare string input safely. -->

## Word Scramble
Make a game where a word is scrambled and the user has to guess the original.

### 🎯 Requirements
- Create a list of words and randomly pick one.
- Scramble the letters of the word.
- Let the user guess the original word.
- Provide feedback if correct or wrong.
- Optionally, give the user 3 tries per word.

<!-- 💡 Hint: Convert string to char array and shuffle it for scrambling. -->

## Text Adventure Game
Build a mini story where the user can choose different paths (like a dungeon, forest, or beach).

### 🎯 Requirements
- Use multiple `if`, `else`, or `switch` statements.
- Allow the user to make decisions by typing simple commands.
- Each choice leads to different story outcomes.
- Keep it fun, spooky, or humorous.

<!-- 💡 Hint: Start by printing a welcome message and a first choice. Then call different methods like `startForest()` or `enterCave()`. -->

## Tic Tac Toe (2-player)
Create a simple 2-player Tic Tac Toe game in the console.

### 🎯 Requirements
- Use a 3x3 grid (2D array or list of lists).
- Let players take turns entering row and column.
- Show the board after every move.
- Check for a win or a draw after every move.
- End the game with a message and ask to play again (optional).

<!-- 💡 Hint: Initialize a 3x3 char[][] and fill it with spaces or '-' -->

## Quiz Game
Build a multiple-choice quiz that asks the user 5+ questions.

### 🎯 Requirements
- Store questions and options in arrays or an object.
- Show one question at a time with 3 or 4 options.
- Take user input and check if it's correct.
- Keep score and show it at the end.

<!-- 💡 Hint: Use a loop and index to show questions and check answers. -->

## Hangman
Recreate the classic hangman game where the user guesses letters to find the secret word.

### 🎯 Requirements
- Store a secret word and show progress with underscores.
- Let the user guess one letter at a time.
- Track incorrect guesses.
- End the game when the word is guessed or after too many wrong tries.

<!-- 💡 Hint: Use a `char[]` to track which letters were guessed. -->

## Simple Blackjack (21)
Let the user play a simplified version of Blackjack against the computer.

### 🎯 Requirements
- Deal two cards to user (random numbers between 1–11).
- Let user choose "hit" or "stand".
- Dealer hits until reaching 17 or higher.
- Closest to 21 wins without going over.

<!-- 💡 Hint: Use `while` loops for the game turns and a method to draw a random card. -->

## Math Battle
Make a math drill game where users answer as many math problems as they can.

### 🎯 Requirements
- Generate random math questions (e.g. 7 + 4, 9 * 6).
- Let the user answer and check if it's correct.
- Give them a score and possibly a time limit or mistake limit.

<!-- 💡 Hint: Use `Random` and `Scanner`, and track correct answers in a variable. -->

## Guess the Word (Lingo)
Create a word guessing game similar to Lingo or Wordle.

### 🎯 Requirements
- Pick a 5-letter word.
- Let the user guess and give feedback per letter:
  - correct position ✅
  - correct letter, wrong place 🔄
  - not in the word ❌
- Give the user 6 attempts.

<!-- 💡 Hint: Compare guessed letters to the answer one by one using a loop. -->

