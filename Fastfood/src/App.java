import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);

        int v1, v2, v3;

        System.out.println("Select your fast food");
        System.out.println("Press 1 for Zinger Burger");
        System.out.println("Press 2 for Chicken Roll");
        v1 = s.nextInt();

        if (v1 == 1) {
            System.out.println("Do you wan cold drink");
            System.out.println("press 1 for yes");
            System.out.println("press 2 for no");
            v2 = s.nextInt();

            if (v2 == 1) {
                System.out.println("Choose your payment method");
                System.out.println("press 1 for cash");
                System.out.println("press 2 for card");
                v3 = s.nextInt();

                if (v3 == 1) {
                    System.out.println("Your zinger with cold drink will be ready");
                    System.out.println("Your payment method is cash");
                } else if (v3 == 2) {
                    System.out.println("Your zinger with cold drink will be ready");
                    System.out.println("Your payment method is card");
                } else {
                    System.out.println("Wrong Choice Try Again");
                }
            } else if (v2 == 2) {
                System.out.println("Choose your payment method");
                System.out.println("press 1 for cash");
                System.out.println("press 2 for card");
                v3 = s.nextInt();

                if (v3 == 1) {
                    System.out.println("Your zinger without cold drink will be ready");
                    System.out.println("Your payment method is cash");
                } else if (v3 == 2) {
                    System.out.println("Your zinger without cold drink will be ready");
                    System.out.println("Your payment method is card");
                } else {
                    System.out.println("Wrong Choice Try Again");
                }
            } else {
                System.out.println("Wrong Choice Try Again");
            }
        } else if (v1 == 2) {
            System.out.println("Do you wan cold drink");
            System.out.println("press 1 for yes");
            System.out.println("press 2 for no");
            v2 = s.nextInt();

            if (v2 == 1) {
                System.out.println("Choose your payment method");
                System.out.println("press 1 for cash");
                System.out.println("press 2 for card");
                v3 = s.nextInt();

                if (v3 == 1) {
                    System.out.println("Your chicken roll with cold drink will be ready");
                    System.out.println("Your payment method is cash");
                } else if (v3 == 2) {
                    System.out.println("Your chicken roll with cold drink will be ready");
                    System.out.println("Your payment method is card");
                } else {
                    System.out.println("Wrong Choice Try Again");
                }
            } else if (v2 == 2) {
                System.out.println("Choose your payment method");
                System.out.println("press 1 for cash");
                System.out.println("press 2 for card");
                v3 = s.nextInt();

                if (v3 == 1) {
                    System.out.println("Your chicken roll without cold drink will be ready");
                    System.out.println("Your payment method is cash");
                } else if (v3 == 2) {
                    System.out.println("Your chicken roll without cold drink will be ready");
                    System.out.println("Your payment method is card");
                } else {
                    System.out.println("Wrong Choice Try Again");
                }
            } else {
                System.out.println("Wrong Choice Try Again");
            }
        } else {
            System.out.println("Wrong Choice Try Again");
        }
    }
}
