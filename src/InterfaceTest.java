public class InterfaceTest implements Test{
    public static void main(String[] args){
        Test t = (Test) new InterfaceTest();
        t.getName();
   }
}

interface Test{
    default void getName(){
        System.out.println("interface"); 
    }
}
