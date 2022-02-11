public class ArgumentPromote {
    // order of methods doesn't matter
    // arguments must be different
    // other identifiers and method names must be identical
    static void Print(Object value){
        System.out.println("object");
    }

    // accept float, Float type
    static void Print(Float value){
        System.out.println("Float");
    }

    // accept char,shor, int type
    static void Print(int value){
        System.out.println("int");
    }

    // accept char,shor, int, long, and float type
    static void test1(float value){
        System.out.println("float");
    }
    public static void main(String[] args){
        // promote automatically if no such type match

        // byte, short, char to int
        short a= 3; Print(a);
        Print('b');

        // float to object
        Print(3.40);
        // boolean to object
        Print(true);
        // String to object
        String c="a"; Print(c);
        // wrapper class of int
        Print(new Integer("34"));

        // autoboxing float type to Float
        Print(34.5f);
        // promote double to object
        Print(34.5);
        
        //int to float
        test1(3);
        test1(3L);
    }
    
}
