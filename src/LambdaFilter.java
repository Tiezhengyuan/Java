import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class LambdaFilter {
    interface MathOperation{
        boolean check(int i);
    }
    public List<Integer> filter(int[] arr, MathOperation m){
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++){
            int val = arr[i];
            if(m.check(val)) list.add(val);
        }
        return list;
    }
    public static void main(String[] args) {
        int[] a = {-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        LambdaFilter lf = new LambdaFilter();

        // get odd
        List<Integer> b = lf.filter(a, i -> i%2 == 1);
        System.out.println(b);

        // get even
        List<Integer> c = lf.filter(a, i -> i%2 == 0);
        System.out.println(c);

        // get primes
        List<Integer> d = lf.filter(a, i -> {
            if(i<=1) return false;
            for(int x=2; x<i; x++)
                if(i%x==0) return false;
            return true;
        });
        System.out.println(d);
    }
    
}
