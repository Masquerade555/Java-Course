import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your number");
        int n = s.nextInt();

        if (n > 0) {
            System.out.println("This is a positive number");
        }
        else if(n < 0){
            System.out.println("This is a negative number");
        } 
        else {
            System.out.println("This is a zero");  
        }


        if (n%2 == 0) {
            System.out.println("This is an even number");
        } else {
            System.out.println("This is an odd number");
        }
    }
}
