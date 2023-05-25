import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner i = new Scanner(System.in);

        System.out.println("Enter Your value 1: ");
        int v1 = i.nextInt();

        System.out.println("Enter Your value 2");
        int v2 = i.nextInt();

        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Substraction");
        System.out.println("Press 3 for Divison");
        System.out.println("Press 4 for Multiplication");

        int m = i.nextInt();

        switch (m) {
            case 1:
            System.out.println("Your Answer is: " + (v1+v2));
                break;
                case 2:
            System.out.println("Your Answer is: " + (v1-v2));
                break;
                case 3:
            System.out.println("Your Answer is: " + (v1/v2));
                break;
                case 4:
            System.out.println("Your Answer is: " + (v1*v2));
                break;
        
            default:
            System.out.println("Please try selection from above options");
                break;
        }
        
    }
}
