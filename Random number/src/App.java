import java.util.Scanner;
import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
        
        Random random = new Random();
        Scanner obj = new Scanner(System.in);

        int num = random.nextInt(100);

        while (true) {
            System.out.println("Guess a number");
            int ask = obj.nextInt();
            if (ask<num) {
                System.out.println("Your number is low");
            }
            else if (ask>num) {
                System.out.println("Your number is high");
            } 
            else if (ask==num) {
                System.out.println("Same Number Congrats");
                break;
            }
            else {
                System.out.println("Invalid input");
            }
        }
    }
}


