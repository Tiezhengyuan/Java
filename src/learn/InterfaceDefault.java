public class InterfaceDefault implements Frog {
    public static void main(String[] args){
        new InterfaceDefault().go();
    }
    void go(){
        System.out.println(hop());
    }
}

interface Frog{
    default String hop(){
        return "hop";
    }
}
