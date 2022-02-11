public class InterfaceAbstract {
    public static void main(String[] args){
        new Tiger().getName();
    }
}

class Tiger implements Animal{
    String name;
    Tiger(){
        this.name = "tiger";
    }
    public String getName(){
        System.out.println(this.name);
        return this.name;
    }
}

interface Animal{
    String getName();
}