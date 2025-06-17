const listRecipes = document.getElementById("recipes");

function fetchRecipes() {
    fetch("https://dummyjson.com/recipes")
      .then(res => res.json())
      .then(data => data.recipes.forEach(element => {
        const pRecipe = document.createElement("p");
        pRecipe.textContent = element.name + " - " + element.cookTimeMinutes;
        recipes.appendChild(pRecipe);
      }));
}

fetchRecipes();