package com.solid.examples.lsp.before;

public class Square extends Rectangle{
    public Square(int size) {
        super(size,size);
    }

    @Override
    public void setHeight(int size) {
        super.setHeight(size);
        super.setWidth(size);
    }

    @Override
    public void setWidth(int size) {
        super.setWidth(size);
        super.setHeight(size);
    }
}
