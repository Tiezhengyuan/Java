import java.util.List;
import java.util.ArrayList;

public class Casting3 {
    public static void main(String[] args){
        List<Whale> list = new ArrayList<>();
        list.add(new Whale());
        list.add(new Narwhal());
        for( Whale t: list){
            System.out.print(t.getName() + " ");
            System.out.print(t.getType() + " ");
        }
    }
}

interface HasTail {
    String getName();
}
class Mammal {
    String getName(){
        return "mammal";
    }
    String getType(){
        return "general";
    }
}
class Whale extends Mammal implements HasTail {
    public String getName(){
        return "whale";
    }
}
class Narwhal extends Whale {
    public String getName(){
        return "narwhal";
    }
    String getType(){
        return "specie";
    }
}