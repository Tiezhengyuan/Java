/**
 * Overriding 
 * 1. implements Runtime Polymorphism.
 * the method call is determined at the runtime based on the object type.
   If overriding breaks, the effect is only visible at runtime. 
 * 2.The method Overriding occurs between superclass and subclass.  
 * 3.Overriding methods have the same signature i.e. same name and method arguments.  
 * 
 * Overloading 
 * 1. implements Compile time polymorphism. 
 * method to call is determined at the compile-time. 
 * If overloading breaks, the failure could be fix at the compile-time.
   2.Overloading occurs between the methods in the same class.
   3.Overloaded method names are the same but the parameters are different.


   same name, same arguments, same return:  override
   same name, different arguments, same return: overload
   same name, different arguments, different return: different methods
   same name, same arguments, different return: not compiling for override
 */

 

class task{
    //override: same name/argument/return
    void run(){
        System.out.println("parent run.");
    }
    // same name, different arguments/return
    int walk(){
        System.out.println("parent walk.");
        return 1;
    }
    //overload: same name and return, different argument
    int talk(){
        System.out.println("parent talk.");
        return 1;
    }
}

public class OverloadOverride extends task{
    // override: : argument and return same
    void run(){
        System.out.println("child run.");
    }
    // overload: argument and return are different
    void walk(int a){
        System.out.println("child walk");
    }
    int talk(int a){
        System.out.println("child talk");
        return a;
    }
    /* not compiling
    return type should be same
    void talk(){
        System.out.println("child talk");
    }
    */
    public static void main(String[] args) {
        OverloadOverride c = new OverloadOverride();        
        c.run();
        c.talk();

        c.walk();
        c.walk(4);
    }
    
}

