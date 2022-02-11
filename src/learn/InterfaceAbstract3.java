public class InterfaceAbstract3 implements Tiger{
    public static void main(String[] args){
        Tiger t = new InterfaceAbstract3();
        t.getName();
    }
}

interface Tiger extends Animal{
    String name = "tiger";
    default String getName(){
        System.out.println(this.name);
        return this.name;
    }
}

interface Animal{
    String getName();
}