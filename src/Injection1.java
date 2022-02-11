public class Injection1 {
    void test(){
        new Animal().go();
    }
    public static void main(String[] args) {
        Injection1 t = new Injection1();
        t.test();
    }
}

class Animal {
    void go(){
        System.out.println("animal");
    }
}