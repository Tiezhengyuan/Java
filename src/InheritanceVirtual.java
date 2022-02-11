/*
except static/final/private methods, all methods are virtual methods
*/
public class InheritanceVirtual {
    public static void main(String[] args){
        // normon approach
        Peacock p = new Peacock();
        p.displayInfo();

        // casting object.
        // virthal method of child override those of parents.
        // private/static/final methods of parent can't be overridden
        Bird b = new Peacock();
        b.displayInfo();
    }
}

class Bird{
    // virtual method could be overridden
    String getName(){
        return "bird";
    }
    // static method can't be overridden
    // if remove static, they are different not related to overload
    static int getHeight(){
        return 2;
    }
    void displayInfo(){
        System.out.println("name is " + getName());
        System.out.println("height is " + getHeight());
    }
}

class Peacock extends Bird{
    // virtual method
    String getName(){
        return "peacock";
    }
    // don't override parent method
    static int getHeight(){
        return 10;
    }
}
