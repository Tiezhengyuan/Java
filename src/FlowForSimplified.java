public class FlowForSimplified{
    static void test1(){
        for(;;)
            break;
    }
    static void test2(){
        int a[]= {1,2,3};
        for(int i=-1; ++i<a.length;)
            System.out.print(a[i]);
    }

    static void test3(){
        int $[]= {1,2,3};
        for(int _$A=-1; ++_$A<$.length;)
            System.out.print($[_$A]);
    }

    static void test4(){
        int i = 1;
        while(i<4)
            System.out.print(i++);
    }
    static void test5(){
        int i = 0;
        while(i<3)
            System.out.print(++i);
    }
    static void test6(){
        int i = 0;
        do{
            System.out.print(++i);
        }while(i<3);
    }
    public static void main(String[] args){
        test1();System.out.print("\n");
        test2();System.out.print("\n");
        test3();System.out.print("\n");
        test4();System.out.print("\n");
        test5();System.out.print("\n");
        test6();System.out.print("\n");
    }
    
}
