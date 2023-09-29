package com.solid.examples.ocp.after.filter;

import com.solid.examples.ocp.after.specification.Specification;
import java.util.List;
import java.util.stream.Stream;

public interface Filter<T> {
    Stream<T> filter(List<T> items, Specification<T> spec);
}
