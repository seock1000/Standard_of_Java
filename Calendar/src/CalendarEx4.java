import java.util.Calendar;

public class CalendarEx4 {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();
        date.set(2026, 7 , 31); // 2026년 8월 31일

        System.out.println(toString(date));
        System.out.println("== 1일 후 ==");
        date.add(Calendar.DATE, 1); // 1일 후
        System.out.println(toString(date));

        System.out.println("== 6개월 전 ==");
        date.add(Calendar.MONTH, -6); // 6개월 전
        System.out.println(toString(date));

        System.out.println("== 31일 후(roll) ==");
        date.roll(Calendar.DATE, 31); // 31일 후(roll)
        System.out.println(toString(date));

        System.out.println("== 31일 후(add) ==");
        date.add(Calendar.DATE, 31); // 31일 후(add)
        System.out.println(toString(date));
    }

    private static String toString(Calendar date) {
        return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1) + "월 " + date.get(Calendar.DATE) + "일";
    }
}

/**
 * 실행 결과
 * 2026년 8월 31일
 * == 1일 후 ==
 * 2026년 9월 1일
 * == 6개월 전 ==
 * 2026년 3월 1일
 * == 31일 후(roll) ==
 * 2026년 3월 1일
 * == 31일 후(add) ==
 * 2026년 4월 1일
 */
