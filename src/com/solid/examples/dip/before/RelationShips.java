package com.solid.examples.dip.before;

import com.solid.examples.dip.Person;
import com.solid.examples.dip.Triplet;
import java.util.ArrayList;
import java.util.List;

/*
 RelationShips is a Low Level Module
It doesn't have any business logic, as you would say, of its own.
It simply allows you to manipulate the list and that is its single responsibility.
 */
class RelationShips {
    private final List<Triplet<Person, Relation, Person>> relations = new ArrayList<>();

    public List<Triplet<Person, Relation, Person>> getRelations() {
        return relations;
    }

    public void addParentAndChild(Person parent, Person child) {
        relations.add(new Triplet<>(parent, Relation.PARENT, child));
        relations.add(new Triplet<>(child, Relation.CHILD, parent));
    };
}
