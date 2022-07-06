import model.BiologyStudent;
import model.ITStudent;
import model.Student;
import model.StudentDB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {


    public static void main(String[] args) {

        HashMap<Integer, Student> students = new HashMap<>();

        ITStudent student1 = new ITStudent("Felix", 0, "Java");
        ITStudent student2 =  new ITStudent("Anna", 1, "C");
        ITStudent student3 = new ITStudent("Mari", 2, "Ruby");
        ITStudent student4 =new ITStudent("Martin", 3, "php");

        students.put(student1.getId(),student1);
        students.put(student2.getId(),student2);
        students.put(student3.getId(),student3);
        students.put(student4.getId(),student4);

        StudentDB studentDB = new StudentDB(students);

        System.out.println(studentDB);

        String allStudents = String.valueOf(studentDB.getAllStudents());
        System.out.println(allStudents);

        for (int i = 0; i < 5; i++) {
            System.out.println(studentDB.randomStudent());
        }
        ITStudent itStudent = new ITStudent("Mark", 4, "Java");
        System.out.println(itStudent);


        ITStudent itStudent2 = new ITStudent("Ida", 5, "C");
        itStudent2.setAddress("Schillerplatz");
        itStudent2.setIdentityCardNumber(19282828);

        System.out.println(itStudent2);
        System.out.println(itStudent2.getAddress());
        System.out.println(itStudent2.getIdentityCardNumber());

        BiologyStudent biologyStudent = new BiologyStudent("Berta", 332);
        System.out.println(biologyStudent.getAddress());
        System.out.println(biologyStudent.getIdentityCardNumber());
    }
}
