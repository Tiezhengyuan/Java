// satitic final variable must be set exactly once
// initial could be in the decalaration line or static block
public class StaticFinal {
    //final static must be initialized
    // initialized at static block
    private static final String a;
    static {        a = "a";    }
    //not compiling not block is wrong
    // {a="a";}

    // initial when declaring
    private static final String b = "b";
    // can't update final
    // static { b = "bb"; }

    private static final String c;
    static {        c = "c";    }

    // update static by constructor.
    // can't use final identifier
    // avoid using static initializer which code is hard to read
    private static int x;
    StaticFinal(){
        x +=10;
    }
    public static void main(String[] args) {
        // can't initialize at main()
        // c = "c";

        // can't update
        // a="aa";

        // static vairalbe is initialized once
        StaticFinal c1 = new StaticFinal();
        c1.x += 10;
        System.out.println(c1.x);
        StaticFinal c2 = new StaticFinal();
        System.out.println(c2.x);
    }
    
}
