public class StringEx1 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        System.out.println("리터럴 지정 equals() : " + str1.equals(str2));
        System.out.println("리터럴 지정 등가연산자 : " + (str1 == str2));
        System.out.println();

        String str3 = new String("abc");
        String str4 = new String("abc");

        System.out.println("생성자 equals() : " + str3.equals(str4));
        System.out.println("생성자 등가연산자 : " + (str3 == str4));

    }
}
