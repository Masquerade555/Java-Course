import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Username");
        String name = input.next();
        System.out.println("Enter Password");
        String pass = input.next();

        System.out.println("Input 3 numbers");
        int n1= input.nextInt();
        System.out.println("Input 1st three numbers of numeric table");
        int n2 = input.nextInt();

        cons a = new cons();
        cons b = new cons(100, "Frofter");

        System.out.println(a.a);
        System.out.println(a.b);

        if (name.equals("Frofter") || pass.equals("admin")) {
            System.out.println("Welcome User");
        } else {
            System.out.println("Try Again");
        }

        if (n1 == 123 || n2 == 123) {
            System.out.println("Correct numbers");
        } else {
            System.out.println("Wrong Numbers");
        }

    }
}


class cons{
    int a;
    boolean b;
    double p = 10.11;
    cons(){
        a = 6;
        b = true;
        System.out.println("This is from inside Constructor");
    }

    cons(int c, String nam)
    {
        System.out.println("C has a value of "+c+" And Name Stored init is "+nam);
    }
}