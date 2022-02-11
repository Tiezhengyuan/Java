public class Method2 {
    int age = 10;
    float calAgeRate(){
        return (float) this.age * 10;
    }
    float getTotal(){
        float age_rate = this.calAgeRate();
        // float age_rate = calAgeRate();
        return age_rate * .1f;
    }
    public static void main(String[] args){
        Method2 c = new Method2();
        System.out.println(c.getTotal());
    }
}
