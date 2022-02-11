public class ExceptionMask {
    public static void main(String[] args){
        String a = null;
        try{
            try{
                System.out.println("1");
                a.length();
                System.out.println("2");
            }catch(NullPointerException e){
                System.out.println("3");
                throw new RuntimeException();
            }finally{
                System.out.println("4");
                // throw new Exception();
            }
        }catch(Exception e){
            System.out.println("5");
        }
    }
    
}
