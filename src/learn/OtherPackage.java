package learn;

public class OtherPackage{
    private int b;
    public int c;
    // wrong: private PrivateClass(int b){...}
    public OtherPackage(int b){
        this.b = b;
    }
    // wrong: private void Print(){...}
    public void Print(){
        System.out.println(this.b);
    }
}