/*
Add/combine string: 
    String: operator +
            str.concat(str2)
    StringBuilder: 
        str.append(val/str2)
        str.insert(index, val/str2)

*/
public class StringAdd{
    public static void main(String[] args) throws Exception {
        String s= "a";
        String s1= "bc";
        // + works with char, string, int, float, boolean
        s+=s1;
        s+="d";
        s+='e';
        s+=1;
        s+=2.3f;
        s+=false;
        System.out.println(s);

        // str.concat()
        s="a";
        s=s.concat("b");
        // not compiling
        // s=s.concat(true);
        // s=s.concat(4);
        // s=s.concat('c');
        System.out.println(s);

        StringBuilder1 s3 = new StringBuilder1("abcdef");

        // append()
        s3.append('1');
        System.out.println(s3);
        s3.append("23");
        System.out.println(s3);

        // insert()
        s3.insert(0, 'A');
        System.out.println(s3);
        s3.insert(10, 'A');//out of bounds is ok
        System.out.println(s3);

    }
    
}
