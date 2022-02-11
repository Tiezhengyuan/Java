public class Garbage4 {
    public static void main(String[] args) {
        Test[] da = new Test[3];
        System.out.println(da);
        System.out.println(da[0]);
        da[0] = new Test();
        System.out.println(da[0]);
        Test d = new Test();
        System.out.println(d);
        da[1] = d;
        System.out.println(da[1]);
        d = null;
        da[1] = null;
        // LineX;
    }
}

class Test{
    int x;
    Test(){
        x = 1;
    }
}