public class StaticMethod2 {
    static void test1(){
        System.out.println("test1");
    }
    public static void main(String[] args) {
        // invoke static methods
        // method 1:  class name+method name
        StaticMethod2.test1();
        // method 2: method name within this class
        test1();

        // method 3: instance method
        new StaticMethod2().test1();
    }
}
