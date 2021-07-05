package com.intern.task3;

/**
 * Abstract class describing abstraction related to learning
 */
public abstract class Academy {

    // A name
    private String name;

    // Getter for a name
    public String getName() {
        return name;
    }

    // Setter for a name
    public void setName(String name) {
        this.name = name;
    }

    // A Constructor
    public Academy(String name) {
        this.name = name;
    }
}




