import java.util.Arrays;

public class ArrayInteger {
    public static void main(String[] args){
        // method 1
        Integer[] a1 = new Integer[10];
        System.out.println(Arrays.asList(a1));

        //2:
        int[] a = {1,2,3};
        Integer[] a2 = new Integer[a.length];
        Arrays.setAll(a, i->a2[i]=a[i]);
        System.out.println(Arrays.asList(a2));
    }
}
