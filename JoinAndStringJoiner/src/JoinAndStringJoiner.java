import java.util.StringJoiner;

public class JoinAndStringJoiner {
    public static void main(String[] args) {
        String animals = "dog,cat,bear";
        String[] arr = animals.split(",");

        System.out.println(String.join("-", arr)); // join()으로 배열 결합

        StringJoiner sj = new StringJoiner("/", "[", "]"); // StringJoiner 객체 생성
        for(String s : arr)
            sj.add(s); // 배열의 문자열을 StringJoiner인스턴스에 add

        System.out.println(sj.toString());
    }
}
