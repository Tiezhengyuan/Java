// what resturn statement is ok.
public class FunctionReturn {
    // ok
    public static void test1(){   }
    public static void test2(){
        return;
    }
    //Exception error
    // Void methods cannot return a value
    // public static void test3(){
    //     return null;
    // }
    // public static void test4(){
    //     String name = 'abc';
    //     return name;
    // }

    public static int test5(){
        return 4;
    }
    //Exception error: 
    // This method must return a result of type int
    // public static int test6(){
    //     return;
    // }
    // Type mismatch: cannot convert from null to int
    // public static int test7(){
    //     return null;
    // }
    // Type mismatch: cannot convert from float to int
    // public static int test8(){
    //     float a=4;
    //     return a;
    // }

    public static void main(String[] args) {
        // void
        test1();
        test2();
        // test3();
        // test4();

        // return
        test5();
        // test6();
        // test7();
        // test8();
    }
    
}
