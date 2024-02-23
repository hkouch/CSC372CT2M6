import java.util.ArrayList;
import java.util.Comparator;

public class MergeSort {
    // Comparator class for comparing Student objects based on roll number
    static class StudentComparator implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            return Integer.compare(s1.getRollno(), s2.getRollno());
        }
    }

    // Merge sort implementation for sorting ArrayList of Student objects
    public static void mergeSort(ArrayList<Student> students, Comparator<Student> comparator) {
        int size = students.size();
        if (size < 2) {
            return;
        }

        // Split the array into two halves
        int mid = size / 2;
        ArrayList<Student> left = new ArrayList<>(students.subList(0, mid));
        ArrayList<Student> right = new ArrayList<>(students.subList(mid, size));

        // Recursively sort each half
        mergeSort(left, comparator);
        mergeSort(right, comparator);

        // Merge the sorted halves
        merge(students, left, right, comparator);
    }

    private static void merge(ArrayList<Student> students, ArrayList<Student> left,
                              ArrayList<Student> right, Comparator<Student> comparator) {
        int leftSize = left.size();
        int rightSize = right.size();
        int i = 0, j = 0, k = 0;

        // Compare and merge elements from left and right
        while (i < leftSize && j < rightSize) {
            if (comparator.compare(left.get(i), right.get(j)) <= 0) {
                students.set(k++, left.get(i++));
            } else {
                students.set(k++, right.get(j++));
            }
        }

        // Copy remaining elements from left (if any)
        while (i < leftSize) {
            students.set(k++, left.get(i++));
        }

        // Copy remaining elements from right (if any)
        while (j < rightSize) {
            students.set(k++, right.get(j++));
        }
    }
}