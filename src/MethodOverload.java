public class MethodOverload extends Test{
    int age = 10;
    float calAgeRate(){
        return (float) this.age * 10;
    }
    float getTotal(Integer rate){
        float age_rate = rate==null ? calAgeRate() : calAgeRate(rate);
        return age_rate * .1f;
    }
    public static void main(String[] args){
        MethodOverload c = new MethodOverload();
        System.out.println(c.getTotal(null));
        System.out.println(c.getTotal((Integer)16));
    }
}

class Test{
    int age = 10;
    float calAgeRate(Integer rate){
        return (float) this.age * rate;
    }
}
