package sec03.chap04;
//boolean 자료형 관련 연산자
public class Ex01 {
    public static void main(String[] args) {
        // 참, 거짓 둘 중 한 값을 가짐 1바이트
        boolean bool1 = true;
        boolean bool2 = false;

        boolean bool3 = !true;
        boolean bool4 = !false;

        boolean bool5 = !!bool3;
        boolean bool6 = !!!bool3;

        boolean bool7 = !(1 > 2);
        boolean bool8 = !((5 / 2) == 2.5);
        boolean bool9 = !((3f + 4.0 == 7) != ('A' < 'B'));

    }
}
