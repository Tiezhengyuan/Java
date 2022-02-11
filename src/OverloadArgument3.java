public class OverloadArgument3 {
    static void go(int a){
        System.out.println("int");
    }
    static void go(Object... args){
        System.out.println("varargs");
    }
    public static void main(String[] args){
        go();
        go((short)45);
        go(true, 34f, null);
    }
}
