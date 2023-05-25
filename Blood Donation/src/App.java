import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your blood type");
        String b = s.next();

        if (b.equals("o+")) {
            System.out.println("You can donate blood to O+ and O-");
        }
        else if (b.equals("o-")) {
            System.out.println("You can donate blood to O+ and O-");
        }
        else if (b.equals("b+")) {
            System.out.println("You can donate blood to B+ and B-");
        }
        else if (b.equals("b-")) {
            System.out.println("You can donate blood to B+ and B-");
        }
        else if (b.equals("a+")) {
            System.out.println("You can donate blood to A+ and A-");
        }
        else if (b.equals("a-")) {
            System.out.println("You can donate blood to A+ and A-");
        }
         else {
            System.out.println("Wrong blood type try again");
        }
    }
}
