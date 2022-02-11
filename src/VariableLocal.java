public class VariableLocal {
    int a=10;
    // use instant variable
    // not duplicate name: a and this.a are equal
    void test1(){
        a+=10;
        System.out.println(a);
    }
    void test2(){
        System.out.println(this.a);
    }

    // local variable
    void test3(){
        int a = this.a;
        // not compiling:
        // can't omit this.: int a = a;
        System.out.println(a);
        System.out.println(this.a);
    }
    void test4(int a){
        a = a;
        // not compiling:
        // can't repeat initial: 'int a = a;
        System.out.println(a);
        System.out.println(this.a);
    }

    public static void main(String[] args){
        VariableLocal c = new VariableLocal();

        c.test1();
        c.test2();
        c.test3();
        c.test4(1);
    }
}
