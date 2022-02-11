public class ArraDefine {
    static void test_int(){
        // declare and initialize with constants 
        // can't declare array size
        int[] a = {1,2,3};
        int c[] = {1,2,3};
        int[] b; b=a;
        
        
        //declare and initialize as defaul==0 with size first
        // assign values in other part
        int[] d= new int[10];
        d[0]=1; d[1]=2; d[2]=3;
        
        int[] e = new int[0];
        System.out.println(e);

        // not compiling
        // initial: int d[]; d={1,2,3};
        //no initial: int[] d; d={1,2,3};
        //size can't used in iterals: int[3] a={1,2,3};
        //size can't used in iterals: int b[3] = {1,2,3};
        //omit size: int[] c= new int[];
        //wrong assign: int[] c= new int[10]; c={1,2,3};

    }
    public static void main(String[] args) {
        test_int();

        // String array
        String[] s = {"good"};
        // s is reference variable to an object
        System.out.println(s);
        System.out.println(java.util.Arrays.toString(s));

        String[] s2=s;
        System.out.println(s2);
        System.out.println(java.util.Arrays.toString(s2));

        
        //StringBuilder
        StringBuilder1[] s4 = {};
        System.out.println(s4);

    }
    
}
