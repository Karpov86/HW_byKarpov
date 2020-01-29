package by.karpov;

import java.time.LocalDate;
import java.util.Date;

public class Test {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

        LocalDate localDate = LocalDate.now();
        LocalDate localDate1;
        System.out.println(localDate.getYear());
        System.out.println(localDate);
    }
}
