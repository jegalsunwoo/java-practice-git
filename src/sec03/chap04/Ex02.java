package sec03.chap04;
//논리 연산자
public class Ex02 {
    public static void main(String[] args) {
        boolean bool1 = true && true;
        boolean bool2 = true && false;

        boolean bool3 = true || false;
        boolean bool4 = true || true;

        int num = 6;

        // &&가 ||보다 우선순위 높음
        boolean boolA = (num % 3 == 0) && (num % 2 == 0) || (num > 0) && (num > 10);
        boolean boolB = (num % 3 == 0) && ((num % 2 == 0) || (num > 0)) && (num > 10);

    }
}
