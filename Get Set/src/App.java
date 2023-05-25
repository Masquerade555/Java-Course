public class App {
    public static void main(String[] args) throws Exception {
        
        register obj = new register();
        obj.setName("Frofter");
        obj.setAge(20);
        System.out.println(obj.getName()+" "+obj.getAge());
    }
}

class register{
    private String Name;
    private int Age;

    public void setName(String name){
        Name = name;
    }
    public String getName(){
        return Name;
    }
    public void setAge(int age){
        Age = age;
    }
    public int getAge(){
        return Age;
    }
}
