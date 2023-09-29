package com.solid.examples.ocp.before;

import com.solid.examples.ocp.before.properties.Color;
import com.solid.examples.ocp.before.properties.Size;
import java.util.List;
import java.util.stream.Stream;

// The problem with this class is whenever a new property is added to product we need to come here &
// add a new filter for that one. which we don't want Ideally.

public class ProductFilter {
    // 1st Requirement filter by Colour
    public Stream<Product> filterByColor(List<Product> productList, Color color){
        return productList.stream().filter(p -> p.color == color);
    }

    // 2nd Requirement filter by Size
    public Stream<Product> filterBySize(List<Product> productList, Size size){
        return productList.stream().filter(p -> p.size== size);
    }

    // 3rd Requirement filter by Color & Size
    public Stream<Product> filterByColorAndSize(List<Product> productList, Color color, Size size){
        return productList.stream().filter(p -> p.size == size && p.color == color);
    }
}
