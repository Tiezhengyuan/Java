import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.*;

public class DateFormat {
    static void test1(){
        DateTimeFormatter shortDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

        LocalDateTime datetime = LocalDateTime.of(2022,01,13,9,12,4);
        shortDate.format(datetime);
        System.out.println(datetime);

        LocalDate date = LocalDate.of(2022,01,13);
        shortDate.format(date);
        System.out.println(date);
    }

    static void test2() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMM dd, yyyy");
        LocalDate d1 = LocalDate.of(2018,2,12);
        System.out.println(d1);
        LocalDate d2 = d1.plusDays(3);
        System.out.println(f.format(d1));
        System.out.println(d2.format(f));
    }
    public static void main(String[] args){
        test1();        
        test2();
    }
}
