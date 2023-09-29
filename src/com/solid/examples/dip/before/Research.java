package com.solid.examples.dip.before;

import com.solid.examples.dip.Person;
import com.solid.examples.dip.Triplet;
import java.util.List;

/*
 Research is a High Level Module
Because it allows use to perform some sort of operations on those low level constructs
 */
public class Research {
    /*
    This Constructor is violating the dependency inversion principle.
    The dependency inversion principle states that high level modules should not depend on low level modules,
    but unfortunately that's exactly what we have in this constructor.We have a constructor which takes a
    low level module as a dependency, and this is bad.

    So Instead of this we need to depend on abstractions
     */
    public Research(RelationShips relationShips, String name) {
        List<Triplet<Person, Relation,Person>> realtions = relationShips.getRelations();
        realtions.stream()
                .filter(x -> x.getFirst().name.equals(name) && x.getSecond() == Relation.PARENT)
                .forEach(ch -> System.out.println(name + " has a child "+ ch.getThird().name ));
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
