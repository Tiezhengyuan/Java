public class AbstractInheritance{
    public static void main(String[] args){
        Beetle b = new Beetle();
        b.getLegs();
        b.getSections();
    }
}


interface Life{
    abstract int getSections();
}

abstract class Insect  implements Life{
    abstract int getLegs();
}

class Beetle extends Insect{

    int getLegs(){
        System.out.println("number of legs");
        return 10;
    }
    public int getSections(){
        System.out.println("number of sections");
        return 10;
    } 
}
