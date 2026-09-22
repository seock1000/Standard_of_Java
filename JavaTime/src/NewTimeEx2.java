import java.time.*;

public class NewTimeEx2 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        LocalDateTime dt = LocalDateTime.of(date, time);

        ZoneId zid = ZoneId.of("Asia/Seoul");
        ZonedDateTime zdt = dt.atZone(zid);

        ZonedDateTime seoulTime = ZonedDateTime.now();
        ZoneId nyId = ZoneId.of("America/New_York");
        ZonedDateTime nyTime = ZonedDateTime.now().withZoneSameInstant(nyId);

        OffsetDateTime odt = zdt.toOffsetDateTime();

        System.out.println(dt);
        System.out.println(zid);
        System.out.println(zdt);
        System.out.println(seoulTime);
        System.out.println(nyTime);
        System.out.println(odt);
    }
}

/**
 * 실행 결과
 * 2026-09-22T22:47:45.276525
 * Asia/Seoul
 * 2026-09-22T22:47:45.276525+09:00[Asia/Seoul]
 * 2026-09-22T22:47:45.276802+09:00[Asia/Seoul]
 * 2026-09-22T09:47:45.277584-04:00[America/New_York]
 * 2026-09-22T22:47:45.276525+09:00
 */

