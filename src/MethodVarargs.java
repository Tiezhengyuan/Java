public class MethodVarargs {
    static void test(boolean a, boolean... b){
        System.out.print(b.length);
    }
    public static void main(String[] args){
        test(true);
        test(true, true);
        test(true, true, false);
        test(true, new boolean[0]);
        // wrong: 
        // test(true, {true, false});
        // test(true, new boolean[]);
    }
}
