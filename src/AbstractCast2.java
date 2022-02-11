public class AbstractCast2{
    public static void main(String[] args){
        Insect c = new Beetle();
        c.getLegs();
    }
}

abstract class Insect{
    abstract int getLegs();
}

class Beetle extends Insect{
    int getLegs(){
        System.out.println("Number of legs is ");
        return 1;
    }
}
