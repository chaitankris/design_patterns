package com.solid.examples.dip.after;

import com.solid.examples.dip.Person;
import java.util.List;

public class Research {
    public Research(RelationShipBrowser browser, String name){
      List<Person> childList = browser.findAllChildOf(name);
      for (Person child : childList) {
          System.out.println(name + " has a child called " + child.name);
      }
    }

    public static void main(String[] args) {
        Person parent = new Person("John");
        Person child1 = new Person("Chris");
        Person child2 = new Person("Matt");

        RelationShips relationShips = new RelationShips();
        relationShips.addParentAndChild(parent, child1);
        relationShips.addParentAndChild(parent,child2);

        new Research(relationShips, parent.name);
    }
}
