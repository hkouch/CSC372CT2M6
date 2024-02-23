import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create 10 student objects and add them to the ArrayList
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student(5, "John", "132 Main St"));
        studentList.add(new Student(2, "Alice", "456 Oak St"));
        studentList.add(new Student(1, "Eve", "101 Elm Blvd"));
        studentList.add(new Student(7, "Carla", "202 Maple Rd"));
        studentList.add(new Student(10, "Frank", "44 Birch St"));
        studentList.add(new Student(6, "Grace", "57 Walnut St"));
        studentList.add(new Student(9, "Hank", "606 Spruce Rd"));
        studentList.add(new Student(3, "Ivy", "707 Fir Pkwy"));

        // Print the unsorted student list
        System.out.println("Unsorted Student List:");
        for (Student student : studentList)
            System.out.println(student.getRollno() + "\t" + student.getName() + "\t" + student.getAdd());

        // Use merge sort to sort the student list
        MergeSort.mergeSort(studentList, new MergeSort.StudentComparator());

        // Print the sorted student list by Roll Number
        System.out.println("\nSorted Student List:");
        for (Student student : studentList)
            System.out.println(student.getRollno() + "\t" + student.getName() + "\t" + student.getAdd());
    }
}