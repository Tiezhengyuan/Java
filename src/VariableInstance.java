public class VariableInstance {
    int age;
    String name;
    char gender = 'F';
    String specie = "Animal";
    {
        gender = 'M';
    }
    VariableInstance(String name){
        this.name = name;
    }
    void print(){
        System.out.println(this.age);
        System.out.println(this.name);
        System.out.println(this.gender);
        System.out.println(this.specie);
    }
    public static void main(String[] args){
        new VariableInstance("tiger").print();
    }
}
