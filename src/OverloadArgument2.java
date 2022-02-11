public class OverloadArgument2 {
    static void go(Object a){
        System.out.println("Object");
    }
    static void go(Integer a){
        System.out.println("Integer");
    }
    static void go(float a){
        System.out.println("float");
    }
    public static void main(String[] args){
        Integer a= Integer.valueOf(3);
        go(a); // Integer
        short b =3;
        go(a); //convert short to int and then autoboxing
        go(3.3); // convert double to object;
        go("abc"); // convert double to object;
        go(null); //Integer 
    }
}