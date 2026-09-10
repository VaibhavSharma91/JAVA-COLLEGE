import java.util.Scanner;

class book{
    String bookID,bookTitle,Author;
    boolean Availability,isIssued = false;
    book(String id,String title,String auth,boolean avail){
        bookID = id;
        bookTitle = title;
        Author = auth;
        Availability = avail;
    }
    void issueBook(){
        if(Availability){
            System.out.println(bookTitle+" has been issued.");
            Availability =false;
            isIssued =true;
        }else{
            System.out.println(bookTitle+" is not Available !!");
        }
    }
    void returnBook(){
        if(isIssued){
            System.out.println(bookTitle+" has been returned.");
            Availability =true;
            isIssued =false;
        }else{
            System.out.println(bookTitle+" is not issued !!");
        }
    }
    void displayBook(){
        System.out.println("Displaying Book details : ");
        System.out.println("Book Title : "+bookTitle);
        System.out.println("Book ID : "+bookID);
        System.out.println("Book Author : "+Author);
        if(Availability){
            System.out.println(bookTitle+" is Available");
        }else{
            System.out.println(bookTitle+" is not Available !!");
        }
    }
}
public class CASESTUDY5 {
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Book Name : ");
        String name = input.nextLine();
        System.out.print("Enter Book ID : ");
        String id = input.nextLine();
        System.out.print("Enter Book Author : ");
        String auth = input.nextLine();
        System.out.print("Enter Availability(true/false) : ");
        boolean avail = input.nextBoolean();
        book b = new book(id,name,auth,avail);
        b.issueBook();
        b.returnBook();
        b.displayBook();
    }
}