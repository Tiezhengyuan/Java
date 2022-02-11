import java.util.ArrayList;
import java.util.stream.Collectors;

public class ArrayListCopy2 {
    ArrayList<String> list = new ArrayList<String>();
    ArrayListCopy2(){
        list.add("a");
    }
    void print(){
        System.out.println(list);
    }

    ArrayList copy(){
        // ArrayList<String> list1 = new ArrayList<String>(list);
        //ArrayList<String> list1 = (ArrayList<String>) list.clone();
        ArrayList<String> list1 = (ArrayList<String>) 
            list.stream().collect(Collectors.toList());
        list1.add("b");
        return list1;
    }

    public static void main(String[] args){
        ArrayListCopy2 t = new ArrayListCopy2();

        ArrayList<String> b = t.copy();
        System.out.println(b);
        t.print();

        b.add("1");
        t.print();
    }
}
