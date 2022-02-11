public class FlowFor {
    static void test1(){
        int a[] = {1,2,3};
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]);
        }
        System.out.println("");
    }

    static void test2(){
        int a[] = {4,5,6};
        for(int i : a)
            System.out.print(i);
        System.out.println("");
    }


    static void test3(){
        int i=0, a[] = {1,2,3};
        for(;;){//infinite loop
            System.out.print(a[i++]);
            if (i>=a.length) break;
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        // the three patterns are equal
        test1();
        test2();
        test3();
    }
    
}
