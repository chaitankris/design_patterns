package com.solid.examples.isp.after.MachineOptions;

import com.solid.examples.isp.before.Document;

public interface MultiFunctionDevice extends Printer, Scanner{
    public void Fax(Document d);
}
