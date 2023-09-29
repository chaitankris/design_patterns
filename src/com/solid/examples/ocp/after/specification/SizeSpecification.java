package com.solid.examples.ocp.after.specification;

import com.solid.examples.ocp.after.Product;
import com.solid.examples.ocp.after.properties.Size;

public class SizeSpecification implements Specification<Product> {
    public final Size size;

    public SizeSpecification(Size size){
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.size == size;
    }
}
