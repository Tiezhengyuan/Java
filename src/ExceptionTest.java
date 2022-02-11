public class ExceptionTest {
    public void run() throws RuntimeException{
        System.out.println("child");
    }
    public static void main(String[] args){
        new ExceptionTest().run();
    }
}

interface Test{
    void run() throws RuntimeException;
}
