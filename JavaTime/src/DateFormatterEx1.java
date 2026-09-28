import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatterEx1 {
    public static void main(String[] args) {
        ZonedDateTime zdateTime = ZonedDateTime.now();
        String[] patterns = {
                "yyyy-MM-dd HH:mm:ss",
                "''yy년 MMM dd일 E요일",
                "yyyy-MM-dd HH:mm:ss.SSS Z VV",
                "yyyy-MM-dd HH:mm:ss a",
                "오늘은 올 해의 D번째 날입니다.",
                "오늘은 이 달의 d번째 날입니다.",
                "오늘은 올 해의 w번째 주입니다.",
                "오늘은 이 달의 W번째 주입니다.",
                "오늘은 이 달의 W번째 E요일입니다.",
        };
        for (String pattern : patterns) {
            System.out.println(zdateTime.format(DateTimeFormatter.ofPattern(pattern)));
        }
    }
}
/**
 * 실행결과
 * 2026-09-28 21:57:21
 * '26년 9월 28일 월요일
 * 2026-09-28 21:57:21.013 +0900 Asia/Seoul
 * 2026-09-28 21:57:21 오후
 * 오늘은 올 해의 271번째 날입니다.
 * 오늘은 이 달의 28번째 날입니다.
 * 오늘은 올 해의 40번째 주입니다.
 * 오늘은 이 달의 5번째 주입니다.
 * 오늘은 이 달의 5번째 월요일입니다.
 */
