public abstract class AbstractCast {
    void fly(){
        System.out.println("abstract");
    }
    public static void main(String[] args){
        AbstractCast c = new Concrete();
        c.fly();
    }
    
}

class Concrete extends AbstractCast{
    void fly(){
        System.out.println("concrete");
    }
}
