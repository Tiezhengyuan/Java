public class ArgumentsVarargs {
    static void test1 (int a, boolean... b){
        System.out.println(b.length);
    }
    static void test2 (boolean... b){
        System.out.println(b.length);
    }
    static void test3 (int[] a, boolean... b){
        System.out.println(b.length);
    }
    static void test4 (boolean a, boolean... b){
        System.out.println(b.length);
    }
    //not compiling:
    // should be boolean...
    // static void test4 (int a, ...boolean b){    }
    // varargs should always be at the end
    // static void test5 (boolean... b, int a){    }
    public static void main(String[] args){
        // test patterns for passing arguments
        test1(1);
        test1(1, true);
        test1(1, true, true);

        test4(true, true, true);
        // not compiling
        // test4(true, new Boolean[2]);

        // not compiling
        // test1(1, {true, true});
        // test1(1, new Boolean[2]);

        // test5(true, 3);
    }
    
}
