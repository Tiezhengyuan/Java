/*
1. In child class, constructor may be omitted. 
super() may be omitted if parent constructor hasn't arguments.
2.if parent class have argument constructor, child class
 must define constructor, and explicitly instantiate it using super().
 3. inherit various parent constructor if there are multiple parent constructor.
*/
public class ConstructorSuper {
    public static void main(String[] args){
        Mammal b1 = new Mammal("male");
        b1.Print();
        Mammal b2 = new Mammal();
        b2.Print();
    }
    
}

class Mammal extends Animal{
    String gender;
    Mammal(String gender){
        // can't be ommitted
        // should place it on the first statemennt
        super(1);
        this.gender = gender;
    }
    Mammal(){
        // use different parent constructor.
        super("living");
        this.gender = "NA";
    }
    void Print(){
        System.out.print(this.age);
        System.out.print(this.gender);
        System.out.println(this.status);
    }
}

class Animal{
    int age;
    String status;
    Animal(int age){
        this.age = age;
    }
    Animal(String status){
        this.status = status;
    }
}