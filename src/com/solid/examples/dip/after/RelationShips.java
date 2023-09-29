package com.solid.examples.dip.after;

import com.solid.examples.dip.Person;
import com.solid.examples.dip.before.Relation;
import com.solid.examples.dip.Triplet;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


class RelationShips implements RelationShipBrowser {
    private final List<Triplet<Person, Relation, Person>> relations = new ArrayList<>();

    public List<Triplet<Person, Relation, Person>> getRelations() {
        return relations;
    }

    public void addParentAndChild(Person parent, Person child) {
        relations.add(new Triplet<>(parent, Relation.PARENT, child));
        relations.add(new Triplet<>(child, Relation.CHILD, parent));
    };

    @Override
    public List<Person> findAllChildOf(String name) {
        return relations.stream()
                .filter(x -> Objects.equals(x.getFirst().name, name) && x.getSecond() == Relation.PARENT)
                .map(Triplet::getThird)
                .collect(Collectors.toList());
    }
}
