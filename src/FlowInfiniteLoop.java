public class FlowInfiniteLoop {
    // infinite loop
    static void test1(){
        while(true){
            break;
        }
    }

    static void test2(){
        for(;;){
            break;
        }
    }

    // The approaches are bug
    static void test3(){
        int i=0;
        while(i<3){
            i=i++;//i is always equal to 0.
            System.out.print(i);
            break;
        }
    }

    static void test4(){
        int i=-10; // wrong initial
        while(i != 0){
            i--;
            break;
        }
    }

    static void test5(){
        do{
            int i =1;// i is local variable
            System.out.println(i++);
        }while(i<=10);//compiling error
    }
    public static void main(String[] args){
        test1();
        test2();
        test3();
        test4();
        // test5();
    }
    
}
