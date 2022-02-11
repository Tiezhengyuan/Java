import java.util.ArrayList;

public class MethodReturn4 {
    static ArrayList<Object> test(ArrayList<Object> x){
        x.add(new Object());
        x.add(new Animal());
        x.add(new Tiger());
        x.add(null);
        return x;
    }
    public static void main(String[] args){
        ArrayList<Object> list = new ArrayList<>();
        ArrayList<Object> list2 = test(list);
        System.out.println(list.toString());
        System.out.println(list2.toString());
    }
}

class Animal{}
class Tiger extends Animal {}