import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        

        HashMap<String,Integer> employee = new HashMap<String,Integer>();

        employee.put("Jackie", 54);
        employee.put("Christa", 32);
        employee.put("Julie", 41);
        employee.put("Zack", 23);
        employee.put("Mira", 19);

        for(String i : employee.keySet())
        {
            System.out.println("Employee name: "+i+" Age: "+employee.get(i));
        }

    }
}
