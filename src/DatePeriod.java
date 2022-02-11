import java.time.LocalDateTime;
import java.time.Period;

public class DatePeriod {
    static void test1(){
        LocalDateTime d = LocalDateTime.of(2020,1,2,12,0,0);
        System.out.println(d);
        Period p = Period.of(1,2,3);
        d = d.plus(p);
        System.out.println(d);
    }
    static void test2(){
        LocalDateTime d = LocalDateTime.of(2020,1,2,12,0,0);
        System.out.println(d);
        Period p = Period.ofYears(2);
        p = Period.ofMonths(1);
        p = Period.ofDays(1);
        d = d.minus(p);
        System.out.println(d);
    }
    static void test3(){
        LocalDateTime d = LocalDateTime.of(2020,1,2,12,0,0);
        System.out.println(d);
        Period p = Period.ofYears(1).ofMonths(2).ofDays(3);
        d = d.plus(p);
        System.out.println(d);
    }
    static void test4(){
        LocalDateTime d = LocalDateTime.of(2020,1,2,12,0,0);
        System.out.println(d);
        Period p = Period.of(1,1,1);
        p = p.plusDays(1);
        p.minusMonths(1);
        d = d.plus(p);
        System.out.println(d);
    }
    public static void main(String[] args){
        test1();
        test2();
        test3();
        test4();
    }
}
