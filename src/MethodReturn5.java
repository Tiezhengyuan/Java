public class MethodReturn5 {
    static float test3(){
        short a =4;
        return (float) a;
    }
    static int test4(){
        return (int) 3.14;
    }
    static float test5(int a){
        return (float) a;
    }

    public static void main(String[] args) {
        test3();
        test4();
        test5(3);
    }
}
