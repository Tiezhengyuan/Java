public class Garbage3 {
    public static void main(String[] args) {
        Wind w= new Wind(1);
        System.out.println(w.hashCode());
        Wind w2 = w.go(w);
        System.out.println(w2.hashCode());
        //lineX
    }
}

class Wind{
    int id;
    Wind(int i){
        id=i;
    }
    Wind go(Wind w){
        w = new Wind(1);
        Wind w1 = w;
        w.id=2;
        System.out.println(w.hashCode());
        System.out.println(w1.hashCode());
        return w1;
    }
}
