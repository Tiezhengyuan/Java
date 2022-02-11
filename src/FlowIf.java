public class FlowIf{
    static void test1(){
        boolean a = false;
        if(a) System.out.print("a");
        // a=true return true
        if(a=true) System.out.print("b");
        if(a==false) System.out.print("c");
        if(a) {
            System.out.print("d");
        }
    }
    public static void main(String[] args){
        test1();
    }
}