import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.lang.Interger;

public class ArrayListDefine {
    public static void main(String[] args) {
        // <java5 is working
        ArrayList a1 = new ArrayList();
        ArrayList a2 = new ArrayList(10);
        ArrayList a3 = new ArrayList(a2);
        
        // 
        ArrayList<String> a4 = new ArrayList<String>();
        a4.add("a");
        a4.add("b");
        ArrayList<String> a5 = new ArrayList<>();

        // list interface
        List<String> a6 = new ArrayList<>();
        List<String> a7 = Arrays.asList("one", "two");

        ArrayList<Integer> a8 = new ArrayList<>();
        a8.add(new Integer(5));
        a8.add(6);
        a8.add(new Integer('5'));
        a8.add(new Integer('a'));
        a8.add(new Integer("1"));
        System.out.println(a8);

        // not compiling
        // constants array is not argument: ArrayList a = new ArrayList({});
        // list is interface: ArrayList a = new List({});
        // list is interface: List a = new List({});
        // can't convert: ArrayList<String> a7 = Arrays.asList("one", "two");

    }
    
}
