/*
1. must format below: try-catch-finally
try{
    ...
}catch(Exception e){
    ...
}finally{
    ...
}


*/

import java.lang.Exception;
import java.lang.ArithmeticException;

public class ExceptionTryCatch {

    static void test(int a){
        try{
            System.out.println(10/a);
        }catch(ArithmeticException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("final");
        }
        System.out.println("test");
    }

    public static void main(String[] args){
        test(0);
        System.out.println("done");
    }
    
}
