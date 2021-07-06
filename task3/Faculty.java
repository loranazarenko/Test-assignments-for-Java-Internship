package com.intern.task3;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Faculty class object
 */
public class Faculty extends Academy {

    // A set of unique departments owned by the Faculty
    private final Set<Department> departments = new HashSet<>();

    // A Constructor
    public Faculty(String name) {
        super(name);
    }

    // Getter for department
    public Set<Department> getDepartment() {
        return departments;
    }

    // Setter for department
    public void setDepartment(Department newDepartment) {
        departments.add(newDepartment);
    }

    // Overridden method toString
    @Override
    public String toString() {
        return "Факультет " + getName();
    }

    // Overridden method equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Faculty)) return false;
        Faculty faculty = (Faculty) o;
        return Objects.equals(getName(), faculty.getName())
                && Objects.equals(getDepartment(), faculty.getDepartment());
    }

    // Overridden method hash
    @Override
    public int hashCode() {
        return getName().hashCode() % getName().length();
    }
}