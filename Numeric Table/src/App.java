import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the table you wanna see");
        int v1 = s.nextInt();

        System.out.println("Enter the limit of that table");
        int v2 = s.nextInt();

        for(int result = 1; result<= v2; result++)
        {
            int ans = v1*result;

            System.out.println(v1+" x "+result+" = "+ans);
        }
    }
}
