
# Java Beginner Mini Projects (Level 1 to 20)

Ask the user >> means scanner

## 1. Say Hello
Ask the player for their name. Print:
```
Hello, [name]! Welcome to the game.
```

---

## 2. Age in Dog Years
Ask for the player's age. Print their age in dog years (multiply by 7).

---

## 3. Dice Roll
Generate a random number between 1 and 6 (use `Math.random()` or `Math.floor(Math.random() * 6) + 1`). Print it as a dice roll.

---

## 4. Hero Stats
Ask for the player's name, strength (int), and agility (int). Print:
```
Hero: [name] | Strength: [strength] | Agility: [agility]
```

---

## 5. Level Up!
Ask for current level (int). Add 1 and print:
```
You leveled up! You are now level [level]
```

---

## 6. Coin Calculator
Ask how many gold coins and silver coins the player found. Gold is worth 10 points, silver 1 point. Calculate and print total score.

---

## 7. Odd or Even Dice
Roll a dice. Print if it's odd or even.

---

## 8. Critical Hit Chance
Ask for player's luck stat (0-100). If luck > 50 → print "Critical Hit!" else "Normal Hit".

---

## 9. Character Class Check
Ask for a character class (input: "warrior" or "mage"). Print a different starting weapon for each.

---

## 10. Magic Number Guess
Hardcode a secret number. Ask the player to guess. Tell them if they're correct or not.

---

## 11. Speed Trap
Ask for player speed. If speed > 100 → print "Too fast! Slow down." Else → print "Safe speed."

---


## 12. Rock Paper Scissors
Ask for player choice (rock, paper, scissors). Generate computer choice. (You could use random 1-3 and connect it to the options.) Decide who wins.

---

## 13. Potion Shop
Ask for the player's gold. Potions cost 15 gold each. Ask how many they want. Calculate if they can afford it, and print change or "Not enough gold."

---

## 14. Damage Calculator
Ask for attack power and enemy defense. Damage = attack - defense. If damage < 0 → damage = 0. Print damage dealt.

---

## 15. XP to Next Level
Ask for current XP and XP needed to level up. Print how much XP is still needed.

---

## 16. Dungeon Door Code
Generate a random number (1-100). Ask for player's guess. If within ±5 → "Door Opens!". Else → "Try again."

---

## 17. Monster Battle
Ask for your HP and monster HP. Ask for your attack power. Subtract attack from monster HP. Print both HP.

---

## 18. Treasure Chest Trap
Ask for "open chest?" (yes/no). If yes → 50% chance (Math.random) to get gold or lose HP.

---

## 19. High Score Check
Ask for player's score and high score. If player beats high score → print "New Record!" Else → print "Try again."

---

## 20. Simple Character Creation
Ask for:
- Name (String)
- Age (int)
- Class (String)
- Strength (int)
- Agility (int)

Calculate a total "Power Score" = (strength * 2) + agility + (age / 2)

Print:
```
Welcome, [name] the [class]!
Your Power Score is: [power]
```

## Bonus Challenges – Loops & Switch Edition (Levels 21-30)

Please mind, we did not talk about loops yet. This is just to keep people who go really fast occupied. 

---

## 21. Dice Roll Until 6  
Keep rolling a dice (1-6) until you roll a 6. Print every roll.

---

## 22. Monster HP Battle  
Ask for monster HP. Every attack deals 10 damage. Use a loop to "attack" until HP is 0. Print attack count.

Example output:
```
You attacked! Monster HP is now 50
...
You attacked! Monster defeated after 7 hits!
```

---

## 23. Guess the Number (Retry Until Correct)  
Secret number = random between 1-10. Ask the player to guess. Keep asking until correct.

---

## 24. Rock Paper Scissors — Best of 3  
Loop until either player or computer has 2 wins.

---

## 25. Menu System (switch)  
Print:
```
1. Start Game  
2. View Stats  
3. Exit  
```
Let the player choose. Use switch to handle the options.

---

## 26. Potion Inventory  
Ask how many potions the player has. Loop from 1 to that number and print:
```
Potion #1 ready  
Potion #2 ready  
...
```

---

## 27. Basic Shop Loop  
Keep showing this menu until player types "exit":
```
Welcome to the Shop!
1. Sword - 100 gold
2. Shield - 75 gold
3. Potion - 15 gold
Type 'exit' to leave.
```

---

## 28. Attack Menu (switch)  
Ask for player choice:
```
Choose your attack:
1. Punch
2. Kick
3. Fireball
```
Use switch to print different damage outputs.

---

## 29. Monster Wave Battle  
Monsters are attacking in waves (let's say 5). Loop through each wave:
```
Wave 1 cleared!
Wave 2 cleared!
...
```

---

## 30. Lucky Number Game  
Let the player pick a number between 1-10. Roll a random number 10 times. Count how many times their number appeared.

Example output:
```
Your number appeared 3 times!
```

---

