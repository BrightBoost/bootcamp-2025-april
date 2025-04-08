**🧪 GIT IT: Your First Website with Git (Step-by-Step Exercise)**  
*Just follow the steps. No thinking required. You got this. Or rather… you'll **git** it! 💪*

---

**Step 1: Create a project folder**  
Open your terminal and type:

```bash
mkdir git-it-website
cd git-it-website
```

Nice! You’ve just made a folder and gone into it. You’re already a pro. 🐣

---

**Step 2: Create two HTML files**

```bash
touch index.html about.html
```

Boom. Two files created. Let’s make them come to life. ⚡

---

**Step 3: Open the folder in VS Code**

```bash
code .
```

This will open VS Code in your current folder. Let’s write some HTML!

---

**Step 4: Add content to `index.html`**

Paste this into `index.html`:

```html
<!DOCTYPE html>
<html>
<head>
  <title>Git It!</title>
</head>
<body>
  <h1>Welcome to the Git It Website!</h1>
  <p>You’re doing amazing. One step at a time. Just git it and go! 💥</p>
  <a href="about.html">Read more encouragement →</a>
</body>
</html>
```

---

**Step 5: Add content to `about.html`**

Paste this into `about.html`:

```html
<!DOCTYPE html>
<html>
<head>
  <title>More Encouragement</title>
</head>
<body>
  <h1>Still here? Awesome. 🔥</h1>
  <p>Even when it's hard, you're learning something new. Keep going. Git is your friend. 🐱‍💻</p>
  <a href="index.html">← Back to home</a>
</body>
</html>
```

---

**Step 6: See your website!**  
Right-click `index.html` in VS Code and open it in the browser.

🎉 There it is! A tiny website with heart.

---

**Step 7: Initialize a Git repository**

In your terminal (inside the `git-it-website` folder), run:

```bash
git init
```

You’ve started a Git repo. It’s like your project got a memory. 🧠

---

**Step 8: Check what Git sees**

```bash
git status
```

You’ll see the files are untracked. Let's change that.

---

**Step 9: Add the files**

```bash
git add .
```

This adds all files to be tracked.

---

**Step 10: Make your first commit**

```bash
git commit -m "Initial commit: add two HTML pages with encouragement"
```

👏 You just committed your first changes! You're officially a Git user now.

---

**Step 11: Check Git status again**

```bash
git status
```

Should say: "nothing to commit, working tree clean" – Git is happy. 😌

---

**Step 12: Look at your Git history**

```bash
git log
```

Press `q` to exit the log view when you're done looking.

---

**Step 13: Make a change and commit again**

Open `index.html` and add a line below the paragraph:

```html
<p>You're doing better than you think. 🌈</p>
```

Then save the file and run:

```bash
git add index.html
git commit -m "Add extra encouragement to home page"
```

---

**Step 14: Look at the log again**

```bash
git log
```

Now you’ll see both commits. You’ve got a timeline. Like a time machine! 🕒

---

**Step 15: Checkout an older version**

Copy the **first commit hash** (the long code from the log). Then type:

```bash
git checkout <paste-commit-hash-here>
```

Look at `index.html` again… (possibly refresh the page) the new line is gone. You’ve gone back in time. 🌀

---

**Step 16: Go back to the latest version**

```bash
git checkout main
```

(If your branch is called `master`, use `master` instead.)

You’re back in the present, and your edits have returned. Welcome back, traveler! 🧳

---

🎉 **YOU DID IT. YOU GIT IT.** 🎉  
Every pro started with these steps. Keep playing, keep exploring, and remember:  
**Version control should be... peace of mind.** 🧘‍♀️

