
/*
1. primitive type: 
    boolean(true/false),
    byte(8 bit), short(16 bit), int(32 bit), long(64 bit),
    float(32 bit), double(64 bit)
    char(0-255)
2. byte/short/char are autmatically convert to int before binary operation.
3. downcasting namely long->int, float->int etc is required explicitly casting.
upcasting is allowed to explicitly/implicit casting
4. In binary operation, cast all types before calculating
*/

public class OperatorBinary {
    static void test1(){
        short x= 14;
        float y=13;
        double z=30;
        //(short) 14 ->  (int)14->(float)14
        // (float)14 *(float)13 
        // (double)(14*13) / double(30)
        double w = x*y/z;
        System.out.println(w);
    }

    static void test2(){
        short x =10;
        short y = 3;
        // (int)10 / (int)3 -> (int)3
        int z = x/y;
        System.out.println(z); //==3
        // (int)10 / (int)3 -> (int)3
        //  (int)3 -> (float)3.0
        float w = (float) (x/y); // ==3.0
        System.out.println(w);

    }

    static void test3(){
        double x= 39.21;
        float y = 39.21f; //should have 'f' postfix
        double z = x+y;
        System.out.println(z);
        float w = (float) (x+y); //==78.41999908447266
        System.out.println(w); //==78.42
    }

    static void test4(){
        long x=10;
        int y=5;
        // (long)y *= (long)x
        y*=x;
        System.out.println(y);
        //not compiling: can't convert long to int
        // y = y+x;
    }

    static void test5(){
        // promote (int)5 to (double)5.00
        System.out.println(5==5.00); //true
        int x=4;
        // assign 6 to x
        // assignment "x=6" return 6, which is assigned to y
        // int y = x=6; x should be declared in advance
        int y = (x=6);
        System.out.print(x);
        System.out.println(y); //return 66
    }
    public static void main(String[] args) {
        // byte/short/char automactically promote to int
        byte x=2;
        short y=4;
        char z = 'A';
        int a = x+y+z; //65+2+4=71
        System.out.println(a);

        // upcasting 
        long b=x+y;
        System.out.println(b);
        float c=x+y;
        System.out.println(c);
        double d=x+y;
        System.out.println(d);

        test1();
        test2();
        test3();
        test4();
        test5();
    }
    
}
