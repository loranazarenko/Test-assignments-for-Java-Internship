package com.intern.task3;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * The class responsible for the university object
 */
public class University extends Academy {

    // A set of unique faculties owned by the university
    private final Set<Faculty> faculties = new HashSet<>();
    // A set of subjects taught at the university
    private final Set<Subject> subjects = new HashSet<>();

    // A Constructor
    public University(String name) {
        super(name);
    }

    // Getter for faculty
    public Set<Faculty> getFaculty() {
        return faculties;
    }

    // Setter for faculty
    public void setFaculty(Faculty newFaculty) {
        faculties.add(newFaculty);
    }

    // Getter for subjects
    public Set<Subject> getSubjects() {
        return subjects;
    }

    // Setter for subjects
    public void setSubjects(Subject newSubject) {
        subjects.add(newSubject);
    }

    // Overridden method toString
    @Override
    public String toString() {
        return "Университет " + getName();
    }

    // Overridden method equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof University)) return false;
        University university = (University) o;
        return Objects.equals(getName(), university.getName())
                && Objects.equals(getFaculty(), university.getFaculty())
                && Objects.equals(getSubjects(), university.getSubjects());
    }

    // Overridden method hash
    @Override
    public int hashCode() {
        return getName().hashCode() % getName().length();
    }
}
