public class Method1 {
    int age;
    Method1(){
        age=10;
    }
    void setAge(int age){
        this.age=age;
    }
    int getAge(){
        return this.age;
    }
    public static void main(String[] args){
        Method1 c = new Method1();
        c.setAge(20);
        System.out.println(c.getAge());
    }
}
