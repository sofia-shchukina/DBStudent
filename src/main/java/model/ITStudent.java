package model;

public class ITStudent extends Student{
    String language;

    public ITStudent(String name, int id, String language) {
        super(name, id);
        this.language = language;
    }

    @Override
    public String toString() {
        return "ITStudent{" +
                "language='" + language + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
