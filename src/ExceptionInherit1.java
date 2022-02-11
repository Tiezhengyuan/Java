public class ExceptionInherit1 {
    private static void split() throws HurtException {
        throw new HurtException();
    }
    static void run(){
        try{
            split();
        }catch(LimpException e){
            System.out.print("2 ");
        }catch(HurtException e){
            System.out.print("3 ");
        }
    }
    public static void main(String[] args) throws Exception {
        run();
    }
}


class LimpException extends Exception{
    LimpException(){
        System.out.print("limp ");
    }
}
class HurtException extends LimpException{
    HurtException(){
        System.out.print("hurt ");
    }
}
