package sec03.chap05;

public class Ex03 {
    public static void main(String[] args) {
        String str_a1 = "안녕";

        boolean bool_a1 = str_a1.equals("안녕");

        // 리터럴로 선언했어도 객체 인스턴스로 만들어짐
        // 때문에 객체의 기능인 메소드 사용 가능
        boolean bool_a2 = "안녕".equals("안녕");
        boolean bool_a3 = "안녕".equals(str_a1);

        String str_b1 = "Hello, ";
        String str_b2 = "World!";

        // + 연산자: 이어붙여진 결과를 반환
        String str_b3 = str_b1 + str_b2;

        //  += 연산자:
        String str_c1 = "나는 아무 생각이 없다. ";
        str_c1 += "왜냐하면 ";

        //  2. 그 결과를 반환
        String str_c2 = str_c1 += "아무 생각이 없기 때문이다.";
        boolean bool_c = (str_c1).equals(str_c2);

        // 상수에는 적용할 수 없음
        final String str_d = "헬로";
        //str_d += "월드";


    }
}
