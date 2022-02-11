public class MethodCast extends Test{
    int age = 10;
    float calRate(){
        return (float) this.age * 10;
    }
    int getAge(){
        return this.age*2;
    }
    public static void main(String[] args){
        Test c = new Test();
        System.out.println(c.calRate(.15f));
        
        c = new MethodCast();
        System.out.println(c.calRate(.15f));
        // wrong: System.out.println(c.calRate());  
        System.out.println(c.getAge());

    }
}

class Test{
    int age = 1;
    float calRate(float rate){
        return (float) this.age * rate;
    }
    int getAge(){
        return this.age;
    }
}
