import learn.Animal;
class Animal2 extends learn2.Animal{}

public class Injection5 {
    public static void main(String[] args){
        new Animal().go();
        new Animal2().go();
    }    
}
