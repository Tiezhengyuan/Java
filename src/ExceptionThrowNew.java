import java.lang.Exception;

public class ExceptionThrowNew{
    /** not compiling: Unhandled exception type Exception
     * 
    static void test1() throws Exception {
        System.out.println("test1");
    }

    */

    static void test1() throws Exception{
        // Exception all other child exceptions
        // throw new Exception();
        // throw new IOException();

        // throw new RuntimeException();
        // throw new IllegalArgumentException();

        // 
        System.out.println("test1");
    }

    static void test2() throws IOException{
        throw new IOException();
        // wrong: throws new FileNotFoundException();
        // wrong: throw new Exception();

        // throw new RuntimeException();
        // throw new IllegalArgumentException();

        // 
        System.out.println("test2");
    }

    // not compiling if main() omit "throws Exception"
    // : Unhandled exception type Exception
    public static void main(String[] args)  throws Exception{
        test1();
        test2();
    }
}



