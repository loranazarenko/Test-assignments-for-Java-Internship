package com.intern.task3;

import java.util.Objects;

/**
 * Class responsible for the subjects that are taught at the university
 */
public class Subject extends Academy {

    // A Constructor
    public Subject(String name) {
        super(name);
    }

    // Overridden method toString
    @Override
    public String toString() {
        return "Предмет " + getName();
    }

    // Overridden method equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return Objects.equals(getName(), subject.getName());
    }

    // Overridden method hash
    @Override
    public int hashCode() {
        return getName().hashCode() % getName().length();
    }
}
