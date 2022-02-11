import learn.Rope;

public class StaticClass {
    private static Rope r1 = new Rope();
    private static Rope r2 = new Rope();
    // executed only when instantiation
    {
        System.out.println(r1.length);
    }
    public static void main(String[] args) {
        r1.length += 2;
        System.out.println(r1.length);
        r2.length += 8;
        System.out.println(r1.length);
        
        new StaticClass();
    }    
}
