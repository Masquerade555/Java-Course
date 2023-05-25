public class App {
    public void car(){
        System.out.println("My favourite car is Lamborghini");
    }

    public void speed(int maxSpeed){
        System.out.println("Its max speed is "+ maxSpeed);
    }
}

class Second{
    public static void main(String[] args) throws Exception {
        App mApp = new App();
        mApp.car();
        mApp.speed(150);
    }
}
