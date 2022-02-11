import java.util.ArrayList;

public class ArrayCompare {
    public static void main(String[] args) {
        int[] a1 = {1,2};
        int[] a2 = {1,2};
        int[] a3 = a1;
        System.out.println(a1==a2);
        //return false:
        //two arrays with same contents may not be equal
        System.out.println(a1.equals(a2));
        System.out.println(a1==a3);
        System.out.println(a1.equals(a3));

        System.out.println("ArrayList:");
        ArrayList<Integer> b1 = new ArrayList<Integer>();
        b1.add(1);b1.add(2);
        ArrayList<Integer> b2 = new ArrayList<Integer>();
        b2.add(1);b2.add(2);
        System.out.println(b1==b2);
        System.out.println(b1.equals(b2));
        ArrayList<Integer> b3 = b1;
        System.out.println(b1==b3);
        System.out.println(b3.equals(b1));
    }
    
}
