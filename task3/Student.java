package com.intern.task3;

import java.util.Objects;

/**
 * Class responsible for belonging to the Students
 */
public class Student extends Person {

    // A Constructor
    public Student(String name, int age) {
        super(name, age);
    }

    // Overridden method toString
    @Override
    public String toString() {
        return "Студент " + getName();
    }

    // Overridden method equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(getName(), student.getName());
    }

    // Overridden method hash
    @Override
    public int hashCode() {
        return getName().hashCode() % getName().length();
    }
}
