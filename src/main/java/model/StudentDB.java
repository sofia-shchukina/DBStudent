package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class StudentDB {
    HashMap<Integer, Student> students;

    public StudentDB(HashMap<Integer, Student>db) {
        students = db;
    }

    public HashMap<Integer, Student> getAllStudents() {
        return students;
    }


    @Override
    public String toString() {
        return
                "students=" + students +
                '}';
    }

    public Student randomStudent() {
        int a = (int) (Math.random() * students.size());
        return students.get(a);
    }

}

