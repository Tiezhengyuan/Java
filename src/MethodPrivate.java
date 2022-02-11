public class MethodPrivate extends Test{
    void test(){
        System.out.println("child");
    }
    public static void main(String[] args){
        Test t = new MethodPrivate();
        t.test();
    }
}

class Test{
    private void test(){
        System.out.println("parent");
    }
}