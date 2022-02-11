public class InheritancePolyParams {
    static void feed(Reptile reptile){
        System.out.println("feed " + reptile.getName());
    }
    public static void main(String[] args){
        feed(new Reptile());
        // cast parent to child
        // parent virtual method is overridden
        feed(new Alligator());
        feed(new Crocodile());
    }
}

class Reptile{
    String getName() {
        return "repile";
    }
}

class Alligator extends Reptile{
    String getName() {
        return "alligator";
    }
}

class Crocodile extends Reptile{
    String getName() {
        return "crocodile";
    }
}
