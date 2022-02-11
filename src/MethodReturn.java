public class MethodReturn extends Test {
    void test1(){}
    void test2(){;}
    void test3(){return;}

    MethodReturn test5(){
        System.out.println("child");
        return new MethodReturn();
    }
    Test test6(){
        System.out.println("child");
        return new Test();
    }
    public static void main(String[] args) {
        MethodReturn c = new MethodReturn();
        c.test1();
        c.test2();
        c.test3();
        c.test5();
        c.test6();
    }
}

class Test{
    Test test5(){
        System.out.println("parent");
        return new Test();
    }
    Object test6(){
        System.out.println("parent");
        return new Test();
    }
}