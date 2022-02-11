public class InterfaceDefaultInherit implements Frog {
    public static void main(String[] args){
        new InterfaceDefaultInherit().go();
    }
    void go(){
        System.out.println(hop());
        System.out.println(Frog.super.hop());
    }
    public String hop(){
        return "scrawl";
    }

}

interface Frog{
    default String hop(){
        return "hop";
    }
}
