/**
 * pass data primite type or String by value
 * pass objects namely StringBuilder by reference
 */

public class ArgumentString {
    // String a is local variable. pass value to a
    public void test1(String a){
        a += "123";
    }
    // stringbuilder is object. pass reference
    public StringBuilder1 test2(StringBuilder1 a){
        a.append("123");
        return a;
    }
    // new obj is declared though pass reference
    public StringBuilder1 test3(StringBuilder1 a){
        a = new StringBuilder1("a");
        a.append("bc");
        return a;
    }
    public static void main(String[] args) {
        String s1 =  "abc";
        new ArgumentString().test1(s1);
        System.out.println(s1);

        // object s3, s2 point to the same object
        // pass reference of object into method
        StringBuilder1 s2 = new StringBuilder1(s1);
        ArgumentString c1 = new ArgumentString();
        StringBuilder1 s3 = c1.test2(s2);
        System.out.println(s2);
        s3.append("4");
        System.out.println(s2);
        System.out.println(s3);

        // 
        ArgumentString c2 = new ArgumentString();
        StringBuilder1 s4 = c2.test3(s2);
        System.out.println("s2:"+s2);
        System.out.println("s4:"+s4);
    }
    
}
