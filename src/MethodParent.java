public class MethodParent extends Test{
    int age = 10;
    float calAgeRate(){
        return (float) this.age * 10;
    }
    float getTotal1(){
        float age_rate = super.calAgeRate();
        return age_rate * .1f;
    }
    public static void main(String[] args){
        MethodParent c = new MethodParent();
        System.out.println(c.getTotal1());
    }
}

class Test{
    int age = 10;
    float calAgeRate(){
        return (float) this.age * 17;
    }
}
