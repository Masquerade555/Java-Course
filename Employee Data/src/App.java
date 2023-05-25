import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner mScanner = new Scanner(System.in);

        System.out.println("Enter Name, Age, Department and Salary");

        String name= mScanner.nextLine();
        int age = mScanner.nextInt();
        String department = mScanner.next();
        double salary = mScanner.nextDouble();

        System.out.println("===Employee Data===");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Department: "+department);
        System.out.println("Salary: "+salary);
    }
}
