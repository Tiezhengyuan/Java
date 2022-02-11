public class StringImmutable{
    public static void main(String[] args){
        // string is immutable

        // copy string 
        String a = "abc";
        String b = a;
        // create a new object "xyz" and assign to reference "a"
        a="xyz";
        System.out.println(b);

        String c = new String("abc");
        String d = c;
        c = "xyz";
        System.out.println(d);

        //string is immutable
        String e = "abc";
        e.concat("d");
        System.out.println(e);
        // stringBuilder is mutable
        StringBuilder1 f = new StringBuilder1("abc");
        StringBuilder1 g = f.append("d");
        g.append("e");
        // reference "f" and "g" point to the same object
        System.out.println(f);
        System.out.println(g);
    }
}
