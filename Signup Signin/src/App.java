import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner s = new Scanner(System.in);

        System.out.println("==Signup==");
        System.out.println("New Username");
        String un = s.nextLine();

        System.out.println("New Password");
        String pass = s.nextLine();

        System.out.println("==Signin==");
        System.out.println("Enter Username");
        String username = s.nextLine();

        System.out.println("Enter Password");
        String password = s.nextLine();

        if (un.equals(username) && pass.equals(password)) {
            System.out.println("Welcome User");
        } else {
            System.out.println("Wrong Username or Password");
        }
    }
}
