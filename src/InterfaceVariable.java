/*
1. all interface variables assumed to be public static final variables
even if they not explicitly declared
2. interface variables can't be overridden but hidden by concrete class
*/

/* all the approaches below are equal
        int weight=1;
        public int weight=1;
        static int weight=1;
        final int weight=1;
        public static final int weight=1;
*/
interface MyVariable{
    // access: default/public
    // protected/private is wrong
    int weight=1;
    static int height=2;
    /* not compiling below because initializers are not allowed in interface
    static int height;
    static { 
        height = 2;
    }
    */
}

public class InterfaceVariable implements MyVariable{
    int weight = 10;
    int height = 20;
    public static void main(String[] args){
        InterfaceVariable a = new InterfaceVariable();
        //hide interface variable
        a.weight =21;
        System.out.println(a.weight);
        System.out.println(a.height);
        // implement interface variable
        //wrong: MyVariable.weight=34;
        System.out.println(MyVariable.weight);
        System.out.println(MyVariable.height);
        // super. is not working because interface variables are static
        //wrong: System.out.println(super.weight);
        //wrong: System.out.println(super.height);

        // casting interface
        //implement interface variable because they can't be overridden
        MyVariable b = new InterfaceVariable();
        System.out.println(b.weight);
        System.out.println(b.height);
    }
}
