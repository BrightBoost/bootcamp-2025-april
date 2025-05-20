### 💡 1. **Interface Mashup Madness**

**Goal**: Students explore how interfaces can be combined—and how default methods can create ambiguity.

**Prompt**:

```java
interface Singer {
    default String perform() { return "La la la!"; }
}

interface Dancer {
    default String perform() { return "*jazz hands*"; }
}

class PopStar implements Singer, Dancer {
    // What happens here?
}

public class Stage {
    public static void main(String[] args) {
        PopStar star = new PopStar();
        System.out.println(star.perform());
    }
}
```

**Challenge**:
Fix the `PopStar` class to compile and decide which `perform()` to use—or create your own.

---


### 🧠 2. **Interface Whisperer**

**Goal**: Strengthen design thinking.

**Prompt**:
You're interviewing a job applicant (the student next to you). Ask them questions about their skills and hobbies, and then design an interface for them (e.g., `interface FluentInDutch`, `interface CanMakeReallyGoodPasta`, etc.).

**Bonus**: Then create a `class Person implements` all those interfaces and write a method that shows off what this "class" can do.

---

### 🕹 3. **Interface Pokémon Battle**

**Goal**: Think of interfaces as capabilities/traits.

**Prompt**:
You're designing a battle system like Pokémon. You have interfaces like:

```java
interface FireAttack { void fire(); }
interface WaterAttack { void splash(); }
interface Fly { void fly(); }
```

Create at least 3 "monsters" (Java classes) that implement combinations of these interfaces. Have them "battle" with each other using only their interface methods.

---

### 🧩 4. **Interface Puzzle – Who’s Talking?**

**Goal**: Spot and fix logical errors with interfaces and polymorphism.

**Prompt**:

```java
interface Speaker {
    String speak();
}

class Dog implements Speaker {
    public String speak() { return "Woof!"; }
}

class Cat implements Speaker {
    public String speak() { return "Meow!"; }
}

class Parrot implements Speaker {
    public String speak() { return speak(); } // Uh-oh
}
```

**Challenge**:
What happens with `Parrot`? Fix it so the parrot mimics another `Speaker`. Bonus: Create a parrot that randomly mimics one of the others.

---

### 🧃 6. **Mixin Smoothie**

**Goal**: Experiment with mixing capabilities using interfaces only.

**Prompt**:
Design a `Smoothie` builder using only interfaces like `HasBanana`, `HasStrawberry`, `HasProtein`, etc.

Then make a few smoothies by combining different interfaces. Discuss: When do you prefer interfaces over inheritance?

---


## 🌐 **Mini Project: Build Your Own Modular Smart Home System**

### 🏠 Project Overview

You're building a **modular smart home system** using Java interfaces. Each smart device supports different capabilities (e.g., turning on/off, adjusting temperature, playing music). Devices can be combined into rooms, and rooms can be controlled as groups.

The twist? Each capability is defined via **interfaces**, and the design must support **pluggable, extensible** behaviors using **interface composition, default methods**, and **functional interfaces** for event handling.

---

### 💡 Step 1: Define Your Interfaces

Start by designing interfaces for common capabilities:

```java
interface Switchable {
    void turnOn();
    void turnOff();
}

interface AdjustableTemperature {
    void setTemperature(int degrees);
    int getTemperature();
}

interface Playable {
    void play(String song);
}
```

Add more if you like: `ColorChangable`, `VolumeAdjustable`, `Speakable`, `SensorTriggered`, etc.

---

### 🧱 Step 2: Implement Some Devices

Each device implements one or more interfaces.

Examples:

```java
class SmartLight implements Switchable {
    private boolean isOn = false;
    public void turnOn() { isOn = true; System.out.println("Light on."); }
    public void turnOff() { isOn = false; System.out.println("Light off."); }
}
```

Make:

* A `SmartThermostat` (AdjustableTemperature)
* A `SmartSpeaker` (Switchable + Playable)
* A `SmartFan` (Switchable + AdjustableTemperature)

---

### 🧠 Step 3: Add Default Behaviors

Enhance interfaces with default methods.

Example:

```java
interface Switchable {
    void turnOn();
    void turnOff();

    default void toggle() {
        System.out.println("Toggling device...");
        turnOff(); // pretend it's on
        turnOn();
    }
}
```

Now all switchables can toggle, unless overridden.

---

### 🕹 Step 4: Add Functional Interfaces for Events

Create a functional interface for events like motion detection:

```java
@FunctionalInterface
interface MotionDetectedListener {
    void onMotion();
}
```

Allow devices or rooms to register motion listeners and react accordingly.

---

### 🛋 Step 5: Group Devices in a Room

```java
class Room {
    private String name;
    private List<Switchable> switchables = new ArrayList<>();

    public Room(String name) {
        this.name = name;
    }

    public void addDevice(Switchable s) {
        switchables.add(s);
    }

    public void allOn() {
        switchables.forEach(Switchable::turnOn);
    }

    public void allOff() {
        switchables.forEach(Switchable::turnOff);
    }
}
```

Optional: Make Room implement `Switchable` itself so rooms can be nested!

---

### 🧪 Step 6: Test Drive

Write a small main method that creates:

* 3 smart devices
* 1 room
* Some functional interface event listeners
* A small “automation” routine like:

```java
System.out.println("Evening mode activated...");
livingRoom.allOn();
thermostat.setTemperature(21);
speaker.play("Chill playlist");
```

---

### 🌟 Bonus Challenges

* 🔁 Make a `Scene` class to group actions together.
* 🧠 Add an interface `SmartDeviceInfo` with a `describe()` method returning a summary string.
* ⚡ Simulate real-time behavior using `ScheduledExecutorService` or event triggers.


