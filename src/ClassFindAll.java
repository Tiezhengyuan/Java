import java.util.ArrayList;
import java.util.List;

interface CanSwim {}
class Amphibian implements CanSwim {}
class Tadpole extends Amphibian {}

public class ClassFindAll{
    public static void main(String[] args) {
        List<Tadpole> tadpoles = new ArrayList<Tadpole>();
        for(Tadpole amphibian : tadpoles) {
            Tadpole t1 = amphibian;
            Amphibian t2 = amphibian;
            CanSwim t3 = amphibian;
            Object t4 = amphibian;
        }
    }
}