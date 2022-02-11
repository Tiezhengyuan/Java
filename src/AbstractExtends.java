public class AbstractExtends extends Tiger{
    int age = 10;
    int getAge(){
        System.out.println(this.age);
        return this.age;
    }
    public static void main(String[] args){
        AbstractExtends c = new AbstractExtends();
        c.getAge();
        System.out.println(c.getName());
    }
}

class Animal{
    String getName(){
        return "animal";
    }
}

abstract class Tiger extends Animal{
    abstract int getAge();
}

