
class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "("+x+", "+y+")";
    }
}

class Circle implements Cloneable {
    Point p; // 원점
    double r; // 반지름

    Circle(Point p, double r) {
        this.p = p;
        this.r = r;
    }
    // 얕은 복사
    public Circle shallowCopy() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {}
        return (Circle)obj;
    }
    // 깊은 복사
    public Circle deepCopy() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {}
        Circle c = (Circle) obj;
        c.p = new Point(this.p.x, this.p.y); // Point형 변수의 참조를 변경
        return c;
    }
    public String toString() {
        return "[p="+p+", r="+r+"]";
    }
}

public class ShallowDeepCopy {
    public static void main(String[] args) {
        Circle original = new Circle(new Point(1, 1), 2.0);
        Circle shallow = original.shallowCopy();
        Circle deep = original.deepCopy();

        System.out.println("original = "+original);
        System.out.println("shallow copy = "+shallow);
        System.out.println("deep copy = "+deep);

        original.p.x = 9;
        original.p.y = 9;
        System.out.println("---- original 변경 -----");
        System.out.println("original = "+original);
        System.out.println("shallow copy = "+shallow);
        System.out.print("deep copy = "+deep);
    }
}
