package com.intern.task3;

import java.util.Objects;
import java.util.Set;

/**
 * The class responsible for belonging to the Curators
 */
public class Curator extends Person {

    // A set of unique curator's groups
    private final Set<Group> groups;

    // A Constructor
    public Curator(String name, int age, Set<Group> groups) {
        super(name, age);
        this.groups = groups;
    }

    // Getter for groups
    public Set<Group> getGroup() {
        return groups;
    }

    // Setter for groups
    public void setGroup(Group groups) {
        this.groups.add(groups);
    }

    // Overridden method toString
    @Override
    public String toString() {
        return "Куратор " + getName() + " в группе " + getGroup();
    }

    // Overridden method equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Curator)) return false;
        Curator curator = (Curator) o;
        return Objects.equals(getName(), curator.getName())
                && Objects.equals(getGroup(), curator.getGroup());
    }
}