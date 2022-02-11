public class Garbage2 {
    public static void main(String[] args) {
        new Wind(1).go();
    }
}

class Wind{
    int id;
    Wind(int i){
        id=i;
    }
    void go(){
        Wind w1=new Wind(1);
        Wind w2=new Wind(1);
        System.out.println(w1.hashCode());
        System.out.println(w2.hashCode());
    }
}
