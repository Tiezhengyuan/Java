/*
1. parent reference could points to child object 
  casting parent can invoke child methods 
  if parent class define those methods and access is default.
  public/protected/private access or not such method in parent cause no compiling
2. child reference can't points to parent object. cause ClassCastException
3. parent methods can't be static/final because parent methods should be overridden 
   child methods can't be static because child static hide the instance from parent.
*/ 
public class CastingObject extends Lemur{
    public static void main(String[] args){
        // upcasting child reference to parent reference
        // points to child object
        Primate p1 = new Lemur();
        // override parent methods and invoke child methods
        p1.print();
        //it is ok to invoke parent methods
        p1.getName();
        // can't access child-only attributes/methods
        //no compiling: System.out.println(p1.age);
        //no compiling: p1.getAge();

        Lemur c1 = new Lemur();
        // copy child reference to parent reference
        Primate p2 = c1;
        p2.print();
        // downcast parent reference to  child reference
        Lemur c2 = (Lemur) p2;
        c2.print();


        //can't promote child object to parent
        Primate p3 = new Primate();
        // compiling is ok but casue ClassCastException
        // Lemur c3 = (Lemur) p3;
        // Lemur c3 = (Lemur) new Primate();

        // 
        System.out.println("inheriatnce chains:");
        CastingObject d1 = new CastingObject();
        // parent method override grandparent
        d1.print();// lemur
        // object casting
        Primate p4 = new CastingObject();
        p4.print();
    }
    
}

// parent child class are concrete class
class Primate{
    //default access
    // not final/static
    void print(){
        System.out.println("Primate");
    }
    void getName(){
        System.out.println("Primate Name");
    }
}

class Lemur extends Primate{
    public int age =10;
    void print(){
        System.out.println("Lemur");
    }
    int getAge(){
        return this.age;
    }
}
