/*


*/
public class StringX {
    public static void main(String[] args) throws Exception {
        String s1= "abcdef";
        String s2 = new String("abcDEF");
        StringBuilder s3 = new StringBuilder("abcdef");

        // not work for StringBuilder
        System.out.print(s1.toUpperCase());
        System.out.print(s2.toLowerCase());

    }
    
}
