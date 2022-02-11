public class ConstructorOrderInherit {
    public static void main(String[] args){
        //  new Animals();
        // new Mammals();
        new Tiger();
    }
    
}

class Animals{
    int age;
    Animals(){
        this.age = 1;
        System.out.println("animal ");
    }
}

class Mammals extends Animals{
    Mammals(){
        super();
        System.out.println("mammal ");
    }
}

// order of base->derived->derived child
class Tiger extends Mammals{
    Tiger(){
        System.out.println("tiger ");
        // this. and super. are equal
        System.out.println(super.age);
        System.out.println(this.age);
    }
}
