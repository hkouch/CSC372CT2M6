public class Student {
    // Fields of the Student class
    private int rollno;
    private String name;
    private String address;

    // Constructor to initialize a student object
    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    // Getter methods for accessing the fields
    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public String getAdd() {
        return address;
    }
}