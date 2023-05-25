import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        System.out.println("Are You Married?"); 

        String st = obj.next();
        System.out.println(st);

        if (st.equals("yes")) {
            System.out.println("Your insurance is granted");
        } else {
            System.out.println("Enter gender");
            String g = obj.next();
            if (g.equals("male")) {
                System.out.println("Enter Age");
                int a = obj.nextInt();

                if (a>25) {
                    System.out.println("Insurance Granted");
                } else {
                    System.out.println("Insurance not Granted");
                }
            } 
            if(g.equals("female")) {
                System.out.println("Enter Age");
                int a = obj.nextInt();
                if (a>22) {
                    System.out.println("Insurance Granted");
                } else {
                    System.out.println("Insurance not Granted");
                }
            }
        }
    }
}
