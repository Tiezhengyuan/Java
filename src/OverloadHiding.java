/*
variable can't be overridden but hidden.
there are two copies if two variables with idential name and type.
 */
public class OverloadHiding {
    public static void main(String[] args){
        Mouse m = new Mouse();
        // use parent variable if method is in parent
        // use child variable if method is in child
        m.getRodentDetails();
        m.getMouseDetails();

        // casting
        Rodent r = new Mouse();
        // child variable is hidden even if child one is static
        // not suggestd. being confused
        r.getRodentDetails();
        //wrong: r.getMouseDetails();
    }
    
}

class Rodent{ 
    protected String type = "rodent";
    protected int length = 4;
    public void getRodentDetails(){
        System.out.println("rodent: "+ length+type);
    }
}

class Mouse extends Rodent{
    private static String type = "mouse";
    int length = 8;
    public void getMouseDetails(){
        // Use of super. and this. distinguish child and parent
        System.out.print("rodent: "+ super.length+super.type);
        System.out.println(" mouse:"+ length+type);
    }
}
