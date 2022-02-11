// this() represent other constructor.
// this() may always be the first statement
public class ConstructorChaining {
    private String name;
    private int age=10;
    // constructor chaining
    public ConstructorChaining(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("#2");
    }
    public ConstructorChaining(String name){
        // this.name = name;
        // this.age = 10;
        this(name, 10);
        System.out.println("#1");
    }
    public ConstructorChaining(){
        // this.name = "NA";
        // this.age = 0;
        this("NA", 10);
        System.out.println("#0");
    }


    public void Print(){
        System.out.print(this.name);
        System.out.println(this.age);
    }
    public static void main(String[] args){
        new ConstructorChaining().Print();
        new ConstructorChaining("single").Print();
        new ConstructorChaining("two", 34).Print();
    }
    
}
