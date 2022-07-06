package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    void getAllStudentsTest() {
        HashMap<Integer, Student> students = new HashMap<>();
        ITStudent student1 = new ITStudent("Felix", 0, "Java");
        ITStudent student2 =  new ITStudent("Anna", 1, "C");
        students.put(student1.getId(),student1);
        students.put(student2.getId(),student2);

        StudentDB studentDB = new StudentDB(students);

        HashMap<Integer, Student> actual = studentDB.getAllStudents();
        HashMap<Integer, Student> expected = students;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void testToString() {
        HashMap<Integer, Student> students = new HashMap<>();
        ITStudent student1 = new ITStudent("Felix", 0, "Java");
        ITStudent student2 =  new ITStudent("Anna", 1, "C");
        students.put(student1.getId(),student1);
        students.put(student2.getId(),student2);

        StudentDB studentDB = new StudentDB(students);

        String result = studentDB.toString();
        Assertions.assertEquals("students={0=ITStudent{language='Java', name='Felix', id=0}, 1=ITStudent{language='C', name='Anna', id=1}}}", result);
    }

}