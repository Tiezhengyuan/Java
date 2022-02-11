import java.time.*;

public class DateCreate {
    static void test1(){
        System.out.println("create date object");
        LocalDate d1 = LocalDate.of(2015, 1, 2);
        System.out.println(d1);
        LocalDate d2 = LocalDate.of(2015, 01, 02);
        System.out.println(d2);
        LocalDate d3 = LocalDate.of(2015, Month.JANUARY, 2);
        System.out.println(d3);
        LocalDate d4 = LocalDate.of(15, 1,31);
        System.out.println(d4);
        // throw exception: Invalid value for MonthOfYear
        // LocalDate d = LocalDate.of(2015,13,21);
    }
    static void test2() {
        System.out.println("create time object");
        LocalTime d1 = LocalTime.of(24,45,59);
        System.out.println(d1);
    }
    public static void main(String[] args){
        test1();
        test2();
    }
}
