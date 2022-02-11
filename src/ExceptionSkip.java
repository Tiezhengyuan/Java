/*
exception is skipped in this instance
*/
public class ExceptionSkip {
    public String name = null;
    public void parseName(){
        System.out.println("1");
        try{
            System.out.println("2");
            // raise ava.lang.NumberFormatException
            int x= Integer.parseInt(name);
            System.out.println("3");
        }catch(NullPointerException e){
            System.out.println("4");
        }finally{
            System.out.println("5");
        }
        System.out.println("6");
    }
    public static void main(String[] args){
        ExceptionSkip c = new ExceptionSkip();
        c.name = "abc";
        c.parseName();
        System.out.println("7");
    }
}
