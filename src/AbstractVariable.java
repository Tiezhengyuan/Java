public class AbstractVariable {
    public static void main(String[] args) {
        duck c  = new duck();
        c.print();
    }
    
}

abstract class bird{
    static int wings=2;
    int legs=0;
}

class duck extends bird{
    int wings;
    duck(){
        System.out.println(wings);
        wings=10;
    }
    void print(){
        System.out.println(wings);
        System.out.println(this.wings);
        System.out.println(super.wings);
    }
}