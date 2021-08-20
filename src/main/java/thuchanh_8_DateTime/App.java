package thuchanh_8_DateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class App {
//    public static void main(String[] args) {
//        LocalDate today = LocalDate.now();
//        System.out.println(today);
//
//        LocalDate ld  = LocalDate.of(2021,12,28);
//        System.out.println(ld);
//        System.out.println("-------------------");
//
//        System.out.println(today.getDayOfYear());
//        System.out.println(today.getDayOfMonth());
//        System.out.println(today.getDayOfWeek());
//        System.out.println("-------------------");
//
//        System.out.println(today.getMonth());
//        System.out.println(today.getMonthValue());
//        System.out.println("-------------------");
//
//        System.out.println(today.getYear());
//        System.out.println("-------------------");
//
//        System.out.println(today.plusDays(100));
//        System.out.println(today.plusMonths(1));
//        System.out.println(today.plusYears(2));
//        System.out.println(today.plusWeeks(2));
//        System.out.println("-------------------");
//
//        System.out.println(today.minusDays(2));
//        System.out.println(today.minusMonths(1));
//        System.out.println(today.minusYears(2));
//        System.out.println(today.minusWeeks(2));
//        System.out.println("-------------------");
//
//
//        System.out.println(today.compareTo(ld));
//        System.out.println(today.compareTo(LocalDate.now()));
//        System.out.println(today.compareTo(LocalDate.of(2021,8,19)));
//        System.out.println("-------------------");
//
//        System.out.println(today.isBefore(ld));
//        System.out.println(today.isAfter(ld));
//        if(today.isEqual(LocalDate.of(2021,8,20))){
//            System.out.println("Equals");
//        }
//        System.out.println("-------------------");
//
//        LocalDate eld = LocalDate.ofEpochDay(10);
//        System.out.println(eld);
//        System.out.println("-------------------");
//
//        System.out.println(today.toEpochDay());
//
//
//    }

//    public static void main(String[] args) {
//        LocalTime now = LocalTime.now();
//        System.out.println(now);
//        System.out.println("-----------------");
//
//        LocalTime lt = LocalTime.of(9,30,40);
//        System.out.println(lt);
//        System.out.println("-----------------");
//
//        LocalTime lt2 = LocalTime.ofSecondOfDay(18000);
//        System.out.println(lt2);
//        System.out.println("-----------------");
//
//        System.out.println(now.getHour());
//        System.out.println(now.getMinute());
//        System.out.println(now.getSecond());
//        System.out.println(now.getNano());
//        System.out.println("-----------------");
//
//        System.out.println(now.plusHours(2));
//        System.out.println(now.plusMinutes(2));
//        System.out.println(now.plusSeconds(2));
//
//
//    }

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println("-----------------");

        LocalDateTime ldt = LocalDateTime.of(2021,8,20,10,0,0);
        System.out.println(ldt);
        System.out.println("-----------------");

        System.out.println(now.format(DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println(now.format(DateTimeFormatter.ISO_DATE));
        System.out.println(now.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println("-----------------");

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(now.format(f));

        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("eeee/dd/MMMM/yyyy/HH/mm/s/a");
        System.out.println(now.format(f2));
        System.out.println("-----------------");

        String strD = "20/08/2021";
        DateTimeFormatter df = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate ld = LocalDate.parse(strD,df);
        System.out.println(ld);
        System.out.println("-----------------");

        Set<String> zones = ZoneId.getAvailableZoneIds();
        for (String z : zones){
            System.out.println(z);
        }

        ZonedDateTime zdt = ZonedDateTime.of(now,ZoneId.of("Egypt"));
        System.out.println(zdt);
        System.out.println("-----------------");

        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.of(2021,11,15);
        Period p = Period.between(d1,d2);
        System.out.println(p);

        LocalDateTime ldt2 = LocalDateTime.of(2021,10,10,10,10,10);
        Duration dr = Duration.between(ldt, ldt2);
        System.out.println(dr);
        System.out.println(dr.toDays());
        System.out.println(dr.toHours());


    }
}
