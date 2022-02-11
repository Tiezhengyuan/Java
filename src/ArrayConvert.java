import java.util.ArrayList;
import java.util.Arrays;

public class ArrayConvert {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(2);
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
         
        //method 1:
        Object[] array = list.toArray();
        System.out.println( Arrays.toString(array) );
 
        //method 2:
        String[] arr = new String[4]; 
        int i=0;
        for(Object o : list)
            arr[i++] = (String) o;
        System.out.println(Arrays.toString(arr));
    }
}