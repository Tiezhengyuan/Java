public class OverloadArgument1 {
    static void go(int a){
        System.out.println("int");
    }
    static void go(double a){
        System.out.println("double");
    }
    public static void main(String[] args){
        go(3); // exact match
        short a =3;
        go(a); //convert short to int
        go(3.3f); // convert folat to double;
    }
}
