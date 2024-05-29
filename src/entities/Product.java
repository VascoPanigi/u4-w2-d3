package entities;

import enums.Categories;

public class Product {
    long id;
    String name;
    Categories category;
    Double price;

    public Product(long id, String name, Categories category, Double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

}
