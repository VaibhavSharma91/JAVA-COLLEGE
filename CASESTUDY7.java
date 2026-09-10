import java.util.Scanner;

class ATM{
    double Balance;
    ATM(double bal){
        Balance = bal;
    }
    void deposit(double x){
        Balance+=x;
        System.out.println(x+ " is deposited successfully.");
    }
    void withdraw(double x){
        if(Balance<x){
            System.out.println("Insufficient Balance !!!");
        }
        else{
            Balance -= x;
            System.out.println(x + " is withdrawn Successfully.");
        }
    }
    void displayBalance(){
        System.out.println("Your current balance is "+Balance);
    }
}

public class CASESTUDY7 {
    public static void main() {
        Scanner input = new Scanner(System.in);
        int choice,pin = 1234;
        int tryy = 0;
        boolean login = false;
        double amt;
        while(tryy<3){
            System.out.print("Enter PIN : ");
            int inputPIN = input.nextInt();
            if(inputPIN==pin){
                System.out.println("Login Successful...");
                login = true;
                break;
            }tryy++;
            System.out.println("Incorrect PIN !!!");
        }
        if(login){
            ATM atm = new ATM(1000);
            do {
                System.out.println("\n==== ATM MENU ====");
                System.out.println("1. Withdraw");
                System.out.println("2. Deposit");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");

                choice = input.nextInt();

                switch (choice) {

                    case 1:
                        System.out.print("Enter withdrawal amount: ");
                        amt = input.nextDouble();
                        atm.withdraw(amt);
                        break;

                    case 2:
                        System.out.print("Enter deposit amount: ");
                        amt = input.nextDouble();
                        atm.deposit(amt);
                        break;

                    case 3:
                        atm.displayBalance();
                        break;

                    case 4:
                        System.out.println("Thank you for using the ATM.");
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }

            } while (choice != 4);
        }else{
            System.out.println("Maximum Failed Attempts !!!");
            System.out.println("Your Account is blocked...");
        }

    }
}