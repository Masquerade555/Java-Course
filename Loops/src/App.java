public class App {
    public static void main(String[] args) throws Exception {
        
        int i = 10;
        while (i<15) {
            System.out.println(i);
            i++;
        }

        int j=20;
        do {
            System.out.println(j);
            j++;
        } while (j<25);


        for(int k = 0; k<=10; k =k+2)
        {
            System.out.println(k);
        }

        String[] cars = {"Toyota", "Honda", "Tesla", "Kia"};
        for(String l : cars)
        {
            System.out.println(l);
        }

        
    }
}
