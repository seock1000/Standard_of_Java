// Cloneable 인터페이스를 구현한 클래스에서만 clone()을 호출 가능
class Point implements Cloneable {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "x=" + x + ", y=" + y;
    }

    public Point clone() {
        Object obj = null;
        try {
            obj = super.clone(); // clone()은 반드시 예외처리
        } catch (CloneNotSupportedException e) { }
        return (Point)obj; // 공변 반환타입 적용, 조상 메서드를 오버라이딩해서 자손 클래스로 반환 타입을 변경하였다.
    }
}

public class CloneEx {
    public static void main(String[] args) {
        Point original = new Point(3,5);
        Point copy = original.clone(); // 복제(clone) 해서 새로운 객체를 생성
        System.out.println(original);
        System.out.println(copy);
    }
}
