/*
final method can't be overridden
*/
public class OverloadFinal {
    void test(){
    // final void test(){
        System.out.println("parent method");
    }
    public static void main(String[] args){
        OverloadFinal c = new TestFinal();
        c.test();
    }
    
}

class TestFinal extends OverloadFinal{
    void test(){
        System.out.println("child method");
    }
}


