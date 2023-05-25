public class App {
    public static void main(String[] args) throws Exception {

        abs obj = new child();
        obj.asd();
        obj.zxc();

        Parent p = new loi();
        Parent po = new lop();
        po.msg();
        p.msg();
        
    }
}

abstract class abs{
    abstract void asd();

    public String zxc()
    {
        System.out.println("This is from 1st abstract class");

        return null;
    }
}

class child extends abs{
    void asd()
    {
        System.out.println("This is from a child abstract class");
    }
}

abstract class Parent{
    abstract void msg();
}

class lop extends Parent{
    void msg()
    {
        System.out.println("This is 1st child");
    }
}

class loi extends Parent{
    void msg()
    {
        System.out.println("This is 2nd child");
    }
}
