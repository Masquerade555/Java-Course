public class App {
    public static void main(String[] args) throws Exception {
        
        asd o = new zxc();
        o.qwe();

        DemoCls myObj = new DemoCls();
        myObj.m();
        myObj.mo();
    }
}


interface asd{
    public void qwe();
}

class zxc implements asd{
    public void qwe()
    {
        System.out.println("Congrats this is from interface");
    }
}


interface FirstInterface{
    public void m();
}

interface SecondInterface{
    public void mo();
}

class DemoCls implements FirstInterface,SecondInterface{
    public void m(){
        System.out.println("1st Interface text");
    }
    public void mo(){
        System.out.println("2nd Interface text");
    }
}