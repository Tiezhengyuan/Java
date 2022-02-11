public class InterfaceStatic implements Animal{
    public static void main(String[] args) {
        Animal.getName();
    }    
}

interface Animal{
    static void getName(){
        System.out.println("animal");
    }
}
