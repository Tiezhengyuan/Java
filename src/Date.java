import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.*;

public class Date {
    public static void main(String[] args){
        // local time
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());


        // parse date
        LocalDate d4 = LocalDate.parse("08-10-2020", DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println(d4);
        // localDate is immutable
        d4=d4.minusDays(1).minusMonths(1).minusYears(1);
        System.out.println(d4);

        // period: year,month,days
        Period p = Period.of(1,2,3);
        System.out.println(p);
        d4=d4.minus(p);
        System.out.println(d4);
        // 1-2-3+0-1-2=1+3+5
        p = p.plusDays(2).plusMonths(1);
        System.out.println(p);
        d4=d4.plus(p);
        System.out.println(d4);
    }
    
}
