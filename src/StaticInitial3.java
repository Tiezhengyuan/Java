public class StaticInitial3 extends Test{
    static int age = 7;
    public static void main(String[] args) {
        new Test().go(age);
        System.out.println(Test.age);
    }
}

class Test{
    static int age;
    Test(){
        this.age += 1;
    }
    void go(int age){
        age++;
    }
}
