public class InterfaceStatic implements Frog{
    public static void main(String[] args) {
        new InterfaceStatic().go();
    }
    void go(){
        System.out.println(Frog.getF(32));
        InterfaceStatic d = new InterfaceStatic();
        // System.out.println(getF(32));
    }
}

interface Frog{
    static int getF(int temp){
        return temp*9/5+32;
    }
}