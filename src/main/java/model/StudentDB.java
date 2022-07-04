package model;

import java.util.Arrays;

public class StudentDB {
    Student[] students;

    public StudentDB(Student[] db) {
        students = db;
    }

    public Student[] getAllStudents() {
        return students;
    }


    @Override
    public String toString() {
        return "students=" + Arrays.toString(students);
    }

    public Student randomStudent() {
        int a = (int) (Math.random() * students.length);
        return students[a];
    }


}

