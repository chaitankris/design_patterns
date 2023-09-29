package com.solid.examples.isp.before;

// An old-fashioned Printer only prints a document
// Here the problem is we are trying to implement the machine which was poorly design without know how of
// what can be of their child classed look like.

public class OldFashionedPrinter implements Machine{
    @Override
    public void print(Document d) {

    }

    @Override
    public void scan(Document d) throws Exception {
        // Here we are forced to throw an exception because we don't support scan
        // & also this caused to add an exception on to the main interface too which is not ideal.
       throw new Exception();
    }

    @Override
    public void fax(Document d) throws Exception {
        // Here we are forced to throw an exception because we don't support fax
        // & also this caused to add an exception on to the main interface too which is not ideal.
        throw new Exception();
    }
}