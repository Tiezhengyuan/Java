public class VariableInstance3{
    Test t1 = new Test();
    public static void main(String[] args) {
        VariableInstance3 t = new VariableInstance3();
        System.out.println(t.t1.name);
    }
    {
        t1.name = "na";
    }
}

class Test{
    String name = "test";
}
