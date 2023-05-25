import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        

        Scanner i = new Scanner(System.in);

        System.out.println("Enter Salary ");
        int basicSalary = i.nextInt();

        double transportation = basicSalary*0.4;
        double medical = basicSalary*0.2;

        System.out.println("Gross Salary is: "+(basicSalary+transportation+medical));
    }
}
