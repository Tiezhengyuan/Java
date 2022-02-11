public class ClassReturn {
    public static void main(String[] args){
        new Beaver().chew();

    }
}


class Rodent {
    protected Number chew(){
            System.out.println("Rodent is chewing");
            return 1;
    }
}
class Beaver extends Rodent {
    Integer chew(){
            System.out.println("Beaver is chewing on wood");
            return 2;
    }
}