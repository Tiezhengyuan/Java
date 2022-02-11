/*
local variable is required to be initialized
instant/static variable is allowed to be initialized or not.
*/
public class VariableInit{
    int b; //instant variable
    void myfunc(){
        int a;// local variable
        // not compiling: local variable should be initialized
        // int x = a+a;
        int x =b+3; // b is instant variable
    }
    public static void main(String[] args){
        VariableInit d = new VariableInit();
        //but compiling is ok if myfunc() is not called
        d.myfunc();

        //default is zero if static int isn't initialized
        Test c = new Test();
        c.print();
    }
    
}

class Test{
    static int a, b;
    static {
        b=a+3;
    }
    void print(){
        System.out.println(a);
        System.out.println(b);
    }
}

