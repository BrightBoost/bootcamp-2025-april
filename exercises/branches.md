## 🧪 Git Branching Exercise: *Words of Encouragement*

### ✅ **Goal**

Practice:

* Creating and switching branches (`git branch`, `git switch`)
* Tracking changes (`git status`)
* Merging branches (`git merge`)
  All while writing **motivational messages** in text files!

---

### 🔧 Prerequisites

* Git installed
* Terminal/command line access
* A simple text editor (like Notepad, VS Code, or nano)

---

## 🧭 Step-by-Step Instructions

### 1. **Create a new Git repo**

```bash
mkdir encouragement-lab
cd encouragement-lab
git init
```

---

### 2. **Create your first file and commit it**

1. Open a new file called `main.txt` in your editor:

   ```bash
   code main.txt      # or: notepad main.txt, nano main.txt
   ```

2. Write a short message like:

   ```
   You are doing great!
   ```

3. Save and close the file.

4. Add and commit it:

```bash
git add main.txt
git commit -m "Add main message"
```

---

### 3. **Create and switch to a branch called `sunshine`**

```bash
git branch sunshine
git switch sunshine
```

> ✅ Confirm with:

```bash
git status
```

---

### 4. **Create a sunshine message**

1. Create a file named `sunshine.txt`:

   ```bash
   code sunshine.txt
   ```

2. Type a line like:

   ```
   Shine like the sun today!
   ```

3. Save and close.

4. Add and commit it:

   ```bash
   git add sunshine.txt
   git commit -m "Add sunshine message"
   ```

---

### 5. **Create another branch from `main` called `focus`**

```bash
git switch main
git branch focus
git switch focus
```

> ✅ Check where you are:

```bash
git status
```

---

### 6. **Create a focus message**

1. Create a file named `focus.txt`:

   ```bash
   code focus.txt
   ```

2. Write something like:

   ```
   Stay focused and keep going!
   ```

3. Save and close.

4. Add and commit:

   ```bash
   git add focus.txt
   git commit -m "Add focus message"
   ```

---

### 7. **Merge `sunshine` into `main`**

```bash
git switch main
git merge sunshine
```

> No conflict! Confirm it worked:

```bash
ls
cat sunshine.txt
```

---

### 8. **Merge `focus` into `main`**

```bash
git merge focus
```

> Again, no conflict. All 3 files (`main.txt`, `sunshine.txt`, `focus.txt`) should now be in the main branch.

---

## 🎉 Exercise Complete!

You practiced:

* Creating and switching branches
* Writing meaningful content manually
* Committing and merging without conflicts

---

### 🔄 Bonus: Visualize the branches

```bash
git log --oneline --graph --all
```

