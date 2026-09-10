import java.util.Scanner;

class Patient{
    String patientID,Name;
    int age;
    double temp;
    Patient(String id,String name,int age,double temp){
        patientID = id;
        Name = name;
        this.age = age;
        this.temp = temp;
    }
    void fevCheck(){
        if(temp>100.4){
            System.out.println(Name+ " has fever with temperature of "+temp);
        }else{
            System.out.println(Name+"does not have any fever.");
        }
    }
}
public class CASESTUDY6 {
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Patient Name : ");
        String name = input.nextLine();
        System.out.print("Enter Patient ID : ");
        String id = input.nextLine();
        System.out.print("Enter Patient's age : ");
        int age = input.nextInt();
        System.out.print("Enter Temperature(in F) : ");
        double temp = input.nextDouble();
        Patient pat = new Patient(id,name,age,temp);
        pat.fevCheck();
    }
}