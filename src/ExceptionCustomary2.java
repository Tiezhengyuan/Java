public class ExceptionCustomary2{
    public static void main(String[] args){
        int a=5, b=0;
        try{
            int res = a/b;
        }catch(MyException e){
            System.out.println(e);
        }
    }
}

class MyException extends RuntimeException{
    MyException(String msg){
        super(msg);
    }
}
