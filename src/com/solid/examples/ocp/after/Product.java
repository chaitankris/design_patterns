package com.solid.examples.ocp.after;

import com.solid.examples.ocp.after.filter.BetterFilter;
import com.solid.examples.ocp.after.properties.Color;
import com.solid.examples.ocp.after.properties.Size;
import com.solid.examples.ocp.after.specification.AndSpecification;
import com.solid.examples.ocp.after.specification.ColorSpecification;
import com.solid.examples.ocp.after.specification.SizeSpecification;
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
        Product suzuki = new Product("Suzuki", Color.GREEN, Size.SMALL);
        Product benz = new Product("Benz", Color.BLUE, Size.MEDIUM);
        Product ferrari = new Product("Ferrari", Color.RED, Size.LARGE);

        List<Product> productList = List.of(suzuki, benz, ferrari);
        BetterFilter bf = new BetterFilter();
        System.out.println("Green Products :");
        bf.filter(productList, new ColorSpecification(Color.GREEN) ).forEach(product -> System.out.println("- " + product.name + " is green" ));

        System.out.println("RED & Huge Products: ");
        bf.filter(productList, new AndSpecification<>(new ColorSpecification(Color.RED), new SizeSpecification(Size.LARGE)))
                .forEach(product -> System.out.println("- " + product.name + " is red & large"));
    }
}