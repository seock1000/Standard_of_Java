import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

import static java.time.temporal.ChronoUnit.*;

public class NewTimeEx1 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();

        LocalDate date = LocalDate.of(1999, 12, 31);
        LocalTime time = LocalTime.of(23, 59, 59);

        System.out.println("today=" + today);
        System.out.println("now=" + now);
        System.out.println("date=" + date);
        System.out.println("time=" + time);

        System.out.println(date.withYear(2000));
        System.out.println(date.plusDays(1));
        System.out.println(date.plus(1, DAYS));

        System.out.println(time.truncatedTo(HOURS));

        // 특정 ChronoField의 범위를 확인
        System.out.println(ChronoField.CLOCK_HOUR_OF_DAY.range());
        System.out.println(ChronoField.HOUR_OF_DAY.range());
    }
}

/**
 * 실행 결과
 * today=2026-09-22
 * now=22:17:12.847831
 * date=1999-12-31
 * time=23:59:59
 * 2000-12-31
 * 2000-01-01
 * 2000-01-01
 * 23:00
 * 1 - 24
 * 0 - 23
 */
