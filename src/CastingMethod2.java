public class CastingMethod2{
    public static void main(String[] args) {
        X x = new Y(); 
        x.do1();     
        ((Y)x).do1();
        ((Y)x).do2();
    }
}

class X{
    void do1(){
        System.out.print("X");
    }
}

class Y extends X{
    void do2(){
        System.out.print("Y");
    }
}
