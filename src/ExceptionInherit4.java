public class ExceptionInherit4 extends Test{
    void go() throws Exception{
        System.out.println("concrete");
    }
    public static void main(String[] args) throws Exception{
        new ExceptionInherit4().go();
    }    
}

abstract class Test{
    abstract void go() throws Exception;
}
