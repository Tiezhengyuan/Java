public class InterfaceDefault extends Test{
    public String getName(){
        return "tiger";
    }
    public static void main(String[] args){
        Test t = new InterfaceDefault();
        System.out.println(t.getName());
    }
}

abstract class Test implements Animal{
    public String getName(){
        return "test";
    }
}

interface Animal{
    default String getName(){
        return "animal";
    }
}