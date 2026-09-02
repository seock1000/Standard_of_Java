public class WrapperEx1 {
    public static void main(String[] args) {
        // Java 9부터 new Integer(int)는 deprecated
        // Integer i = new Integer(100); // 항상 새 객체 생성

        Integer i = 100;   // 오토박싱 → Integer.valueOf(100)
        Integer i2 = 100;  // -128 ~ 127은 캐시된 Integer 객체 재사용

        // == : 값 비교가 아니라 같은 객체를 참조하는지 비교
        // 100은 캐시 범위이므로 i, i2가 같은 객체를 참조 → true
        System.out.println("i == i2 : " + (i == i2)); // true
        // equals() 메서드 : 두 객체가 같으면 true, 다르면 false 반환
        System.out.println("i.equals(i2) : " + i.equals(i2));
        //compareTo() 메서드 : 두 객체가 같으면 0, 크면 양수, 작으면 음수 반환
        System.out.println("i.compareTo(i2) : " + i.compareTo(i2)); // 0
        // toString() 메서드 : 객체를 문자열로 반환
        System.out.println("i.toString() : " + i.toString());

        // MAX_VALUE : Integer 클래스의 최대값
        System.out.println("Integer.MAX_VALUE : " + Integer.MAX_VALUE);
        // MIN_VALUE : Integer 클래스의 최소값
        System.out.println("Integer.MIN_VALUE : " + Integer.MIN_VALUE);
        // SIZE : Integer 클래스의 크기
        System.out.println("Integer.SIZE : " + Integer.SIZE);
        // BYTES : Integer 클래스의 바이트 수
        System.out.println("Integer.BYTES : " + Integer.BYTES);
        // TYPE : Integer 클래스의 타입
        System.out.println("Integer.TYPE : " + Integer.TYPE);
    }
}
