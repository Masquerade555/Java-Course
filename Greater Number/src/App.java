import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner s = new Scanner(System.in);

        System.out.println("Enter 1st value");
        int v1 = s.nextInt();

        System.out.println("Enter 2nd value");
        int v2 = s.nextInt();

        System.out.println("Enter 3rd value");
        int v3 = s.nextInt();

        if (v1 > v2) {
            if (v1 > v3) {
                System.out.println("Value 1 which is "+v1+ " is the greater");
            } else {
                System.out.println("Value 3 which is "+v3+ " is the greater");
                
            }
        }
        else if (v2 > v3) {
            System.out.println("Value 2 which is "+v2+ " is the greater");

        } 
        else if(v3 > v2 && v3 > v1){
            System.out.println("Value 3 which is "+v3+ " is the greater");

        }
    }
}
