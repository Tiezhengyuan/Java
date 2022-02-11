public class Lambda1 implements LambdaFunc{
    public void call(){
        System.out.println("Hello world");
    }
    public static void main(String[] args){
        LambdaFunc t = new Lambda1();
        t.call();
    }
}

interface LambdaFunc{
    void call();
}
