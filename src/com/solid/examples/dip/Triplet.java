package com.solid.examples.dip;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Triplet<A, B, C> {
    private A first;
    private B second;
    private C third;

    public Triplet(A first, B second, C third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
}
