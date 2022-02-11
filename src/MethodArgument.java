public class MethodArgument {
    void test1(){
        System.out.println("print");
    }
    void test2(int a, float b){
        System.out.println(a+b);
    }
    void test3(int a, float... args){
        if (args.length > 0){
            System.out.println(a+args[0]);
        }
    }
    public static void main(String[] args){
        MethodArgument C = new MethodArgument();
        C.test1();
        C.test2(3, 3.4f);
        C.test3(3);
        C.test3(3, 3.1f);
        C.test3(3, 3.1f, 3.2f);
        float[] a= {3.1f, 3.2f};
        C.test3(3, a);
        float[] b = new float[10];
        C.test3(3, b);
    }
}
