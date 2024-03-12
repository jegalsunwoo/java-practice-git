package sec03.chap05;
//타 자료형간 변환
public class Ex04 {
    public static void main(String[] args) {

        // 타 자료형을 문자열로 변환
        String str1 = String.valueOf(true);
        String str2 = String.valueOf(123);
        String str3 = String.valueOf(3.14f);
        String str4 = String.valueOf('가');
        //valueOf를 사용하여 문자열로 변환

        //보다 더 간단한 ""공백을 추가하여 문자열로 변환
        String str5 = true+"";
        String str6 = 123.45+"";

        //문자열을 타 자료형으로 바꿀 때 사용하는 메소드
        String str123 = "123";
        byte byte123 = Byte.parseByte(str123);
        int int123 = Integer.parseInt(str123);
        short short123 = Short.parseShort("123");

        //  대소문자 무관 'true'일 때 true 반환
        boolean bool1 = Boolean.parseBoolean("TRUE");
        boolean bool2 = Boolean.parseBoolean("true");
        boolean bool3 = Boolean.parseBoolean("TrU");


        String strA = "A";

        // str 을 char로
        char chr = strA.charAt(0);

        // 런타임 에러 발생. 하나씩 주석해제해서 테스트
        // 용량보다 큰 수를 넣었을 때 컴파일 하는 과정에서 걸러지지 않음

        //byte bytNum2 = Byte.parseByte("12345");
        //int intNum2 = Integer.parseInt("123.45");
        //double dblNum2 = Integer.parseInt("하나");
    }
}
