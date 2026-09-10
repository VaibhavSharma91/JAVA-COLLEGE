import java.util.Scanner;
import java.util.InputMismatchException;

public class CASESTUDY12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the number of subjects: ");
            int totalSubjects = scanner.nextInt();

            // 1. Check for Division by Zero condition
            if (totalSubjects == 0) {
                System.out.println("Error: Cannot calculate average for 0 subjects (Division by Zero).");
                return;
            } else if (totalSubjects < 0) {
                System.out.println("Error: Number of subjects cannot be negative.");
                return;
            }

            double totalMarks = 0;

            for (int i = 1; i <= totalSubjects; i++) {
                System.out.print("Enter marks for subject " + i + ": ");
                double marks = scanner.nextDouble();

                // 2. Check for Marks Outside the Range 0–100
                if (marks < 0 || marks > 100) {
                    System.out.println("Error: Marks must be between 0 and 100. Restart the program.");
                    return;
                }
                totalMarks += marks;
            }

            // Successful Calculation
            double average = totalMarks / totalSubjects;
            System.out.printf("Total Marks: %.2f%n", totalMarks);
            System.out.printf("Average Marks: %.2f%n", average);

        } catch (InputMismatchException e) {
            // 3. Check for Invalid Input (letters/symbols)
            System.out.println("Error: Invalid input. Please enter numbers only.");
        } finally {
            scanner.close();
        }
    }
}
