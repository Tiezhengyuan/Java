public class Lambda3 {
    public static void main(String[] args){
        LambdaFunc t = () -> System.out.println("Hello world");
        t.call();
    }
}

interface LambdaFunc{
    void call();
}
