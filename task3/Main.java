package com.intern.task3;

public class Main {
    // Main method
    public static void main(String[] args) {
        // Create a University, Faculty, Chair, Group, Student objects
        University newOne = new University("Stanford");

        Faculty facultyMath = new Faculty("Math");
        Faculty facultyInformatica = new Faculty("Informatica");
        newOne.setFaculty(facultyMath);

        Department departmentDifferential = new Department("Chair of Differential Equations");
        facultyMath.setDepartment(departmentDifferential);
        facultyInformatica.setDepartment(departmentDifferential);

        Group newGroup = new Group("Gr01");
        departmentDifferential.setGroup(newGroup);

        Student student = new Student("Mary Stuart", 21);
        newGroup.setStudent(student);
        // Invoke toString of University, Faculty, Chair, Group, Student

        System.out.println(student.toString());
        System.out.println(newGroup.toString());
        System.out.println(departmentDifferential.toString());
        System.out.println(facultyMath.toString());
        System.out.println(newOne.toString());
        System.out.println(facultyMath.equals(facultyInformatica));
    }
}
