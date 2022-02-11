/* 
str==str2 compare primitive values or address of object 
str.equals(str2) compare object values
str.equalsIgnoreCase(str2)
*/
public class StringCompare {
    public static void main(String[] args) {
        // String type
        System.out.println("String is stored in string pool:");
        String s1 = "abc";
        System.out.println(s1=="abc");//true
        System.out.println(s1.equals("abc"));//true

        String s2 = "abc";
        System.out.println(s2==s1);//true

        String s5 = s1;
        System.out.println(s5==s1);//true
        System.out.println(s5=="abc");//true

        String[] a = {s1};
        String s6 = a[0];
        System.out.println(s6==s1);//true

        String s8 = "";
        s8 += s1;
        System.out.println(s8==s1);//false

        System.out.println("Different objects though same content:");
        // new objct "abc" is created
        String s3 = new String("abc");
        System.out.println(s3==s1); //false
        System.out.println(s3.equals(s1));//true

        String s4 = new String(s1);
        System.out.println(s4==s1);//false

        String s7 = new String("abc");
        System.out.println(s7==s3); //false

        // StringBuilder type
        System.out.println("StringBuilder:");
        StringBuilder1 t1 = new StringBuilder1("abc");
        // not compiling: should be same type
        // System.out.println(t1=="abc");
        // System.out.println(s1.equals(t1));

        StringBuilder1 t2 = new StringBuilder1("abc");
        System.out.println(t2==t1);//false
        // StringBuilder.equals() is same as "this==obj"
        //  equals() method donot override object.equals()
        System.out.println(t2.equals(t1));//false
        System.out.println(t2.toString().equals(t1.toString()));//true

    }
    
}
