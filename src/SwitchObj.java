public class SwitchObj {
    static void test(Object obj) throws Exception{
        switch(obj.getClass().getSimpleName()){
            case "A":
                System.out.print("object A"); break;
            case "B":
                System.out.print("object B"); break;
            default:
                throw new IllegalArgumentException("wrong object");
        }
        System.out.print("\n");
    }
    public static void main(String[] args) throws Exception {
        test(new A());
        test(new B());
        test(new StringBuilder1("ABC"));
    }
    
}

class A{}
class B{}
