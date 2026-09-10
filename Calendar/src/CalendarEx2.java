import java.util.Calendar;

public class CalendarEx2 {
    public static void main(String[] args) {
        // 요일은 1부터 시작
        final String[] DAY_OF_WEEK = {"", "일", "월", "화", "수", "목", "금", "토"};

        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();

        // month는 0부터 시작
        // date1.set(2015, Calendar.AUGUST, 15);와 동일
        date1.set(2026, 7, 15);
        System.out.println("date1은 " + toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "요일이고,");
        System.out.println("오늘은 " + toString(date2) + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "요일입니다.");

        // 두 날짜 간의 차이 = getTimeMillis() / 1000
        long diff = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;
        System.out.println("date1과 date2의 시간차이는 " + diff + "초입니다.");
        System.out.println("일(day)로 계산하면 " + diff / (24 * 60 * 60) + "일입니다.");
    }

    private static String toString(Calendar date1) {
        return date1.get(Calendar.YEAR) + "년 " + (date1.get(Calendar.MONTH) + 1) + "월 " + date1.get(Calendar.DATE) + "일 ";
    }
}

/**
 * 실행 결과
 * date1은 2026년 8월 15일 토요일이고,
 * 오늘은 2026년 9월 10일 목요일입니다.
 * date1과 date2의 시간차이는 2246400초입니다.
 * 일(day)로 계산하면 26일입니다.
 */
