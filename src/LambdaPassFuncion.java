public class LambdaPassFuncion {
    int age;
    // define interface
    interface Predicate{
        boolean test(LambdaPassFuncion panda);
    }
    // define method
    private static void Check(LambdaPassFuncion panda, Predicate pred){
        String res = pred.test(panda) ? "match" : "not";
        System.out.println(res);
    }
    public static void main(String[] args) {
        LambdaPassFuncion p1 = new LambdaPassFuncion();
        p1.age =1;
        LambdaPassFuncion.Check(p1, p -> p.age < 5);
    }
    
}
