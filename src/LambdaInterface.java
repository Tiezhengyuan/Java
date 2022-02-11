// define class: Climb
// define a method with boolean return: isTooHigh()
// functionality is not defined but by lambda function in instance
interface Climb{
    boolean isTooHigh(int height, int limit);
}

public class LambdaInterface {
    private void check2(int height){
        if(isTooHigh(height,10))
            System.out.println("too high");
        else
            System.out.println("good");
    }
    private boolean isTooHigh(int height, int limit){
        return height > limit;
    }


    private static void check(Climb climb, int height){
        if(climb.isTooHigh(height,10))
            System.out.println("too high");
        else
            System.out.println("good");
    }

    public static void main(String[] args) {
        //1. interface + lambda function
        check((h,l) -> h > l, 5);

        //2. instance method
        LambdaInterface c = new LambdaInterface();
        c.check2(5);
    }
}
