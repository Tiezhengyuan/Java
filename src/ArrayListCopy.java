import java.util.ArrayList;

public class ArrayListCopy {
    ArrayList<String> list = new ArrayList<String>();
    ArrayListCopy(){
        list.add("a");
    }
    void print(){
        System.out.println(list);
    }

    ArrayList copy(){
        ArrayList<String> list1 = list;
        list1.add("b");
        return list1;
    }
    public static void main(String[] args){
        ArrayListCopy t = new ArrayListCopy();
        // shallow copy
        ArrayList<String> a = t.copy();
        t.print();
        a.add("1");
        t.print();
    }
}
