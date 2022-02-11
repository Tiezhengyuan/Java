public class CastingConstructor extends Test{
    int age = 10;
    CastingConstructor(){
        System.out.println("casting");
    }
    public static void main(String[] args){
        Test c = new CastingConstructor();
    }
}

class Test{
    int age = 1;
    Test(){
        System.out.println("test");
    }
}
