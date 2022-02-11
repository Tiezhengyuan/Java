public class MethodInherit1 extends Test{
    public static void main(String[] args) {
        new MethodInherit1().getName();
    }
}


class Test{
    void getName() throws RuntimeException{
        System.out.println("super");
    }
}