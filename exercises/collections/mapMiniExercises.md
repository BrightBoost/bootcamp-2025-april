## 🧩 **Step-by-Step HashMap Exercises**

---

### 🔹 **1. HashMap with `String` → `String`**

#### 🧠 Concept: Simple key-value mapping  
You're creating a small dictionary of words and their meanings.

#### ✅ Step-by-step:
1. Create a HashMap where the key is a word (String) and the value is its definition (also a String).
2. Add three words and their meanings to the map.
3. Retrieve and print the meaning of one specific word.
4. Replace the meaning of one of the words.
5. Check if a certain word exists in the map.
6. Print all keys (the words).
7. Print all values (the meanings).

---

### 🔹 **2. HashMap with `String` → `Integer`**

#### 🧠 Concept: Storing quantities or numerical values  
You want to store names of people and their ages.

#### ✅ Step-by-step:
1. Create a HashMap where the key is a person's name and the value is their age.
2. Add at least 4 people and their ages.
3. Print the age of one specific person.
4. Increase one person's age by 1.
5. Remove one person from the map.
6. Loop over the map and print: `"Name: [name], Age: [age]"`.

---

### 🔹 **3. HashMap with `String` → `Pet` object**

#### 🧠 Concept: Mapping strings to objects  
You want to keep track of people and their pet.

#### ✅ Step-by-step:
1. Create a class `Pet` with a name and a type (e.g., "dog", "cat").
2. Create a HashMap where the key is the owner's name and the value is their pet (a `Pet` object).
3. Add 3 owners and their pets.
4. Get the pet for a specific owner and print the pet’s name and type.
5. Replace one owner’s pet with a new pet.
6. Loop over all owners and print:  
   `"Owner: [name] → Pet: [pet name] the [pet type]"`.

---

## **💖 From here on it gets tough! Be nice to yourself. You don't need to be able to do the next three exercises yet 💖**

---

### 🔹 **4. HashMap with `String` → `List<Pet>`**

#### 🧠 Concept: One-to-many relationship  
Some people have more than one pet.

#### ✅ Step-by-step:
1. Create a HashMap where the key is a person’s name and the value is a list of `Pet` objects.
2. Add one person with two pets.
3. Add another person with one pet.
4. Retrieve and print all pet names for a specific person.
5. Add a new pet to one person’s list.
6. Remove a pet from someone’s list.
7. Loop over the map and print each person’s name and all their pets' names and types.

---

### 🔹 **5. HashMap with `Person` → `List<Pet>`**

#### 🧠 Concept: Mapping custom objects to lists  
Now you want to store actual `Person` objects (with name + age) as keys.

#### ✅ Step-by-step:
1. Create a `Person` class with name and age.
2. Create a HashMap where the key is a `Person` and the value is a list of `Pet` objects.
3. Add 2 persons and their pets.
4. Retrieve the list of pets for a specific person and print them.
5. Add a new pet to one of the persons.
6. Loop through all entries in the map and print something like:  
   `"Person: [name], Age: [age] has pets: [pet list]"`

---

### 🔹 **6. HashMap with `List<Person>` → `List<Pet>`**

#### 🧠 Concept: Mapping one group to another  
You now want to map a group of people to the pets they jointly own (e.g., roommates).

#### ✅ Step-by-step:
1. Create a list of two `Person` objects to represent a household.
2. Create a list of pets they share.
3. Create a HashMap where the key is a list of `Person` and the value is a list of `Pet`.
4. Add this entry to the map.
5. Retrieve and print the names of all pets shared by the household.
6. Loop through all entries and print:  
   `"Household with: [list of people names] shares pets: [list of pet names]"`

