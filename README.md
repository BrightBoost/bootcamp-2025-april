# 🧰 Project Name: Markdown Feature Showcase

Welcome to the **Markdown Feature Showcase**! This document demonstrates all common features of GitHub-flavored Markdown.

---

## 📋 Table of Contents

- [Headers](#headers)
- [Text Formatting](#text-formatting)
- [Lists](#lists)
- [Code Examples](#code-examples)
- [Tables](#tables)
- [Links and Anchors](#links-and-anchors)
- [Images](#images)
- [Blockquotes](#blockquotes)
- [Task Lists](#task-lists)
- [Collapsible Sections](#collapsible-sections)
- [Footnotes](#footnotes)

---
## 🔠 Headers

```markdown
# H1
## H2
### H3
#### H4
##### H5
###### H6
```

---
## Text Formatting

- **Bold** → `**Bold**`
- *Italic* → `*Italic*`
- ***Bold & Italic*** → `***Bold & Italic***`
- ~~Strikethrough~~ → `~~Strikethrough~~`
- <sub>Subscript</sub>, <sup>Superscript</sup>

---

## Lists

### Unordered

- Item 1
  - Subitem 1.1
    - Subitem 1.1.1
- Item 2

### Ordered

1. First
2. Second
   1. Sub-second
3. Third

---

## Code Examples

### Inline Code

Use the `print()` function to display output.

### Code Block (No Syntax Highlighting)

<pre>
```
def greet(name):
    return f"Hello, {name}"
```
</pre>

### Syntax Highlighting

```python
def greet(name):
    print(f"Hello, {name}!")
```

```javascript
function greet(name) {
  console.log(`Hello, ${name}!`);
}
```

---

## Tables

| Feature       | Supported | Notes                |
|---------------|-----------|----------------------|
| Headers       | ✅        | Six levels           |
| Lists         | ✅        | Ordered & unordered  |
| Code blocks   | ✅        | Syntax highlighting  |
| Collapsibles  | ✅        | HTML-only            |

---

## Links and Anchors

### External Link

[Visit OpenAI](https://www.openai.com)

### Email

[Email me](mailto:someone@example.com)

### Anchor Link

Jump to [Tables](#tables)

---

## Images

```markdown
![Cat](images/kitten1.jpeg)
```

![Cat](images/kitten1.jpeg)

---

## Blockquotes

> This is a blockquote.
> 
> > Nested quote!

---

## Task Lists

- [x] Write README
- [x] Push to GitHub
- [ ] Get feedback
- [ ] Celebrate 🎉

---

## Collapsible Sections

<details>
  <summary>Click to expand section</summary>

  ### This is a hidden section

  You can put **anything** here:

  - Code blocks
  - Images
  - More Markdown
  - Even nested collapsibles!

</details>

---

## Footnotes

This sentence has a footnote.[^1]

[^1]: This is the footnote content.

---
```

---
