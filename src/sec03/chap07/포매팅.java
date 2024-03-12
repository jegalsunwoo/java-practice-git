package sec03.chap07;

public class 포매팅 {
    public static void main(String[] args) {
        String str1 = "%s의 둘레는 반지름 X %d X %f입니다.";

        String circle = "원";
        int two = 2;
        double PI = 3.14;

        //포매팅 주어진 형식에 따라 문자열 생성.
        //System.out.printf 와 같은 방식

        //최신버전
        String str2 = str1.formatted(circle,two,PI);
        System.out.println(str2);
        //직접 문자열 입력 가능
        String str3;
        System.out.println("%s의 둘레는 반지름 X %d X %f입니1ㅂ다.".formatted(circle,two,PI));

        //이전 버전
        String str4 = String.format(str1,circle,two,PI);
        System.out.println(str4);
        String str5 = String.format("%s의 둘레는 반지름 X %d X %f%n입\n니다.",circle,two,PI);
        System.out.println(str5);
        // str = ""은 주소 있음 str = null은 주소 없음 메모리 차지 X
    }
}
