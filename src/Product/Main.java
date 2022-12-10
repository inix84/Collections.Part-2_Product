package Product;

import Product.*;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        Product chocolatePaste = new Product("Шоколадная паста",150,1);
        Product chocolate = new Product("Шоколад",100,1);
        //Product chocolate2 = new Product("",150,1); //Заполните карточку товара полностью
        Product chocolateBar = new Product("Шоколадный батончик",70,1);
        Product shockTreatment = new Product("Шокопеченье",100,1);
        Product chocolateChips = new Product("Шоколадные чипсы",100,1);
        ProductList productList = new ProductList();
        productList.addProduct(chocolatePaste);
        productList.addProduct(shockTreatment);
        productList.addProduct(chocolateBar);
        productList.addProduct(chocolate);
        //productList.addProduct(chocolate); //Такой продукт уже указан
        productList.addProduct(chocolateChips);
        System.out.println(productList);
        Recipe recipe1 = new Recipe("Шоколадный перебор", 2, Set.of(chocolatePaste, chocolate));
        Recipe recipe2 = new Recipe("Шоколадный переборище", 2, Set.of(chocolatePaste, chocolate));//Есть возможность добавить рецепты с разными названиями, но с одинаковым списком продуктов.
        Recipe recipe3 = new Recipe("Шокобомба", 2, Set.of(shockTreatment,chocolatePaste));
        Recipe recipe4 = new Recipe("Чипсы с шоколадом", 2, Set.of(chocolateChips,chocolate));
        RecipeList recipeList = new RecipeList();
        recipeList.addRecipe(recipe1);
        //recipeList.addRecipe(recipe1); //Уже есть такой рецепт
        recipeList.addRecipe(recipe2);
        recipeList.addRecipe(recipe4);
        recipeList.addRecipe(recipe3);
        System.out.println(recipeList);
    }
}