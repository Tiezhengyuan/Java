public class StaticMethods {
    String name;
    int age;

    public StaticMethods(){
        this.name = "good";
        this.age = 10;
    }
    public static void getName(){
        System.out.println("good");
        // not compiling: can't use non-static variable in static method
        // System.out.println(name);
        // System.out.println(this.name);
    }
    public void getAge(){
        System.out.println(this.age);
    }
    // static method
    public static void Print(){
        System.out.println("good");
    }
    // mix static and non static methods
    public static void getAttrs(){
        // use static method in static method
        getName();
        // use non-static method in static method
        new StaticMethods().getAge();
        // not compiling without instantiation 
        // getAge();

    }
    public static void main(String[] args){
        // how to call static method
        // 1. instance
        StaticMethods c = new StaticMethods();
        c.Print();
        // 2. simplified instance
        new StaticMethods().Print();
        // 3. direct reference
        StaticMethods.Print();

        // In hybrid static methods, non-static 
        // methods must be instantiation before use.
        StaticMethods.getAttrs();

    }
}
