public class VariableInstance2 extends Test{
    int age = 1;
    String name = "tiger";
    void print(){
        System.out.println(age);
        System.out.println(this.name);
        System.out.println(super.name);
    }
    public static void main(String[] args) {
        new VariableInstance2().print();
    }
}

class Test{
    String name = "animal";
}