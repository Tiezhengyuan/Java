public class SwitchEntrance {
    static void test1(int day){
        switch(day){
            default: System.out.print(0);
            case 1:
                System.out.print(1);  break;
            case 2:
                System.out.print(2); break;
        }
        System.out.print("\n");
    }
    public static void main(String[] args){
        test1(3);
    }
}
