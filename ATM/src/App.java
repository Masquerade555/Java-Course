import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner s = new Scanner(System.in);

        System.out.println("Enter username");
        String u = s.nextLine();
        System.out.println("Enter password");
        String p = s.nextLine();

        if (u.equals("admin") && p.equals("admin")) {
            System.out.println("Choose an amount");
            System.out.println("Press 1 for 5000");
            System.out.println("Press 2 for 10000");
            System.out.println("Press 3 for other amount");
            int amount = s.nextInt();

            if (amount == 1) {
                System.out.println("Do you want a slip?");
                System.out.println("Enter yes or no");
                String slip = s.next();

                if (slip.equals("yes")) {
                    System.out.println("You have withdrawn 5000");
                    System.out.println("Thank You");
                }
                else if(slip.equals("no")){
                    System.out.println("Thank you");
                } 
                else {
                    System.out.println("Wrong Choice");
                }
            }
            else if (amount  == 2) {
                System.out.println("Do you want a slip?");
                System.out.println("Enter yes or no");
                String slip = s.next();

                if (slip.equals("yes")) {
                    System.out.println("You have withdrawn 10000");
                    System.out.println("Thank You");
                }
                else if(slip.equals("no")){
                    System.out.println("Thank you");
                } 
                else {
                    System.out.println("Wrong Choice");
                }
            }
            else if(amount == 3)
            {
                System.out.println("Enter your amount");
                int a = s.nextInt();

                if (a <= 20000) {
                    System.out.println("Do you want a slip?");
                    System.out.println("Enter yes or no");
                    String slip = s.next();
    
                    if (slip.equals("yes")) {
                        System.out.println("You have withdrawn "+a);
                        System.out.println("Thank You");
                    }
                    else if(slip.equals("no")){
                        System.out.println("Thank you");
                    } 
                    else {
                        System.out.println("Wrong Choice");
                    }
                } else {
                    System.out.println("You cant withdraw more then 20000");
                }
            }
             else {
                System.out.println("Wrong Choice");
            }
        } else {
            System.out.println("Wrong username or password");
        }
    }
}
