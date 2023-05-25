public class App {
    public static void main(String[] args) throws Exception {
        
        result o = new result();

        System.out.println(o.addition(10, 10));
        System.out.println(o.addition(10.3, 20.9));

        o.fullName("Frofter", "Frofi");
        o.fullName("Frofter", 10);

        shape obj = new angles();
        shape obShape = new shape();

        obj.sides();
        obShape.sides();
    }
}

class result{
    public int addition(int a,int b)
    {
        return a+ b;
    }

    public double addition(double a, double b)
    {
        return a+b;
    }

    public void fullName(String fname, String lname)
    {
        System.out.println(fname +" "+lname);
    }

    public void fullName(String name, int age)
    {
        System.out.println("User Name is "+name+" and their age is "+age);
    }
}

class shape{
    void sides()
    {
        System.out.println("Sides of shapes");
    }
}

class angles extends shape{
    @Override
    void sides(){
        System.out.println("Side of Shapes a=5, b=8, c=3");
    }
}
