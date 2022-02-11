/**
 * can't delete part string type because string is immutable
 * StringBuilder:
 *  str.delete(start, end)
 *  str.deleteCharAt(index)
 */
public class StringDelete {
    public static void main(String[] args){
        StringBuilder1 s3 = new StringBuilder1("0123456");

        // delete value by index
        System.out.println(s3.deleteCharAt(6));

        // delete substring by start-end
        // delete 4th 
        s3.delete(3,4);
        System.out.println(s3);
        // delete all from 4th
        // note: can't omit end index and out of bounds is ok.
        s3.delete(3, 20);
        System.out.println(s3);
        // no deletion though it is ok.
        s3.delete(1, 1);
        System.out.println(s3);




    }
    
}
