import product.Product;
import product.ProductList;
public class Main {
    public static void main(String[] args) {
        Product chocolatePaste = new Product("Шоколадная паста",150,1);
        Product chocolate = new Product("Шоколад",100,1);
        //Product chocolate1 = new Product("Шоколад",100,1);
        //Product chocolate2 = new Product("",150,1);
        Product chocolateBar = new Product("Шоколадный батончик",70,1);
        Product shockTreatment = new Product("Шокопеченье",100,1);
        Product chocolateChips = new Product("Шоколадные чипсы",100,1);
        ProductList productList = new ProductList();
        productList.addProduct(chocolatePaste);
        productList.addProduct(shockTreatment);
        productList.addProduct(chocolateBar);
        productList.addProduct(chocolate);
        //productList.addProduct(сhocolate1);
        productList.addProduct(chocolateChips);
        System.out.println(productList);
    }

}