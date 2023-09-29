package com.solid.examples.isp;

public class Document {
    int pages;
    int copies;
    String orientation;
    String pageSize;

    public Document(int pages, int copies, String orientation, String pageSize) {
        this.pages = pages;
        this.copies = copies;
        this.orientation = orientation;
        this.pageSize = pageSize;
    }
}
