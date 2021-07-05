package com.intern.task3;

/**
 * An abstract class that is responsible for belonging to a person
 */
public abstract class Person {
    // A name
    private String name;
    // An age
    private int age;

    // A Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for a name
    public String getName() {
        return name;
    }

    // Setter for a name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for an age
    public int getAge() {
        return age;
    }

    // Setter for an age
    public void setAge(int age) {
        this.age = age;
    }
}