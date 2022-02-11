public class ExceptionCustomary{
    public static void main(String[] args) throws MyExceptions{
        int a=5, b=0;
        if(b==0)
            throw new MyExceptions("zero");
        
    }
}

class MyExceptions extends Exception{
    MyExceptions(String msg){
        super(msg);
    }
}
