package com.solid.examples.ocp.after.specification;

public interface Specification<T> {
    boolean isSatisfied(T item);
}
