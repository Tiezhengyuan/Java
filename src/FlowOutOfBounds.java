public class FlowOutOfBounds {
    static void test1(){
        int[] a= {1, 2, 3};
        for(int i = 0; i<3; i++){
            System.out.print(a[i]);
        }
    }
    static void test2(){
        String[] a= new String[4];
        String[] sb = {"red", "blue", "yellow"};
        for(int i = 0; i<sb.length; i++){
            a[i] = sb[i];
        }
        for(int j = 0; j<a.length; j++){
            String s = a[j].toLowerCase();
            System.out.print(s);
        }
    }
    public static void main(String[] args){
        test1();
        test2();
    }
}
