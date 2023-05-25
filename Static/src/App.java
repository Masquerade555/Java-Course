public class App {
    public static void main(String[] args) throws Exception {
        name();
        int z = add(10, 5);
        System.out.println(z);

        int a = multiplication(10, 5);
        double x = multiplication(11.1, 55.5);

        System.out.println("int is "+a);
        System.out.println("double is "+x);
    }

    static void name() {
        System.out.println("Hi There My name is Frofter");
    }

    static int add(int a,int b) {
        return a+b;
    }

    static int multiplication(int x, int y)
    {
        return x *y;
    }

    static double multiplication(double x, double y)
    {
        return x*y;
    }
}
