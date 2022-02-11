/*
String: string is strong in consecutive address in memory
StringBuilder: string is not consevutive stored. String is mutable

*/
public class StringCreate {
    public static void main(String[] args){
        // String type
        // 1: create literal value stored in string pool
        String s1 = "abc";
        System.out.println(s1);

        // 2: create string object, collected by garbage collection
        String s2 = new String("abc");
        System.out.println(s2);

        // 3: copy reference
        String s3, s4="abc";
        s3 = s4;
        System.out.println(s3);

        // StringBuilder type
        StringBuilder1 s = new StringBuilder1("abcdef");
        String s5= s.toString();
        System.out.println(s5);
        // not compiling
        // StringBuilder s = "abc";
        // convert stringbuilder to string
        


    }
    
}
