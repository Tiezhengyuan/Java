public class ConstructorTest{
    String name;
    ConstructorTest(String name) throws IllegalArgumentException{
        if(name != null){
            this.name = name;
        }else{
            throw new IllegalArgumentException("null");
        }
    }
    public static void main(String[] args){
        String a = null;
        ConstructorTest c = new ConstructorTest(a);
        System.out.println(c.name);
    }
}


