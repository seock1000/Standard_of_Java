import java.util.Calendar;

public class CalendarEx3 {
    public static void main(String[] args) {
        final int[] TIME_UNIT = { 3600, 60, 1 }; // 큰 단위가 앞으로, 시, 분, 초
        final String[] TIME_UNIT_NAME = { "시간", "분", "초" };

        Calendar time1 = Calendar.getInstance();
        Calendar time2 = Calendar.getInstance();

        // 10시 20분 30초로 설정
        time1.set(Calendar.HOUR_OF_DAY, 10);
        time1.set(Calendar.MINUTE, 20);
        time1.set(Calendar.SECOND, 30);

        // 20시 30분 10초로 설정
        time2.set(Calendar.HOUR_OF_DAY, 20);
        time2.set(Calendar.MINUTE, 30);
        time2.set(Calendar.SECOND, 10);

        System.out.println("time1 : " + toString(time1));
        System.out.println("time2 : " + toString(time2));

        long difference = Math.abs(time2.getTimeInMillis() - time1.getTimeInMillis()) / 1000; // 초 단위로 변환
        System.out.println("time1과 time2의 차이는 " + difference + "초");

        // 시간으로 나누고 나머지를 분으로 나누고 나머지를 초로 계산 -> 시, 분, 초로 변환
        String tmp = "";
        for(int i = 0; i < TIME_UNIT.length; i++) {
            tmp += difference / TIME_UNIT[i] + TIME_UNIT_NAME[i];
            difference %= TIME_UNIT[i];
        }
        System.out.println("시분초로 변환하면 " + tmp + "입니다.");
    }

    private static String toString(Calendar time) {
        return time.get(Calendar.HOUR_OF_DAY) + "시 " + time.get(Calendar.MINUTE) + "분 " + time.get(Calendar.SECOND) + "초";
    }
}
