// lambda function introducted in Java 8
// functional programming: pass function as argument into method
// That method is called reusable and abstract process.

public class LambdaDefine{
    // 1. define functional interface
    // interface defines a single method/funcion.
    // 2. define abstract method using the interface
    // pass two arguments and one funcion interface
    // certain function/code is abstracted into a funcion
    int operate(int a, int b, MathOperation m){
        // use the funcion defined in the interface
        return m.operation(a, b);
    }

    public static void main(String[] args){
        LambdaDefine c1 = new LambdaDefine();
        int res;
        // 3. call method by passing various lambda functions
        // the approaches for defining lambda are equal
        res = c1.operate(10,5, (a,b) -> a-b);
        System.out.println("pass subtraction fucnion:" + res);

        res = c1.operate(10,5, (a,b) -> { return a+b; });
        System.out.println("pass sum fucnion:" + res);

        res = c1.operate(10,5, (int a, int b) -> a*b);
        System.out.println("pass multiply fucnion:" + res);

        MathOperation division = (int a, int b) -> { 
            if (b != 0)  return a/b;
            return 0;
        };
        res = c1.operate(10,5, division);
        System.out.println("pass division fucnion:" + res);
    }
    
}

interface MathOperation {
    // the function like as abstract funcion
    // must pass two arguments and return int
    // other features could vary
    int operation(int a, int b);
}