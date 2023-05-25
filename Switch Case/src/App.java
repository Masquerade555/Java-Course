import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter Your Shirt Size");
        String size = obj.next();
        
        switch (size) {
            case "small":
            System.out.println("We have small size available");
                break;
                case "medium":
            System.out.println("We have medium size available");
                break;
                case "large":
            System.out.println("We have large size available");
                break;
        
            default:
            System.out.println("Sorry, Wrong Size");
                break;
        }
    }
}
