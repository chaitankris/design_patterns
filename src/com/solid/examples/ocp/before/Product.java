package com.solid.examples.ocp.before;

import com.solid.examples.ocp.before.properties.Color;
import com.solid.examples.ocp.before.properties.Size;
import java.util.List;

public class Product {
    public String name;
    public Color color;
    public Size size;

    public Product(String name, Color color, Size size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.HUGE);

        List<Product> productList = List.of(apple, tree, house);

        ProductFilter pf = new ProductFilter();
        System.out.println("Green Products :");
        pf.filterByColor(productList, Color.GREEN).forEach(product -> System.out.println("- " + product.name + " is green" ));
    }
}
