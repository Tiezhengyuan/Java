/*
object casting of abstract class
can'te override private or static method
*/
public abstract class CastingAbstract {
    private void fly(){
        System.out.println("parent is flying");
    }
    public static void main(String[] args) throws Exception {
        //Note: can'te override private or static method
        // use parent method though object casting
        CastingAbstract c = new Pelican();
        c.fly();

        Birds2 b = new Owl();
        // call owl.fly()
        b.fly();
        // call birds2.fly1() due to private child
        b.fly1();
    }
}

class Pelican extends CastingAbstract{
    protected void fly(){
        System.out.println("Pelican is flying");
    }
}

abstract class Birds2{
    // private is not working
    // or public /protected
    void fly(){
        System.out.println("bird is flying");
    }
    void fly1(){
        System.out.println("bird is flying");
    }
}
class Owl extends Birds2{
    // or public /protected
    void fly(){
        System.out.println("owl is flying");
    }
    private void fly1(){
        System.out.println("owl is flying");
    }
}
