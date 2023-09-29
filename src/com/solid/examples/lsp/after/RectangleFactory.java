package com.solid.examples.lsp.after;

import com.solid.examples.lsp.before.Rectangle;

public class RectangleFactory {
    public static Rectangle newRectangle(int width, int height){
        return new Rectangle(width,height);
    }
    public static Rectangle newSquare(int side){
        return new Rectangle(side, side);
    }
    // Here we don't require a new Sub Class at all
}
