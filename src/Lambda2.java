public class Lambda2{
    public static void main(String[] args){
        LambdaFunc t = new LambdaFunc() {
            public void call(){
                System.out.println("Hello world");
            }
        };
        t.call();
    }
}

interface LambdaFunc{
    void call();
}
