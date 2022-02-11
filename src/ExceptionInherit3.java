public class ExceptionInherit3 extends Test{
    void go() throws Exception{
        System.out.println("child");
    }
    public static void main(String[] args) throws Exception{
        new ExceptionInherit3().go();
    }    
}

class Test{
    void go() throws Exception{
        System.out.println("parent");
    }
}
