import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;


public class Driver_Student {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();

        students.add(new Student(1, "JJ. Jognson", 38));
        students.add(new Student(2, "P. Tibbs", 48));
        students.add(new Student(3, "W. Major", 28));
        students.add(new Student(4, "P. Turner", 60));
        students.add(new Student(5, "A. Ball", 20));
        students.add(new Student(6, "B. Smithy", 90));
        students.add(new Student(7, "R. Jules", 71));
        students.add(new Student(8, "T. Verne", 97));


        // create your Stream solutions here
        // Task 1: Print all students using forEach()
        System.out.println("All students:");
        students.stream()
                .forEach(System.out::println);

        // Task 2: Filter students with grades > 70% and print
        System.out.println("\nStudents with grades > 70:");
        students.stream()
                .filter(student -> student.getGrade() > 70)
                .forEach(System.out::println);

        // Task 3: Map to uppercase names, sort alphabetically, collect to array, and print
        System.out.println("\nUppercase student names sorted alphabetically:");
        Object[] studentArray = students.stream()
                .map(student -> student.getName().toUpperCase())
                .sorted()
                .toArray();
        System.out.println(String.join(", ", (CharSequence[]) studentArray));


        // Task 4: Calculate the average grade
        System.out.println("\nAverage grade of all students:");
        double averageGrade = students.stream()
                .mapToDouble(Student::getGrade)
                .average()
                .orElse(0.0);
        System.out.println("Average grade: " + averageGrade);

        System.out.println("Cubed values of integers from 90 to 100:");
        IntStream.range(90, 101) // Generate integers from 90 to 100 (inclusive)
                .map(n -> n * n * n) // Map each integer to its cube
                .forEach(System.out::println); // Print each cubed value

        // Task 2: Generate random integers between 1 and 5 using Stream.generate()
        System.out.println("\n10 random integers between 1 and 5:");
        List<Integer> numList = Stream.generate(() -> (int) (Math.random() * 5 + 1)) // Generate random numbers (1 to 5)
                .limit(10) // Limit to 10 values
                .collect(Collectors.toList()); // Collect values into a List

        // Display the list using a traditional for loop
        for (int next : numList) {
            System.out.println("Next value is: " + next);
        }

        // Task 3: Add distinct() to remove duplicates from the random number list
        System.out.println("\nDistinct random integers between 1 and 5:");
        List<Integer> distinctNumList = Stream.generate(() -> (int) (Math.random() * 5 + 1)) // Generate random numbers (1 to 5)
                .limit(10) // Limit to 10 values
                .distinct() // Remove duplicates
                .collect(Collectors.toList()); // Collect values into a List

        // Display the distinct list using a traditional for loop
        for (int next : distinctNumList) {
            System.out.println("Next distinct value is: " + next);
        }
    }
}
