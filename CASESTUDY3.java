import java.util.Scanner;

class Employee {
    String Name, EmpID;
    double basicSal, HRA, DA, grossSal;

    Employee(String name, String id, double sal) {
        Name = name;
        EmpID = id;
        basicSal = sal;
    }

    void cal() {
        HRA = basicSal * 0.2;
        DA = basicSal * 0.1;
        grossSal = basicSal + HRA + DA;
        System.out.println("Salary details of " + Name + " (ID: " + EmpID + ") are : ");
        System.out.println("HRA : " + HRA);
        System.out.println("DA : " + DA);
        System.out.println("Gross Salary : " + grossSal);
    }
}

public class CASESTUDY3 { 
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Employee Name : ");
        String name = input.nextLine();
        System.out.print("Enter Employee ID : ");
        String id = input.nextLine();
        System.out.print("Enter Employee Salary : ");
        double sal = input.nextDouble();
        
        Employee emp = new Employee(name, id, sal);
        emp.cal();
        
        input.close(); 
    }
}
