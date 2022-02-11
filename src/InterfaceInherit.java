public class InterfaceInherit implements MyInterface{
    public void print(){
        System.out.println("concrete: print");
    }
    public void test(){
        System.out.println("concrete: test");
    }
    public static void main(String[] args){
        InterfaceInherit c = new InterfaceInherit();
        c.print();
        c.test();
   }
}

interface MyInterface extends Test{
    void print();
}

interface Test{
    void test();
}