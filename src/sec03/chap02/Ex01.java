package sec03.chap02;
// 실수 자료형
public class Ex01 {
    public static void main(String[] args) {

        //float = 4바이트, double = 8바이트 float는 0.12356f 뒤에 f를 붙여야함
        double a = 0.1, b = 0.2;

        //오차가 생김
        double c = a + b;
        System.out.printf("%.17f\n",c); //   c:0.30000000000000004000 미세한 오차 생김

        boolean bool = 0.3 == 0.1+0.2;
        System.out.printf("%s\n",bool);
        System.out.println(0.1+0.2);


    }
}
