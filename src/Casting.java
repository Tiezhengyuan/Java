public class Casting extends Test{
    int age = 10;
    int getAge(){
        return this.age*2;
    }
    public static void main(String[] args){
        Test c = new Test();
        System.out.println(c.getAge());
        c = new Casting();
        System.out.println(c.getAge());
    }
}

class Test{
    int age = 1;
    int getAge(){
        return this.age;
    }
}
