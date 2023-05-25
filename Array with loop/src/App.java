import java.util.Scanner;
import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter Length: ");
        int n = obj.nextInt();

        String[] arr = new String[n];
        int[] price = new int[n];

        for(int i=0; i<arr.length; i++)
        {
            System.out.println("Enter Product");
            arr[i]  =obj.next();
            System.out.println("Enter "+arr[i]+ " price: ");
            price[i] = obj.nextInt();
        }

        for(int i=0; i<arr.length; i++)
        {
            System.out.println((i+1) + " product: " + arr[i] + "\n price: +"+ price[i]);

        }

        System.out.println("Enter Order: ");
        int orderId = obj.nextInt();

        System.out.println("Your order: " + arr[orderId-1]);
        System.out.println("Total: " + price[orderId-1]);
    }
}
