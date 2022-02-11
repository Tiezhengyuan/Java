public class ArrayCasting {
    public static void main(String[] args) {
        String[] s = {"good"};
        System.out.println(s);

        // obj is reference: cast Object[] to String[]
        Object[] obj = s;
        System.out.println(obj);
        System.out.println(java.util.Arrays.toString(obj));
        Object[] obj2 = {s};
        System.out.println(obj2);

        // promote/cast type of reference: object array to string array
        // Note: can't promote object itself 
        String[] s3 = (String[]) obj;
        System.out.println(s3);
    }
}
