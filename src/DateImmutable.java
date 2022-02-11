import java.time.LocalDate;
public class DateImmutable {
    static void test1(){
        LocalDate date = LocalDate.of(2022,1,13);
        System.out.println(date);
        date.plusDays(3);
        date.plusMonths(1);
        System.out.println(date);
    }
    static void test2(){
        LocalDate date = LocalDate.of(2022,1,13);
        System.out.println(date);
        date=date.plusDays(3);
        date=date.plusMonths(1);
        System.out.println(date);
    }
    public static void main(String[] args){ 
        test1();
        test2();
    }
}
