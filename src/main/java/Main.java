import model.BiologyStudent;
import model.ITStudent;
import model.Student;
import model.StudentDB;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        ITStudent student1 = new ITStudent("Felix", 1, "Java");
        ITStudent student2 = new ITStudent("Anna", 2, "C");
        ITStudent student3 = new ITStudent("Mari", 3, "Ruby");
        ITStudent student4 = new ITStudent("Martin", 4, "php");


        ITStudent[] studentArray = new ITStudent[4];

        studentArray[0] = student1;
        studentArray[1] = student2;
        studentArray[2] = student3;
        studentArray[3] = student4;

        StudentDB studentDB = new StudentDB(studentArray);

        System.out.println(studentDB);

        String allStudents = Arrays.toString(studentDB.getAllStudents());
        System.out.println(allStudents);

        //for (int i = 0; i < 100; i++) {
        //    System.out.println(studentDB.randomStudent());
        //}
        ITStudent itStudent = new ITStudent("Mark", 31, "Java");
        System.out.println(itStudent);


        ITStudent itStudent2 = new ITStudent("Ida", 105, "C");
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
