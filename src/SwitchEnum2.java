public class SwitchEnum2 {
    enum O{ A, B}
    static void test1(O d){
        switch(d){
            case A:
                new A();  break;
            case B:
                new B(); break;
        }
        System.out.print("\n");
    }
    public static void main(String[] args) {
        test1(O.A);
    }
}

class A{
    A(){
        System.out.println("class A");
    }
}
class B{
    B(){
        System.out.println("class B");
    }
}

