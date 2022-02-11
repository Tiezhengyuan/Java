
public class ExceptionFinally {
    void test(){
        System.out.println("1");
        try{
            System.out.println("2");
            throw new RuntimeException();
        }catch(RuntimeException e){
            System.out.println("3");
            throw new RuntimeException();
        }finally{
            System.out.println("4");
            throw new RuntimeException();
        }
        // not compiling if uncomment this
        // System.out.println("5");
    }
    public static void main(String[] args){
        ExceptionFinally c = new ExceptionFinally();
        c.test();
    }
}
