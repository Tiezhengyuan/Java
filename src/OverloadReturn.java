public class OverloadReturn extends Test{
    void go(){
        System.out.println("no return");
    }
    public static void main(String[] args) {
        OverloadReturn t = new OverloadReturn();
        t.go();
        t.go(10);
    }
}

class Test{
    int go(int a){
        System.out.println("return " + a);
        return a;
    }
}