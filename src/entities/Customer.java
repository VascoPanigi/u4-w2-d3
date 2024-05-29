package entities;

public class Customer {
    long id;
    String name;
    int tier;

    public Customer(long id, int tier, String name) {
        this.id = id;
        this.tier = tier;
        this.name = name;
    }
}
