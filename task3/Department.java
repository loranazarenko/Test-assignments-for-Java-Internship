package com.intern.task3;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Class responsible for the department object
 */
public class Department extends Academy {

    // A set of unique groups owned by the Department
    private final Set<Group> groups = new HashSet<>();

    // A unique set of teachers teaching in the Department
    private final Set<Teacher> teachers = new HashSet<>();

    // A Constructor
    public Department(String name) {
        super(name);
    }

    // Getter for groups
    public Set<Group> getGroup() {
        return groups;
    }

    // Setter for groups
    public void setGroup(Group newChair) {
        groups.add(newChair);
    }

    // Getter for teachers
    public Set<Teacher> getTeacher() {
        return teachers;
    }

    // Setter for teachers
    public void setTeacher(Teacher newTeacher) {
        teachers.add(newTeacher);
    }

    // Overridden method toString
    @Override
    public String toString() {
        return "Кафедра " + getName();
    }

    // Overridden method equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department)) return false;
        Department department = (Department) o;
        return Objects.equals(getName(), department.getName())
                && Objects.equals(getGroup(), department.getGroup())
                && Objects.equals(getTeacher(), department.getTeacher());
    }

    // Overridden method hash
    @Override
    public int hashCode() {
        return getName().hashCode() % getName().length();
    }
}
