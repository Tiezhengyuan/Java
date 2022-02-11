public class InitialOrder2 extends Tiger{
    public static void main(String[] args){
        new InitialOrder2();
    }
}

class Tiger extends Mammal{
    Tiger(){
        System.out.print("tiger ");
    }
}

class Mammal extends Animal{
    Mammal(){
        System.out.print("mammal ");
    }
}

class Animal{
    Animal(){
        System.out.print("animal ");
    }
}