public class SwitchFinal {
    static void test1(int day){
        final int a=1, b =2;
        switch(day){
            case a:
                System.out.print(1);  break;
            case b:
                System.out.print(2); break;
        }
        System.out.print("\n");
    }
    public static void main(String[] args){
        test1(1);
        test1(2);
    }
}
