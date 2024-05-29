import entities.Product;
import enums.Categories;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

//        --------------------------------ex 1---------------------------
        Random random = new Random();
        Supplier<Double> randomPriceSupplier = () -> random.nextDouble(1, 300);
        List<Product> productList = getProducts(random, randomPriceSupplier);

        System.out.println(productList);


//        --------------------------------ex 2---------------------------


    }

    //        --------------------------------ex 1 method---------------------------

    private static List<Product> getProducts(Random random, Supplier<Double> randomPriceSupplier) {
        Supplier<Long> randomIdSupplier = () -> random.nextLong(10000, 20000);

        List<Product> productList = new ArrayList<>();

        Supplier<Product> productSupplier = () -> new Product(randomIdSupplier.get(), "Hello, I'm a book :D", Categories.BOOKS, randomPriceSupplier.get());

        for (int i = 0; i < 100; i++) {
            Product newProduct = productSupplier.get();
            if (newProduct.getPrice() < 100) {
                productList.add(newProduct);
            }
        }
        return productList;
    }
}