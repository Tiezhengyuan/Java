public class StaticInitial2 extends Test{
    public static void main(String[] args) {
        Test c1 = new Test();
        System.out.print(c1.age);
        Test c2 = new Test();
        System.out.println(c2.age);
    }
}

class Test{
    static int age;
    Test(){
        this.age += 1;
    }
}
