# Java Mini Exercises — Math Class

## 1. Math.abs(x)
> Returns the *absolute value* → always positive.

Example:
```java
System.out.println(Math.abs(-10)); // 10
System.out.println(Math.abs(5));   // 5
```

### Exercise:
Create an `int` variable with value `-45`.  
Print it as a positive number using `Math.abs()`.

---

## 2. Math.max(x, y)
> Returns the *largest* of two numbers.

Example:
```java
System.out.println(Math.max(4, 10));  // 10
```

### Exercise:
Create two `double` variables: 3.5 and 7.8  
Print the biggest one.

---

## 3. Math.min(x, y)
> Returns the *smallest* of two numbers.

Example:
```java
System.out.println(Math.min(4, 10));  // 4
```

### Exercise:
Create two `int` variables: 99 and 23  
Print the smallest one.

---

## 4. Math.floor(x)
> Rounds *down* to the nearest whole number.

Example:
```java
System.out.println(Math.floor(6.8));  // 6.0
System.out.println(Math.floor(6.1));  // 6.0
```

### Exercise:
Create a `double` variable with value `8.9`.  
Print the floored value.

---

## 5. Math.ceil(x)
> Rounds *up* to the nearest whole number.

Example:
```java
System.out.println(Math.ceil(3.1));  // 4.0
System.out.println(Math.ceil(3.9));  // 4.0
```

### Exercise:
Create a `double` variable with value `5.2`.  
Print the ceiled value.

---

## 6. Math.round(x)
> Rounds to the *nearest* whole number.  
(*.5 and higher rounds up*)

Example:
```java
System.out.println(Math.round(2.3));  // 2
System.out.println(Math.round(2.7));  // 3
System.out.println(Math.round(2.5));  // 3
```

### Exercise:
Create a `double` variable with value `9.6`.  
Print the rounded value.

---

## 7. Bonus Combo Exercise
> Use all the methods in one little challenge.

---

### Challenge: Temperature Converter
> You measured a weird temperature fluctuation:
```java
double morningTemp = -3.7;
double afternoonTemp = 12.4;
```

Tasks:
- Print the absolute difference between both temperatures.  
- Print the highest temperature.  
- Print the lowest temperature.  
- Round the afternoon temperature.  
- Floor the morning temperature.  

---

# Bonus: Let's level it up!  


### 1. Rounding Money Challenge

You have:
```java
double price = 10.876;
```

Tasks:
- Round `price` to 2 decimal places.
- Print it like this:
```
Rounded price: 10.88
```
<details>
<summary>Hints</summary>

> *Hint*: Multiply by 100, round, divide by 100.
</details>

---

### 2. Time Challenge with Ceil

A video is 320 seconds long.

Calculate:
- How many full minutes is that?  
- How many total minutes should you *show* if you round UP (so the viewer always sees enough time)?

Example output:
```
Real minutes: 5
Show as: 6 minutes
```

---

### 3. Rounding Down Money to Nearest 5 Cents

You have a price:
```java
double price = 3.87;
```

Stores round down to nearest 0.05.  
Example:  
- 3.87 → 3.85  
- 3.83 → 3.80  

Task:
- Calculate and print the rounded price.

<details>
<summary>Hints</summary>

> *Hint*: Multiply by 20, floor, divide by 20.</details>


---

### 4. Crazy Casting Output

Look at this and predict the output:

```java
double x = 5.9;
int y = (int)x + 3;
System.out.println(y);
```

Now try with:
```java
int z = (int)(x + 3);
System.out.println(z);
```

> What's the difference and why?

---

### 5. Max-Min Battle

You have 3 numbers:
```java
int a = 17;
int b = 42;
int c = 9;
```

Task:
- Print the biggest one without using if or loops.  
- Print the smallest one.

<details>
<summary>Hints</summary>

> *Hint*: Nest Math.max() and Math.min()
</details>

---

### 6. Rounding Total Price Up to Whole Euro

You bought stuff:
```java
double total = 17.23;
```

You want to pay in whole euros (always rounding UP).

Task:
- Calculate and print how much you have to pay.

Example:
```
Pay: 18 euros
```

<details>
<summary>Hints</summary>

> *Hint*: ceil → cast to int.</details>


---

### 7. Casting Overflow Trap

What happens here?
```java
int x = 150;
byte y = (byte)x;
System.out.println(y);
```

- Predict the output before running.
- Why does this happen?

---

### 8. Big Final Boss: Mixed Math

Given:
```java
double start = -12.8;
double end = 7.3;
```

Task:
- Print absolute distance between start and end.  
- Round it UP.  
- Cast to int and print like this:
```
Absolute distance = 20
```

<details>
<summary>Hints</summary>

> *Hint*: abs → ceil → cast.
</details>


---
