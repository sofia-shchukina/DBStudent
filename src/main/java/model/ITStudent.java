package model;

public class ITStudent extends Student implements Citizen{
    private String language;
    private String address;
    private int identityCardNumber;

    public ITStudent(String name, int id, String language) {
        super(name, id);
        this.language = language;
    }
    public ITStudent(String name, int id) {
        super(name, id);

    }

    @Override
    public String toString() {
        return "ITStudent{" +
                "language='" + language + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
    @Override
    public void printStudent(Student student) {
        System.out.println(name);
    }
    public String getAddress(){

        return address;
    }

    public int getIdentityCardNumber() {

        return identityCardNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setIdentityCardNumber(int identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }
}
