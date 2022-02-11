import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

// Limit: forEach() has not return
// forEach() rather than for loop is suggested in some cases.
public class LambdaForEach {
    public static void main(String[] args) {
        // ArrayList
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);a.add(2);a.add(3);
        a.forEach( (i) -> {
            int x = i*10;
            System.out.println(x);
        });

        //List
        List<Integer> b = new ArrayList<Integer>();
        b.add(1);b.add(2);b.add(3);
        b.forEach( (i) -> {
            int x = i*i;
            System.out.println(x);
        });

        //Map
        Map<String, Integer> m = new HashMap<String, Integer>();
        m.put("a", 1); m.put("b", 3); m.put("c", 3);
        m.forEach( (key, val) -> {
            System.out.println( key + val);
        });
    }
    
}
