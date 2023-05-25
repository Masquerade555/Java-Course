import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        

        HashSet<Integer> numbers = new HashSet<Integer>();

        numbers.add(14);
        numbers.add(4);
        numbers.add(13);
        numbers.add(15);
        numbers.add(7);

        for(int i = 1; i<=20; i++)
        {
            if (numbers.contains(i)) {
                System.out.println(i+" was found");
            } else {
                System.out.println(i +" was not found");
            }
        }
    }
}
