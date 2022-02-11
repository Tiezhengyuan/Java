public class AbstractAccess extends testAccess{
    void fly(){
        System.out.println("abstract is flying");
    }
    public static void main(String[] args){
        AbstractAccess d = new AbstractAccess();
        d.fly();
    }
    
}

abstract class testAccess{
    private void fly();
}
