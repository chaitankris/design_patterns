package com.solid.examples.isp.before;

/*

So the takeaway from the interface segregation principle is that instead of sticking everything into
a single interface like we did for the machine interface, what you should do is you should put the
absolute minimum amount of code into an interface so that at no point does a client and by client

I mean a developer has to actually implement the interface.
At no point do they have to implement a certain methods which they don't need at all.

*/

import com.solid.examples.isp.Document;

public interface Machine {
    void print(Document d);
    void scan(Document d) throws Exception;
    void fax(Document d) throws Exception;
}

// TODO See the after in this case is to use Interface segregation Principle

