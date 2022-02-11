public class StringTest {
    public static void main(String[] args) {
        String s = "(345) 456 -1234";
        String[] s2= s.split("[ -]");
        System.out.println(s2[0]);
    }
}

class A{}