public class InterfaceExtends extends MyAbstract{
    public void print(){
        System.out.println("concrete: print");
    }
    public void test(){
        System.out.println("concrete: test");
    }
    public static void main(String[] args){
        InterfaceExtends c = new InterfaceExtends();
        c.print();
        c.test();
    }
}

abstract class MyAbstract implements Test{
    abstract void print();
    public void test(){
        System.out.println("abstract: test");
    }
}

interface Test{
    void test();
}