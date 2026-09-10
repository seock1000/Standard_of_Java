public class CalendarEx6 {
    public static void main(String[] args) {
        // 요일 계산
        System.out.println("2024년 2월 29일은 " + getDayOfWeek(2024, 2, 29) + "요일입니다.");
        // 요일 계산
        System.out.println("2024년 3월 1일은 " + getDayOfWeek(2024, 3, 1) + "요일입니다.");
        // 날짜 차이 계산
        System.out.println("2024년 2월 29일과 2024년 3월 1일의 차이는 " + dayDiff(2024, 2, 29, 2024, 3, 1) + "일입니다.");
        // 날짜를 일수로 변환
        System.out.println("2024년 2월 29일은 " + convertDateToDay(2024, 2, 29) + "일째 날입니다.");
        // 일수를 날짜로 변환
        System.out.println("738155일째 날은 " + convertDayToDate(738155) + "입니다.");
    }

    public static int[] endOfMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // 각 달의 마지막 일

    public static boolean isLeapYear(int year) {
        return ((year%4==0)&&(year%100!=0)||(year%400==0));
    }

    public static int dayDiff(int y1, int m1, int d1, int y2, int m2, int d2) {
        return convertDateToDay(y1, m1, d1) - convertDateToDay(y2, m2, d2);
    }

    public static int getDayOfWeek(int year, int month, int day) {
        return convertDateToDay(year, month, day) % 7 + 1;
    }

    public static String convertDayToDate(int day) {
        int year = 1;
        int month = 0;

        while(true) {
            int aYear = isLeapYear(year) ? 366 : 365; // 윤년이면 366일, 아니면 365일
            if(day > aYear) {
                day-= aYear; // 1년을 빼고 다음 해로 넘어감
                year++;
            } else {
                break;
            }
        }

        while(true) {
            int endDay = endOfMonth[month];
            // 윤년이고 윤달(2월)이 포함되어 있으면, 1월을 더한다.
            if(isLeapYear(year) && month == 1) endDay++;

            if(day > endDay) {
                day -= endDay;
                month++;
            } else {
                break;
            }
        }

        return year + "-" + (month + 1) + "-" + day;
    }

    public static int convertDateToDay(int year, int month, int day) {
        int numOfLeapYear = 0; // 윤년의 수

        // 전년도까지의 윤년의 수 계산
        for(int i = 1; i < year; i++) {
            if(isLeapYear(i)) numOfLeapYear++;
        }
        // 전년도까지의 일수 계산
        int toLastYearDaySum = (year-1) * 365 + numOfLeapYear;

        // 올해의 현재 월까지 일수 계산
        int thisYearDaySum = 0;
        for(int i = 0; i < month-1; i++) {
            thisYearDaySum += endOfMonth[i];
        }
        if(month > 2 && isLeapYear(year)) thisYearDaySum++; // 윤년이고 윤달(2월)이 지났으면 하루 증가

        thisYearDaySum += day;

        return toLastYearDaySum + thisYearDaySum;
    }
}

/**
 * 실행 결과
 * 2024년 2월 29일은 5요일입니다.
 * 2024년 3월 1일은 6요일입니다.
 * 2024년 2월 29일과 2024년 3월 1일의 차이는 -1일입니다.
 * 2024년 2월 29일은 738945일째 날입니다.
 * 738155일째 날은 2021-12-31입니다.
 */
