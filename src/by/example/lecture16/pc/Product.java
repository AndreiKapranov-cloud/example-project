package by.example.lecture16.pc;

import java.util.UUID;

public class Product {

    private String name;

    public Product() {
        name = UUID.randomUUID().toString();
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }

}
