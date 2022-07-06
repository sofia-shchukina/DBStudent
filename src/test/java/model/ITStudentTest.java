package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ITStudentTest {


    @Test
    void getAddress() {
        ITStudent testStudent = new ITStudent("Karl", 45, "pascal");
        testStudent.setAddress("Münsterstraße");

        String result = testStudent.getAddress();
        Assertions.assertEquals("Münsterstraße", result);
    }

    @Test
    void getIdentityCardNumber() {
        ITStudent testStudent = new ITStudent("Karl", 45, "pascal");
        testStudent.setIdentityCardNumber(4356);
        int result = testStudent.getIdentityCardNumber();
        Assertions.assertEquals(4356, result);
    }

    @Test
    void setAddress() {
        ITStudent testStudent = new ITStudent("Karl", 45, "pascal");
        testStudent.setAddress("Münsterstraße");
        String result = testStudent.getAddress();
        Assertions.assertEquals("Münsterstraße", result);
    }

    @Test
    void setIdentityCardNumber() {
        ITStudent testStudent = new ITStudent("Karl", 45, "pascal");
        testStudent.setIdentityCardNumber(4356);
        int result = testStudent.getIdentityCardNumber();
        Assertions.assertEquals(4356, result);
    }
}