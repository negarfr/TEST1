package groupstudy;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class GroupStudy02 {

    public static void main(String[] args) {
        // 1. Find the difference in hours for two different dates

        LocalDate a= LocalDate.of(2016,8,16);

        LocalDate n = LocalDate.of(1978,8,24);

        long diffName = ChronoUnit.YEARS.between(a,n);

        System.out.println("The difference in years is " + diffName);

    }
}
