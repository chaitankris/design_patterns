package com.solid.examples.lsp.before;

public class Demo {
    static void useIt(Rectangle r) {
        int width = r.getWidth();
        r.setHeight(10);
        System.out.println("Expected area of " + (width * 10) + " ,Got " + r.getArea());
    }

    /*
    So the idea of the liskov substitution principle is you should be able to substitute a subclass for a base class.
    So if you have some API which takes a base class, you should be able to stick a subclass in there without things breaking in any way.
     */
    public static void main(String[] args) {
        Rectangle rc = new Rectangle(2, 3);
        // Expected area of 20 ,Got 20
        useIt(rc);

        Rectangle sq = new Square(3);
        //Expected area of 30 ,Got 100
        //Here the problem is for square it violates liskov Substitution Principle
        useIt(sq);
    }
}
