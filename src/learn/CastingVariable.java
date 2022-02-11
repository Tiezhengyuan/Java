
public class CastingVariable {
    public static void main(String[] args){
        new CastingVariable().go();
    }
    void go() {
        Mammal m = new Zebra();
        System.out.print(m.name); //parent variable
        System.out.println(m.noise()); //child method
    }
}

class Mammal{
    String name = "furry ";
    String noise(){
        return "generic";
    }
}

class Zebra extends Mammal{
    String name = "stripse ";
    String noise(){
        return "bray";
    }
}
