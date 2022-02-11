public class ExceptionThrow2 {
    public String name;
    public void run() throws Exception {
        System.out.print("1");
        try {
            System.out.print("2");
            name.toString();
            System.out.print("3");
        }catch (ArithmeticException e) {
            System.out.print("4");
            throw new Exception();
        }finally{
            System.out.print("5");
            throw new Exception();
        }
    }
    public static void main(String[] args) throws Exception {
        ExceptionThrow2 jerry = new ExceptionThrow2();
        jerry.run();
        System.out.print("6");
    } 
}
