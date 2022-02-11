public class ArgumentStringBuilder {
    static StringBuilder1 test(StringBuilder1 a, StringBuilder1 b) {
        // a is new reference to new object "a"
        a = new StringBuilder1("a");
        // b is new reference to object "s2" which is referred by s2, too
        b.append("c");
        return b;
    }
    public static void main(String[] args){
        StringBuilder1 s1 = new StringBuilder1("s1");
        StringBuilder1 s2 = new StringBuilder1("s2");
        StringBuilder1 s3 = test(s1, s2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
    
}
