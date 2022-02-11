public class InterfaceAbstract2 extends Tiger{
    public String getName(){
        System.out.println("other");
        return "other";
    }
    public static void main(String[] args){
        Tiger t = new InterfaceAbstract2();
        t.getName();
    }
}

abstract class Tiger implements Animal{
    String name = "tiger";
    public String getName(){
        System.out.println(this.name);
        return this.name;
    }
}

interface Animal{
    String getName();
}