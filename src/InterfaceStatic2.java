public class InterfaceStatic2 implements Fruit{
    public static void getName(){
        System.out.println("test");
    }
    public static void main(String[] args) {
        Animal.getName();
        getName();
    }    
}

interface Fruit{
    static void getName(){
        System.out.println("animal");
    }
}
