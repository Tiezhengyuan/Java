import java.time.*;

public class Garbage1 {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(2018,8,15);
        System.out.println(d1.hashCode());
        d1 = d1.plusDays(1);

        System.out.println(d1.hashCode());
        LocalDate d2 = d1;
        System.out.println(d2.hashCode());

        LocalDate d3 = d1.plusDays(1);
        System.out.println(d3.hashCode());
        // Line x
    }
}

