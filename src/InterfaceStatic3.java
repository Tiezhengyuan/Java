public class InterfaceStatic3 implements Animal{
    public static void getName(){
        System.out.println("test");
    }
    public static void main(String[] args) {
        Animal.getName();
        getName();
    }    
}

interface Animal{
    static void getName(){
        System.out.println("animal");
    }
}
