// order of static initialization
public class StaticInitialOrder {
    static int a =-1;
    static int b, c;
    //block
    { b = 2; }
    // static block
    static { a = 1; }
    // constructor block
    public StaticInitialOrder(){
        c=3;
    }
    public static void main(String[] args){
        // static pattern: only run static{} block
        // don't execute other blocks
        System.out.print(StaticInitialOrder.a);
        System.out.print(StaticInitialOrder.b);
        System.out.println(StaticInitialOrder.c);

        // instance
        StaticInitialOrder c1 = new StaticInitialOrder();
        System.out.print(c1.a);
        System.out.print(c1.b);
        System.out.println(c1.c);

        // values are based on previous executation
        System.out.print(StaticInitialOrder.a);
        System.out.print(StaticInitialOrder.b);
        System.out.println(StaticInitialOrder.c);

    }
    
}
