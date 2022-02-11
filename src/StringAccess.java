/*
length
random access by index
get substring

*/
public class StringAccess {
    public static void main(String[] args){
        String s1= "abcdef";
        String s2 = new String("abcdef");
        StringBuilder1 s3 = new StringBuilder1("abcdef");

        // length()
        System.out.print(s1.length());
        System.out.print(s2.length());
        System.out.println(s3.length());

        // random access: charAt(index)
        // index can't be negative or >=length
        System.out.print(s1.charAt(0));
        System.out.print(s2.charAt(1));
        System.out.println(s3.charAt(3));

        //get substring: substring(start, end)
        // not compiling: end>start, start/end is out of bounds
        System.out.println(s1.substring(1,3)); // from 1 to 2
        System.out.println(s2.substring(2)); //from 2 to end
        System.out.println(s3.substring(2,2)); //empty string
        System.out.println(s3); 


    }
    
}
