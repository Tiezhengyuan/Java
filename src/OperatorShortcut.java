public class OperatorShortcut {
    public static void main(String[] args){
        String s= "a";
        boolean b = false;
        if ( 4>3 || (b=true)) s += "b";
        if ( b==true) s += "c";
        System.out.println(s);
    }
}
