public class InheritanceMethods {
    public static void main(String[] args){
        Shark c = new Shark(10);
        c.Print();    // child method override parent method
        c.getRate();// apply parent method
        c.calLevel(4); // can't override due to arguments difference 
    }
    
}

class Fish{
    protected int size = 10;
    private int age;
    Fish(int age){
        this.age = age;
    }
    void Print(){
        System.out.print("parent-method="+this.age);
        System.out.println(this.size);
    }
    void getRate(){
        System.out.print("parent-method="+this.age*this.size);
    }
    int calLevel(int level){
        return this.size * level;
    }
}

class Shark extends Fish{
    private int number = 8;
    Shark(int age){
        super(age);
        this.size=4;
    }
    // override parent methods
    //have same name, arguments, return identifier
    void Print(){
        //not compiling: System.out.print(this.age);
        System.out.print("child method="+this.size);
        System.out.println(this.number);
    }
    int calLevel(){
        return this.size * 2;
    }
}
