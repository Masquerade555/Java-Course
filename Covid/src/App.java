import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner s = new Scanner(System.in);
        int age,v1,v2;
        System.out.println("Enter Your Age");
        age = s.nextInt();

        if (age > 12) {
            System.out.println("Enter your Symptom");
            System.out.println("Press 1 for fever");
            System.out.println("Press 2 for weakness");
            v1 = s.nextInt();

            if (v1 == 1) {
                System.out.println("You have covid");
            }
            else if (v1 == 2) {
                System.out.println("Enter another symptom");
                System.out.println("Press 1 stomach pain");
                System.out.println("Press 2 for restleness");
                v2 = s.nextInt();
                
                if (v2 == 1) {
                    System.out.println("You have Typhoid");
                }
                else if (v2 == 2) {
                    System.out.println("You have Dengue");
                } 
                else {
                    System.out.println("Wrong Choice Try Again");
                }
            }
            else {
                System.out.println("Wrong Choice Try Again");
            }
        } else {
            System.out.println("Kids Cant get covid");
        }
    }
}
