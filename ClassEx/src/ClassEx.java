final class Card {
    String kind;
    int num;

    Card() {
        this("SPADE", 1);
    }

    Card(String kind, int num) {
        this.kind = kind;
        this.num = num;
    }

    public String toString() {
        return kind+":"+num;
    }
}

public class ClassEx {
    public static void main(String[] args) throws Exception {
        Card c1 = new Card("HEART", 3); // new 연산자로 생성
        Card c2 = Card.class.newInstance(); // Class 객체를 통해서 생성

        Class cObj = c1.getClass();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(cObj.getName());
        System.out.println(cObj.toGenericString());
        System.out.println(cObj.toString());
    }
}