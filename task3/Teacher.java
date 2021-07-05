package com.intern.task3;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Class responsible for belonging to the Teachers
 */
public class Teacher extends Person {
    // The subject he teaches
    private final Set<Subject> subjects = new HashSet<>();
    // The rank
    private String title;

    // A Constructor
    public Teacher(String name, int age, String title, Subject newSubject) {
        super(name, age);
        this.title = title;
        subjects.add(newSubject);
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for Subjects
    public Set<Subject> getSubject() {
        return subjects;
    }

    // Setter for Subjects
    public void setSubject(Subject newSubject) {
        subjects.add(newSubject);
    }

    // Overridden method toString
    @Override
    public String toString() {
        return "Учитель " + getName() + " имеет ученую степень " + getTitle() + " и преподает " + getSubject();
    }

    // Overridden method equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teacher)) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(getName(), teacher.getName())
                && Objects.equals(getSubject(), teacher.getSubject())
                && Objects.equals(getTitle(), teacher.getTitle());
    }
}
