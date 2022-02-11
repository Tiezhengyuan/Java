public class ObjectGarbage {
    public static void main(String[] args){
        Test d = new Test();
        System.out.println(d.a);
        Test d1 = d.do1(d);
        System.out.println(d1.a);
        Test d2 = d.do2(d);
        System.out.println(d1.a);
        System.out.println(d.a);
    }
}

class Test{
    int a =0;
    Test do1(Test cb){
        a =1;
        return cb;
    }
    Test do2(Test cb){
        cb = null;
        a=2;
        return cb;
    }

}
