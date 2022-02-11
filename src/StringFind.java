/*
find value or search substring

String or StringBuilder:
    int = indexOf(val/str2)

String:
    boolean = str.startsWith(str2)
    boolean = str.endsWith(str2)
    boolean = str.contains(str2)
*/
public class StringFind{

    public static void main(String[] args) {
        String s1= "abcdef";
        String s2 = new String("abcdef");
        StringBuilder1 s3 = new StringBuilder1("abcdef");

        // find value or substring
        // indexOf(val/str2) return index or -1 if not found
        System.out.print(s1.indexOf('a'));
        System.out.print(s2.indexOf(32));
        System.out.println(s3.indexOf("def"));

        // char will cause error
        // only for String, not for StringBuilder
        System.out.print(s1.startsWith("a"));
        System.out.println(s2.endsWith("a"));

        System.out.print(s1.contains("a"));
        System.out.println(s2.contains("1"));

    }
    
}
