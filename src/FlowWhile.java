/*
    while(<expression>){
        ...
    }

    d0{
        ...
    }while(<expression>)
*/
public class FlowWhile {
    // while approach
    static void test1(){
        int i=0, a[] = {1,2,3};
        while(i<a.length){
            System.out.print(a[i]);
            i++;
        }
        System.out.println("");
    }

    static void test2(){
        int i=0, a[] = {1,2,3};
        do{
            System.out.print(a[i]);
            i++;
        }while(i<a.length);//don't forget ; 
        System.out.println("") ;
    }

    static void test3(){
        int i=0, a[] = {1,2,3};
        while(i<a.length)
            System.out.print(a[i++]);
        System.out.println("");
    }

    static void test4(){
        int i=-1, a[] = {1,2,3};
        while(i++<a.length-1)
            System.out.print(a[i]);
        System.out.println("");
    }
    public static void main(String[] args){
        // the approaches are equal
        test1();
        test2();
        test3();
        test4();
    }
    
}
