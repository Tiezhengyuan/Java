/*
1. static parent method can't be overridden 
    if child method is non static method
2. static parent method can be hidden
    if child method is static.
*/
public class OverloadStatic {
    static void print(){
        System.out.println("parent method");
    }
    static void test(){
        System.out.println("parent method");
    }
    public static void main(String[] args){
        // can't overdden: implement parent method
        OverloadStatic c1 = new TestStatic();
        c1.print();
        c1.test();

        TestStatic c2 = new TestStatic();
        // not compiling: can't override
        // c2.print();
        // hide parent method if child method is static,too
        c2.test();
        
    }
    
}

class TestStatic extends OverloadStatic {
    void print(){
        System.out.println("child method");
    }
    static void test(){
        System.out.println("child method");
    }

}
