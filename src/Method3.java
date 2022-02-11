public class Method3 extends Test{
    int age = 10;
    float calAgeRate(){
        return (float) this.age * 10;
    }
    float getTotal1(){
        float age_rate = calAgeRate();
        return age_rate * .1f;
    }
    float getTotal2(){
        float age_rate = super.calAgeRate();
        return age_rate * .1f;
    }
    public static void main(String[] args){
        Method3 c = new Method3();
        System.out.println(c.getTotal1());
        System.out.println(c.getTotal2());
    }
}

class Test{
    int age = 10;
    float calAgeRate(){
        return (float) this.age * 15;
    }
}
