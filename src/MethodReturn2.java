import java.util.ArrayList;


public class MethodReturn2 {
    private ArrayList<String> list = new ArrayList<String>();
    MethodReturn2(){
        list.add("a");
        list.add("b");
    }
    ArrayList getRef(){
        ArrayList<String> list2 = list;
        System.out.println(list.hashCode());
        System.out.println(list2.hashCode());
        return list2;
    }
    ArrayList getObj(){
        ArrayList<String> list2 = new ArrayList<String>(list);
        list2.add("c");
        System.out.println(list2);
        System.out.println(list);
        System.out.println(list2.hashCode());
        return list2;
    }
    public static void main(String[] args){
        MethodReturn2 t = new MethodReturn2();
        ArrayList<String> list3 = t.getRef();
        System.out.println(list3.hashCode());

        ArrayList<String> list4 = t.getObj();
        System.out.println(list4.hashCode());

    }
}
