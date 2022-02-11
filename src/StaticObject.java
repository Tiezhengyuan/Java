// import rope.*;
// import static rope.Rope.*;

public class StaticObject {
    // instantialize static object 
    // can't do that in main()
    static Rope r1 = new Rope();
    static Rope r2 = new Rope();
    public static void main(String[] args) {
        // static object
        r1.Print();

        // update static object
        // but not suggested
        r1.length=3;
        r2.Print();

        // not compiling
        // static Rope r3 = new Rope();
    }
    
}

//In the samel file, remove public identifier or not compiling
// use public identifier if in different file.
class Rope{
    public static int length = 1;
    public int width = 2;
    public void Print(){
        // static way
        System.out.print(length);
        // non-static way
        System.out.println(this.width);
    }
}
