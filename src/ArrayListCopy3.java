import java.util.ArrayList;

public class ArrayListCopy3 {
    ArrayList<String> list = new ArrayList<String>();
    ArrayListCopy3(){
        list.add("a");
    }
    void print(){
        System.out.println(list);
    }

    ArrayList copy(){
        ArrayList<String> list1 = new ArrayList<String>();
        // list1.addAll(list);
        // list.forEach((i)->list1.add(i));
        // for(String i: list) list1.add(i);
        list1.add("b");
        return list1;
    }

    public static void main(String[] args){
        ArrayListCopy3 t = new ArrayListCopy3();

        ArrayList<String> b = t.copy();
        System.out.println(b);
        t.print();

        b.add("1");
        t.print();
    }
}
