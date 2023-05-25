public class App {
    public static void main(String[] args) throws Exception {
        
        int temp = 2;

        if (temp <= 10) {
            System.out.println("Its Cold Outside");
        }
        else if (temp <=25) {
            System.out.println("its normal outside");
        } 
        else if (temp <= 40) {
            System.out.println("Its hot outside");
        }
        else{
            System.out.println("Try not to go outside without any safety equipment its very hot outside");
        }
    }
}
