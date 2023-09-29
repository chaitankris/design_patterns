package com.solid.examples.isp.after;

import com.solid.examples.isp.after.MachineOptions.MultiFunctionDevice;
import com.solid.examples.isp.after.MachineOptions.Printer;
import com.solid.examples.isp.after.MachineOptions.Scanner;
import com.solid.examples.isp.before.Document;

public class MultiFunctionMachine implements MultiFunctionDevice {
    // compose this out of several modules
    private final Printer printer;
    private final Scanner scanner;

    public MultiFunctionMachine(Printer printer, Scanner scanner)
    {
        this.printer = printer;
        this.scanner = scanner;
    }
    @Override
    public void Print(Document d)
    {
        printer.Print(d);
    }

    @Override
    public void Scan(Document d)
    {
        scanner.Scan(d);
    }

    @Override
    public void Fax(Document d){
        // Fax
    }
}
