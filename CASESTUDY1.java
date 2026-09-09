import java.util.Scanner;
public class CASESTUDY1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter marks in Subject 1: ");
        int m1 = sc.nextInt();
        System.out.print("Enter marks in Subject 2: ");
        int m2 = sc.nextInt();
        System.out.print("Enter marks in Subject 3: ");
        int m3 = sc.nextInt();
        System.out.print("Enter marks in Subject 4: ");
        int m4 = sc.nextInt();
        System.out.print("Enter marks in Subject 5: ");
        int m5 = sc.nextInt();
        int total = m1 + m2 + m3 + m4 + m5;
        double percentage = total / 5.0;
        String grade;
        if (percentage >= 90)
            grade = "A+";
        else if (percentage >= 80)
            grade = "A";
        else if (percentage >= 70)
            grade = "B";
        else if (percentage >= 60)
            grade = "C";
        else if (percentage >= 50)
            grade = "D";
        else
            grade = "F";
        System.out.println("\n----- Student Result -----");
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total + "/500");
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        if (percentage >= 50)
            System.out.println("Result: PASS");
        else
            System.out.println("Result: FAIL");
        sc.close();
    }
}