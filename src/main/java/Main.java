import model.ITStudent;
import model.Student;
import model.StudentDB;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        Student student1 = new Student("Felix", 1);
        Student student2 = new Student("Anna", 2);
        Student student3 = new Student("Mari", 3);
        Student student4 = new Student("Martin", 4);


        Student[] studentArray = new Student[4];

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

        //ITStudent itStudent1 = (ITStudent) new Student("Noah", 25);
        Student itStudent2 = new ITStudent("Ida", 105, "C");
        //System.out.println(itStudent1);
        System.out.println(itStudent2);
    }
}
