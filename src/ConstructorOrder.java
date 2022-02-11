public class ConstructorOrder {
    static int a;
    {
        System.out.print("a");
    }
    ConstructorOrder(){
        System.out.print("b");
    }
    static {
        a=10;
        System.out.print("c");
    }
    public static void main(String[] args){
        System.out.print("d");
        // ConstructorOrder d = new ConstructorOrder();
        // System.out.print("e");
    }
}
