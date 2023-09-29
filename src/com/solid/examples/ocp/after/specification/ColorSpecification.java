package com.solid.examples.ocp.after.specification;

import com.solid.examples.ocp.after.properties.Color;
import com.solid.examples.ocp.after.Product;

public class ColorSpecification implements Specification<Product> {
    private final Color color;

    public ColorSpecification(Color color){
        this.color = color;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.color == color;
    }
}
