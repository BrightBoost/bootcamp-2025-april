### Java Exercises – Data Types, Operators & Casting  
*(Increasing difficulty)*  

---

#### 1. Create 3 variables: an int, a double, and a char. Print them.

---

#### 2. Add two int variables and print the result.

---

#### 3. Divide an int by another int and print the result.

---

#### 4. Divide an int by a double and print the result. What data type is the result?

---

#### 5. Store your age in an int. Calculate and print: "In 10 years I will be: ..."

---

#### 6. Create a byte with value 100. Add 28 to it and store it in an int. Print it.

---

#### 7. Create a double with value 5.7. Cast it to int and print both.

---

#### 8. Multiply a float and an int. Store the result in a double. Print it.

---

#### 9. Store a char 'A' in a variable. Add 1 to it and print the result. (What happens?)

---

#### 10. Create two variables:
```java
int a = 9;
int b = 2;
```
Calculate and print: 
- a divided by b  
- a modulo b  

---

#### 11. Store your weight in a double. Store your height in a double. Calculate and print BMI:  
```java
BMI = weight / (height * height)
```

---

#### 12. Calculate the average of 3 double numbers. Print the result.

---

#### 13. BONUS: Expolore the compound assignment operator (`+=`, `*=`, etc.) to modify a variable step by step. Print after each step.

---

#### 14. Create a short with value 30000. Multiply it by 2. What happens? Fix it using casting.

---

#### 15. Create a variable `double price = 10.99`. Create `int quantity = 5`. Calculate total cost and cast the result to int. Print it.

---

#### 16. Create an int with value 130. Cast it to byte. Print it. Explain the weirdness.

---

#### 17. Create a variable `char letter = 'z'`. Subtract 2 from it and print the resulting character.

---

#### 18. Store a long value of 2 billion (2000000000). Add 1 billion to it. Print the result.

---

#### 19. Calculate the area of a circle:
```java
double radius = 4.5;
area = PI * radius * radius;
```
Use `Math.PI` and print the result.

---

#### 20. Mixing it all:  
Create variables of type:
- byte  
- short  
- int  
- long  
- float  
- double  
- char  

Do random operations between them (add, subtract, multiply), use casting when needed and print all the results.

## Mini Challenge: Time Calculator (Operators & Casting Only)

### The Story:
> A bakery is tracking its oven usage time. Every day, the ovens are on for a certain number of minutes. You are asked to convert total oven minutes into:
- Full hours
- Remaining minutes

---

### The Challenge:

1. Create an `int` variable with the total number of minutes the ovens were on.  
   Example:
```java
int totalMinutes = 350;
```

---

2. Calculate:
- Full hours 
- Remaining minutes 

---

3. Print this exact output:
```
Total minutes: 350
That is 5 hour(s) and 50 minute(s).
```

---

## Bonus (still no if, no loops)

4. Add a `double` variable for electricity cost per hour → e.g., `2.75` euros/hour.  
5. Calculate and print the total cost for the full hours only (ignore leftover minutes).

Example output:
```
Cost for 5 hour(s) = 13.75 euros
```

