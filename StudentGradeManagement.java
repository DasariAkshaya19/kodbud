import java.util.Scanner;

public class StudentGradeManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input student details
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        int[] marks = new int[3];
        int total = 0;

        // Input marks for 3 subjects
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        // Calculate average
        double average = total / 3.0;

        // Determine grade
        String grade;

        if (average >= 90) {
            grade = "A";
        } else if (average >= 75) {
            grade = "B";
        } else if (average >= 50) {
            grade = "C";
        } else {
            grade = "Fail";
        }

        // Display report
        System.out.println("\n===== STUDENT REPORT =====");
        System.out.println("Student Name : " + name);

        for (int i = 0; i < 3; i++) {
            System.out.println("Subject " + (i + 1) + " Marks : " + marks[i]);
        }

        System.out.println("Total Marks  : " + total);
        System.out.printf("Average      : %.2f%n", average);
        System.out.println("Grade        : " + grade);

        sc.close();
    }
}