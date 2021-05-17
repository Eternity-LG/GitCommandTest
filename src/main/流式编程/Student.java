package main.Á÷Ê½±à³Ì;

public class Student {
    private String ID;
    private String name;
    private int age;
    private String classes;

    @Override
    public String toString() {
        return "student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", classes='" + classes + '\'' +
                '}';
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public Student(String ID, String name, int age, String classes) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.classes = classes;
    }
}
