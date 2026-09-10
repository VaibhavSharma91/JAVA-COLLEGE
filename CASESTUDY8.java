import java.util.Scanner;

class employee{
    String Name;
    double salary;
    employee(String name,double sal){
        Name = name;
        salary = sal;
    }
    void displaydtls(){
        System.out.println("Employee name is "+Name);
        System.out.println("Employee salary is "+salary);
    }
}
class Manager extends employee {
    double bonus;

    Manager(String name, double sal, double bonus) {
        super(name, sal);
        this.bonus = bonus;
    }

    void displaydtls() {
        System.out.println("Manager name is " + Name);
        System.out.println("Manager salary is " + salary);
        System.out.println("Manager bonus is " + bonus);
        System.out.println("Total salary is " + (salary + bonus));
    }
}

public class CASESTUDY8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = input.nextLine();
        System.out.print("Enter employee salary: ");
        double salary = input.nextDouble();

        employee e = new employee(name, salary);
        e.displaydtls();

        System.out.print("Enter manager name: ");
        String mname = input.nextLine();
        System.out.print("Enter manager salary: ");
        double msalary = input.nextDouble();
        System.out.print("Enter manager bonus: ");
        double bonus = input.nextDouble();

        Manager m = new Manager(mname, msalary, bonus);
        m.displaydtls();
    }
}