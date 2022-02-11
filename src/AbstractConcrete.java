public class AbstractConcrete{
    public static void main(String[] args) {
        duck c  = new duck();
        c.print();
    }
    
}

abstract class bird{
    void print(){
        System.out.println("bird");
    }
}

class duck extends bird{
}