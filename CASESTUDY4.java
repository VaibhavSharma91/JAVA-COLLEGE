import java.util.Scanner;

class Product {
    String prodID, prodName;
    int quantity;
    double price, total;

    Product(String id, String name, int quantity, double price) {
        prodID = id;
        prodName = name;
        this.quantity = quantity;
        this.price = price;
    }

    void bill() {
        total = price * quantity;
        if (total > 5000) {
            double dis = total - total * 0.1;
            System.out.println("10% discount is being added...");
            System.out.println("Your total bill is : " + dis);
        } else {
            System.out.println("Your total bill is : " + total);
        }
    }
}

public class CASESTUDY4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Product Name : ");
        String name = input.nextLine();
        System.out.print("Enter Product ID : ");
        String id = input.nextLine();
        System.out.print("Enter Product Price : ");
        double price = input.nextDouble();
        System.out.print("Enter Quantity : ");
        int qnt = input.nextInt();
        
        Product prod = new Product(id, name, qnt, price);
        prod.bill();
        
        input.close();
    }
}
