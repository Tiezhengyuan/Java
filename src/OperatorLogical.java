public class OperatorLogical {
    public static void main(String[] args){
        System.out.println("Operator ^:");
        System.out.println((2==3)^(4<3));
        System.out.println((2<3)^(4>3));
        System.out.println((2<3)^(4<3));
        System.out.println((2==3)^(4>3));
        int a, b;
        System.out.println((a=3)^(b=13));
    }    
}
