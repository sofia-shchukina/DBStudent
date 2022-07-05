package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    void getAllStudentsTest() {
        ITStudent testStudent = new ITStudent("Derek", 4, "C++");
        ITStudent testStudent2= new ITStudent("David", 32, "java");
        ITStudent [] studentArray = new ITStudent[] {testStudent2, testStudent};
        StudentDB studentDB = new StudentDB(studentArray);

        Student[] actual = studentDB.getAllStudents();
        Student [] expected = new Student [] {testStudent2, testStudent};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    void testToString() {
        ITStudent testStudent = new ITStudent("Derek", 4, "Python");
        ITStudent testStudent2= new ITStudent("David", 32, "R");

        ITStudent [] studentArray = new ITStudent[] {testStudent, testStudent2};
        StudentDB studentDB = new StudentDB(studentArray);

        String result = studentDB.toString();
        Assertions.assertEquals("students=[ITStudent{language='Python', name='Derek', id=4}, ITStudent{language='R', name='David', id=32}]", result);
    }

}