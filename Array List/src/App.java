import java.util.ArrayList;
import java.util.Collections;
public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(12);
        numbers.add(64);
        numbers.add(36);
        numbers.add(23);
        numbers.add(75);

        numbers.remove(1);
        Collections.sort(numbers);

        for(int i : numbers)
        {
            System.out.println(i);
        }
    }
}
