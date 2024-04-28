import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(101, "John", "123 Main St",4));
        students.add(new Student(102, "Alice", "456 Elm St",5));
        students.add(new Student(103, "Bob", "789 Oak St",3));
        students.add(new Student(104, "David", "321 Pine St",5));
        students.add(new Student(105, "Eva", "654 Maple St",3));
        students.add(new Student(106, "Frank", "987 Cedar St",5));
        students.add(new Student(107, "Grace", "135 Birch St",5));
        students.add(new Student(108, "Henry", "246 Walnut St",5));
        students.add(new Student(109, "Ivy", "369 Cherry St",3));
        students.add(new Student(110, "Jack", "579 Sycamore St",4));

        System.out.println("Original order:");
        printStudents(students);

        selectionSort(students, new NameCompare());
        System.out.println("\nSorted by name:");
        printStudents(students);

        selectionSort(students, new RollNoCompare());
        System.out.println("\nSorted by roll number:");
        printStudents(students);

        selectionSort(students, new NameLengthCompare());
        System.out.println("\nSorted by name length:");
        printStudents(students);
    }
    private static void selectionSort(ArrayList<Student> students, java.util.Comparator<Student> comparator) {
        int n = students.size();
        int minIndex = 0;
        for (int i = 0; i < n; i++) {
            minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (comparator.compare(students.get(j), students.get(minIndex)) < 0) {
                    minIndex = j;
                }

            }
            Student temp = students.get(minIndex);
            students.set(minIndex, students.get(i));
            students.set(i, temp);
        }
    }
    public static void printStudents(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println("Roll No: "+ student.rollno + " Name: "+ student.name + " Address: "+ student.address + "Name length: "+ student.nameLength);
        }
    }
}