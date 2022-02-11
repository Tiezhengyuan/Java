public class ClassTest extends Beetle{
    public int getLegs(){
        System.out.println("Legs of Test");
        return 10;
    }
    public static void main(String[] args){
        ClassTest t = new ClassTest();
        t.getLegs();
    }
}

abstract class Beetle implements Insect{
    public int getLegs(){
        System.out.println("Legs of beetle");
        return 10;
    }
}

interface Insect {
    int getLegs();
}


