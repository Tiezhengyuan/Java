
/*
casting interface is not working for static methods in interface
 */

interface GInterface{
    //static
    static void drink(){};
    static void eat(){
        System.out.println("interface eat.");
    }
    static void run(){
        System.out.println("interface run.");
    }
}

public class InterfaceAbstract implements GInterface{
    // concrete static method
    public static void drink(){
        System.out.println("concrete drink");
    }
    // hide interface static method though body in parent is defined
    public static void eat(){
        System.out.println("concrete eat.");
    }

    public static void main(String[] args){
        System.out.println("concrete class:");
        InterfaceAbstract c1 = new InterfaceAbstract();
        c1.drink();
        c1.eat();
        // subclass doesn't concrete the method
        // execution error: c1.run();


        System.out.println("\nCasting interface:");
        GInterface c2 = new InterfaceAbstract();
        // try to implement MyInterface.drink() because that is static method
        // but can't access MyInterface.drink() because there is not body defined.
        //execution error: c2.drink();
        // execution error: c2.eat();

        // implement static method in interface
        GInterface.eat();
        GInterface.run();

    }
}

