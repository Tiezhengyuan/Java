public class InterfaceVariable2 implements Animal{
    static int age;
    static{
        age=10;
    }
    public static void main(String[] args) {
        System.out.println(age);
        System.out.println(Tiger.age);
        System.out.println(Animal.age);
    }
}

interface Tiger extends Animal{
    static int age=1;
}

interface Animal{
    static int age=0;
}
