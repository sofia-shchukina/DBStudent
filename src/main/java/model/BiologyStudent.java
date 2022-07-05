package model;

public class BiologyStudent extends Student implements Citizen{

    public BiologyStudent(String name, int id) {
        super(name, id);
    }

    @Override
    public void printStudent(Student student) {
        System.out.println(name);
    }

    public String getAddress(){

        return "address";
    }

    public int getIdentityCardNumber() {

        return 1234;
    }
}
