package com.solid.examples.isp.after;

import com.solid.examples.isp.after.MachineOptions.Printer;
import com.solid.examples.isp.after.MachineOptions.Scanner;
import com.solid.examples.isp.before.Document;

public class PhotoCopier implements Printer, Scanner {

    @Override
    public void Print(Document d) {

    }

    @Override
    public void Scan(Document d) {

    }
}
