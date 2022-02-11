package learn;

public class InheritanceAccess{
    private int b;
    protected int c;
    // wrong: private PrivateClass(int b){...}
    protected InheritanceAccess(int b){
        this.b = b;
    }
    // wrong: private void Print(){...}
    protected void SuperPrint(){
        System.out.println(this.b);
    }
}