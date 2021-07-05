package com.intern.task3;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * The class responsible for the group object
 */
public class Group extends Academy {

    // A set of unique students
    private final Set<Student> students = new HashSet<>();
    // A set of subjects taught at the group
    private final Set<Subject> subjects = new HashSet<>();
    // A curator of this group
    private Curator curator;
    // The specialization code - group attribute
    private String specializationCode;

    // A Constructor
    public Group(String name) {
        super(name);
    }

    // Getter for students
    public Set<Student> getStudent() {
        return students;
    }

    // Setter for students
    public void setStudent(Student newStudent) {
        students.add(newStudent);
    }

    // Getter for curator
    public Curator getCurator() {
        return curator;
    }

    // Setter for curator
    public void setCurator(Curator curator) {
        this.curator = curator;
    }

    // Getter for subjects
    public Set<Subject> getSubjects() {
        return subjects;
    }

    // Setter for subjects
    public void setSubjects(Subject newSubject) {
        subjects.add(newSubject);
    }

    // Getter for specialization code
    public String getSpecializationCode() {
        return specializationCode;
    }

    // Setter for specialization code
    public void setSpecializationCode(String specializationCode) {
        this.specializationCode = specializationCode;
    }

    // Overridden method toString
    @Override
    public String toString() {
        return "Группа " + getName();
    }

    // Overridden method equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Group)) return false;
        Group group = (Group) o;
        return Objects.equals(getName(), group.getName())
                && Objects.equals(getStudent(), group.getStudent())
                && Objects.equals(getSubjects(), group.getSubjects())
                && Objects.equals(getCurator(), group.getCurator())
                && Objects.equals(getSpecializationCode(), group.getSpecializationCode());
    }

}
