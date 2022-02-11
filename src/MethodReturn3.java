public class MethodReturn3 extends Tiger{
    static Animal test1(){
        System.out.println("tiger");
        return new Tiger();
    }
    static Animal test2(){
        System.out.println("animal");
        return new Animal();
    }
    public static void main(String[] args){
        test1();
        test2();
    }
}

class Animal{}
class Tiger extends Animal {}
