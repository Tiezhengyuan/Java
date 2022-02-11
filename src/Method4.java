public class Method4 extends Test{
    int age = 10;
    float calAgeRate(){
        return (float) this.age * 10;
    }
    float getTotal(){
        float age_rate = calAgeRate();
        return age_rate * .1f;
    }
    float getTotal(float rate){
        float age_rate = this.calAgeRate();
        return age_rate * rate;
    }
    float getTotal(){
        float age_rate = calAgeRate();
        return age_rate * .5f;
    }
    public static void main(String[] args){
        Method4 c = new Method4();
        System.out.println(c.getTotal());
        System.out.println(c.getTotal(.16f));
    }
}
