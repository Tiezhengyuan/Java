import java.util.ArrayList;

public class ArraySize {

    public static void main(String[] args){
        // array is static memory allocation
        // array.length is property
        // a.capacity and a.size  is wrong
        int[] a1 = {1,2};
        System.out.println(a1.length);//==2
        // unassigned int is set 0
        int[] a2 = new int[10];
        a2[2]=2;
        System.out.println(a2.length);//==10
        // 
        int[][] a3 = {{1,2,3}, {1,2}};
        System.out.println(a3.length);//==2
        System.out.println(a3[0].length);//==3
        System.out.println(a3[1].length);//==2

        // arraylist is dynamic. size() is method
        // ArrayList.size() is how many slots in the list
        ArrayList b1 = new ArrayList(); 
        System.out.println(b1.size());//==0
        ArrayList<String> b2 = new ArrayList<>(10); 
        System.out.println(b2.size());//==0
        // b.length(), b.capacity() is wrong.
    }
    
}
