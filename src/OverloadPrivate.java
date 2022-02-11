/*
1. private parent method can't be overridden by child method
*/
public class OverloadPrivate {
    // private methods are invisible to child class 
    private void test(){
        System.out.println("parent method");
    }
    private void test2(){
        System.out.println("parent method");
    }
    public static void main(String[] args){
        // implement parent method because it is private
        OverloadPrivate c = new TestPrivate();
        c.test();
        c.test2();

        TestPrivate d = new TestPrivate();
        // parent private is invisible to child object
        d.test(); 
        //not compiling can't override private methods
        // d.test2();
    }
    
}

class TestPrivate extends OverloadPrivate {
    public void test(){
        System.out.println("child method");
    }
    private void test2(){
        System.out.println("child method");
    }
}
