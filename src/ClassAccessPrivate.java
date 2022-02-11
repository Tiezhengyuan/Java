
import learn.*;

public class ClassAccessPrivate extends InheritanceAccess{
    private int a;
    private ClassAccessPrivate(int a){
        super(100);
        this.a = a;
    }
    private void Print(){
        System.out.println(this.a);
    }
    public static void main(String[] args){
        //1: same class
        // class, attritbue, constructor, methods could be 
        // "private", "package private", "protect", or "public"
        // accessed within the same class
        // access private constructor
        ClassAccessPrivate c = new ClassAccessPrivate(4);
        // access private method
        c.Print();
        // acccess private attribute
        System.out.println(c.a);

        //2: apply other class in same file.
        // use default access identifier-package private. 
        // class, constructor,method could be 
        // "package private", "protect" or "public"
        // attributes could be private, or package private if necessary
        OwnClass s = new OwnClass(10);
        s.Print();
        System.out.println(s.c);
        // not compiling: System.out.println(s.b);

        // 3: same package same as the above
        // for default package: dont need to import them
        packageClass p = new packageClass(20);
        p.Print();
        System.out.println(p.c);
        
        // 4: inheritance
        // class, constructor, methods must be "protect" or "public"
        ClassAccessPrivate c2 = new ClassAccessPrivate(4);
        c2.SuperPrint();
        System.out.println(c2.c);

        // 5: different package
        // class, constructor, methods must be "public"
        OtherPackage t = new OtherPackage(13);
        t.Print();
        System.out.println(t.c);
    }
}

// should remove "public" from class definition
// Private access is not working.
// wrong: public class PrivateClass{...}
class OwnClass{
    private int b;
    int c;
    // wrong: private PrivateClass(int b){...}
    OwnClass(int b){
        this.b = b;
    }
    // wrong: private void Print(){...}
    void Print(){
        System.out.println(this.b);
    }
}