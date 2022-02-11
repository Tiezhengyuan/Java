import java.util.ArrayList;
import java.util.List;

public class LambdaDefine2{

    public static void execute(List<Integer> list, Computer c){
        double result = 1D;
        if(list != null){
            for (Integer i : list) {
                if(i != 0)
                    result = c.compute(result, i);
            }
        }
        System.out.println(result);
    }
    public static void main(String[] args){
        List<Integer> nums = new ArrayList<Integer>();
        execute(nums, null);

        nums.add(2);nums.add(14);nums.add(1);
        // accumulative add
        execute(nums, (a,b)->{ return (b!=0) ? (a+b) : a;});
        // accumulative multiply
        execute(nums, (a,b)->{ return a * b;} );
    }
}

interface Computer{
    public double compute(double a, int b);
}
