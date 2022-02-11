public class StaticInitial {
    // pattern 1: initialized in constructor
    // Not suggested. usually remove static
    static int a;
    StaticInitial(){
        a = 1;
    }
    
    // pattern 2: initialized at static block
    static int b;
    static {
        b = 2;
        // static variable can't be updated.
        //No exception but does not work. 
        a=3;
    }

    //pattern 3: initialized at declaration
    public static int c = 3;

    //pattern 4: initialized after class object is instantiated.
    public static int d;
    // default e=0 if it is not initialized
    static int e;
    // static can't be updated after initialization
    static final int f=8;
    // static {        f=8;    }

    // 
    static int g=7;
    { g=77;}

    void Print(){
        // non-static approach. no error but warning
        // System.out.print(this.a);
        // static way
        System.out.print(a);
        System.out.print(b);
        System.out.print(c);
        System.out.print(d);
        System.out.print(e);
        System.out.print(f);
        System.out.println(g);
    }
    // 
    public static void main(String[] args){
        // static variable must be initialized
        // initialize static variable
        StaticInitial s = new StaticInitial();
        s.d = 4; s.Print();

        //After initialization
        // public static variable can be updated
        s.c=9; s.d=10; s.Print();
        // not compiling because f is final
        // s.f=8;
        
        // create another new object
        //static variables are consistent 
        // static variables can be updated.
        StaticInitial s1 = new StaticInitial();
        s1.Print();
        s1.c=10; s1.d=9; s1.Print();

        // 
        System.out.print(StaticInitial.g);
    }
}
