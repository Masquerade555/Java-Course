import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner i = new Scanner(System.in);

        System.out.println("Enter Meters: ");

        int meters = i.nextInt();
        double value = 0.00062137;
        double miles = meters*value;

        System.out.println("In Miles: " + miles);
    }
}
