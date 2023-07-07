public class ComparisonStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abc");
        StringBuffer sb2 = new StringBuffer("abc");

        System.out.println("등가연산자(==) 비교 : " + (sb==sb2));
        System.out.println("StringBuffer equals 비교 : " + sb.equals(sb2));

        // StringBuffer를 String으로 변환
        String s = sb.toString();
        String s2 = sb2.toString();

        System.out.println("String 변환 equals 비교 : " + s.equals(s2));
    }
}