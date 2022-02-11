/*
abstract class
1. abstract class including abstract methods declare abstract. 
   it can non-abstract methods or propteies.
2. cannot be instantiated. Concrete class extends 
   abstract class, implements abstract methods.
3.  can be subclass or extends other abstract class. 
4. No multiple inheritance:  extends only one abstract class
4. public/default is ok. not private/protected/final

abstract methods
1. must be defined in abstract class, and no method body is defined.
2. public/defual/protected is ok. not private/final
3. can't be implemented before concrete it.
  concrete methods must have same method name, arguments and return
4. static abstract methods is ok.

Application : Improve compability.
abstract class define concepts which is stable. 
concrete class concrete concepts of which features/scope may vary. 
1. methods may vary in various senario.
2. methods need mulitple version.
3. define coding rule for future coding work. 
*/
public class AbstractClass {
    public static void main(String[] args){
        Beetle b = new Beetle();
        b.getLegs();
        b.getSections();
    }
}


interface HasExo{
    abstract int getSections();
}

// define abstract class and methods
abstract class Insect implements HasExo{
    // starts with abstract and no method body
    abstract int getLegs();
}

// extends abstract class
class Beetle extends Insect{
    // concrete abstract methods
    int getLegs(){
        System.out.println("number of legs");
        return 10;
    }
    // for interface: public access must be added.
    public int getSections(){
        System.out.println("number of sections");
        return 10;
    } 
}
