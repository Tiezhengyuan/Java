public class MethodFinal extends Test{
    int test(){
        System.out.println("child");
        return 1;
    }
    public static void main(String[] args){
        MethodFinal d = new MethodFinal();
        d.test();
    }
    
}

class Test{
    private void test(){
        System.out.println("parent");
    }
}