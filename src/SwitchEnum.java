public class SwitchEnum {
    enum Day{
        Mon, Tue
    }
    static void test1(Day day){
        switch(day){
            case Mon:
                System.out.print(1);  break;
            case Tue:
                System.out.print(2); break;
        }
        System.out.print("\n");
    }
    public static void main(String[] args) {
        test1(Day.Mon);
    }
}

