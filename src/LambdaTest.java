public class LambdaTest {
    public static void main(String[] args){
        Test t = (int a) -> {
            a +=4; 
            return a*a;
        };
        int x= 1;
        System.out.println(t.go(x));
    }
}

interface Test{
    int go(int x);
}
