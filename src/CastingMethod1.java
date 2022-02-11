public class CastingMethod1 {
    public static void main(String[] args) {
        X x = new Y(); 
        x.do1();     
        ((Y)x).do1();
        ((X)x).do1();
    }
}

class X{
    void do1(){
        System.out.print("X");
    }
}

class Y extends X{
    void do1(){
        System.out.print("Y");
    }
}
