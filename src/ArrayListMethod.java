/**
 * boolean list.add(el) / void list.add(index, el)
 * el = list.get(index)
 * el = list.set(index, el)
 * boolean list.remove(obj) / el = list.remove(index)
 * 
 * boolean list.isEmpty()
 * boolean list.contains(obj)
 * boolean list.equals(obj)
 * size = list.size()
 * void list.clear()
 * 
 * Note: index is int type ranging  0-(len-1)
 */


import java.util.ArrayList;

public class ArrayListMethod {

    public static void main(String[] args){
        ArrayList<String> a = new ArrayList<String>();

        // append element
        a.add("one"); a.add("two"); a.add("three");
        System.out.println(a.add("four"));

        // access element
        System.out.println(a.get(1));
        // out of bounds: a.get(3);
        // wrong index: a.get(-1);

        // delete value
        a.remove("two");
        System.out.println(a);
        boolean t = a.remove("twod");
        System.out.println(t);


        // update
        a.set(1, "two");
        System.out.println(t);

        a.clear();
        System.out.println(a);

        ArrayList<Integer> b = new ArrayList<Integer>(10);
        System.out.println(b.get(3));
        System.out.println(b.size());
        b.add(3);b.add(0);b.add(1);b.add(2);
        System.out.println(b.size());
        b.remove(3);
        System.out.println(b);

    }
    
}
