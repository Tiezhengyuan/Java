/*

only work for String
newstr=str.replace(val1, val2)/str.replace(str1, str2)
newstr=str.trim() remove whitespace from beginning or end of string
newstr=str.toLowerCase()
newstr=str.toUpperCase()

only work for StringBuilder
StringBuilder: 
    str.reverse()

*/
public class StringUpdate {
    public static void main(String[] args){
        String s1= "abcdef  ";
        String s2 = new String("  abc DEF");
        StringBuilder1 s3 = new StringBuilder1("abcdef");

        // replace()
        System.out.print(s1.replace('a','A'));
        System.out.println(s2.replace("cd", "3"));

        // trim()
        System.out.print(s1.trim());
        System.out.println(s2.trim());

        // 
        System.out.print(s1.toUpperCase());
        System.out.print(s2.toLowerCase());

    }
    
}
