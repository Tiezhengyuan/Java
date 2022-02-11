
// define interface
// access identifier have not impact here.
interface MyInterface{
    // not body
    default void print();

    //here body is useless though no compiling error
    void getHeight(){
        System.out.println("height");
    }
}

public class InterfaceDefine implements MyInterface{
    // access must be public when implementing interface
    public void print(){
        System.out.println("concrete1");
    }
    public static void main(String[] args){
        System.out.println("concrete class:");
        InterfaceDefine c1 = new InterfaceDefine();
        c1.print();
        // getHeight() must be concreted in InterfaceDefine
        //execution error: c1.getHeight();
        
        System.out.println("\nCasting interface:");
        MyInterface c2 = new InterfaceDefine();
        c2.print();
        // getHeight() must be concreted in InterfaceDefine
        //execution error: c2.getHeight();

        // instantiation is ok but print() will not work
        Object c3 = new InterfaceDefine();
        //wrong c3.print();

        // interface can't be instantiated.
        // execution error: MyInterface c4 = new MyInterface();
        // interface methods can't make static reference to non-static method
        // not compiling: MyInterface.getHeight();

    }
}

