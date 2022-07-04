package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    void getAllStudentsTest() {
        Student testStudent = new Student("Derek", 4);
        Student testStudent2= new Student("David", 32);
        Student [] studentArray = new Student[] {testStudent2, testStudent};
        StudentDB studentDB = new StudentDB(studentArray);

        Student[] result = studentDB.getAllStudents();
        Student [] actual = new Student [] {testStudent2, testStudent};
        Assertions.assertEquals(Arrays.toString(actual), Arrays.toString(result));

    }

    @Test
    void testToString() {
        Student testStudent = new Student("Derek", 4);

        Student [] studentArray = new Student[] {testStudent};
        StudentDB studentDB = new StudentDB(studentArray);

        String result = studentDB.toString();
        Assertions.assertEquals("students=[name = Derek id =4]", result);
    }

    @Test
    void randomStudent() {
    }
}