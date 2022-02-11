/*
 throw e  will stop executing all other codes 
 return the stack trace for the exception
*/

public class ExceptionThrow {
    public String name;
    public void run(){
        System.out.println("1");
        try{
            System.out.println("2");
            name.toString();
            System.out.println("3");
        }catch(NullPointerException e){
            System.out.println("4");
            // stop executing all other codes
            throw e;
        }
        System.out.println("5");
    }
    public static void main(String[] args) {
        ExceptionThrow c = new ExceptionThrow();
        c.run();
        System.out.println("6");
    }
}
