package com.solid.examples.dip.after;

import com.solid.examples.dip.Person;
import java.util.List;

public interface RelationShipBrowser {
    List<Person> findAllChildOf(String name);
}
