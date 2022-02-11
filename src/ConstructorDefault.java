/*
1. constructor is a special method, which initializes instant variables
2. constructor may be omitted. compiling will automaticall 
 define default constructor.
2. super(..) must be put on the top of constructor of derived class 
    if initialization of base class needs arguments.
2. constructor must have same name as class name
3. constructor should not contain return statement.Or that will be 
    taken as method
*/

public class ConstructorDefault {
    public static void main(String[] args){
        // default constructor
        new A1();
        new A2();
        new A3();

        // some other variants will not cause compiling exception.
        // They are not suggested.
        // Don't use same name with constructor
        new B1();
        new B2();
        new B3();
    }
    
}

// The three definitions are equal
class A1{}
class A2{ A2(){} }
class A3{ A3(){super();} }

class B1{
    B1(){
        System.out.println("constructor B1");
    }
    // it is not constructor but method 
    void B1(){
        System.out.println("B1");
    }
}
class B2{
    // it is not constructor but method
    void B2(){
        System.out.println("B2");
        return;
    }
}

// dont need to add return to constructor but compiling is ok.
class B3{
    B3(){
        System.out.println("constructor B3");
        return;
    }
}
