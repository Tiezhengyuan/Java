public class ExceptionInterface implements Test{
    public void go() throws Exception{
        System.out.println("concrete");
    }
    public static void main(String[] args) throws Exception{
        new ExceptionInterface().go();
    }    
}

interface Test{
    void go() throws Exception;
}
