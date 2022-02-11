public class InitialOrder1 extends Tiger{
    public static void main(String[] args){
        InitialOrder1 d = new InitialOrder1();
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