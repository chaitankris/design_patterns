package com.solid.examples.srp.after;

import java.io.FileNotFoundException;

public class JournalHandler {
    public static void main(String[] args) throws FileNotFoundException {
        Journal j = new Journal();
        j.addEntry("I cried today");
        j.addEntry("I ate a bug");
        System.out.println(j);

        Persistence p = new Persistence();
        String filename = "src/com/solid/examples/srp/after/journal.txt";
        p.saveToFile(j, filename, true);
    }
}
