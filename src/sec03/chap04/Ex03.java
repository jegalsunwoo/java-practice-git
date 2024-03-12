package sec03.chap04;
// 단축평가  삼항연산자
public class Ex03 {
    public static void main(String[] args) {

        // and 앞 값이 거짓이면 뒤에 연산 필요없음
        // or 앞 값이 참이면 뒤에 연산 필요 없음
        // if 문 대신에 응용 가능 할
        int a = 1, b = 2, c = 0, d = 0, e = 0, f = 0;

        boolean bool1 = a < b && c++ < (d += 3);
        boolean bool2 = a < b || e++ < (f += 3);

        boolean bool3 = a > b && c++ < (d += 3);
        boolean bool4 = a > b || e++ < (f += 3);

        int num1 = 3, num2 = 4;

        char num1OE = num1 % 2 == 1 ? '홀' : '짝';
        char num2OE = num2 % 2 == 1 ? '홀' : '짝';


        int x = 1, y = 2;

        //  💡 단축평가 적용됨
        int changed1 = x < y ? (x += 2) : (y += 2);
        int changed2 = x < y ? (x += 2) : (y += 2);
        int changed3 = x < y ? (x += 2) : (y += 2);
        int changed4 = x < y ? (x += 2) : (y += 2);
        int changed5 = x < y ? (x += 2) : (y += 2);
    }
}
