package sec03.chap01;
//비교연산자
public class Ex09 {
    public static void main(String[] args) {
        // ==같다, !=다르다, a>b a가 보다 크다, a>=b a가 b보다 크거나 같다.
        int a=4, b=3;
        boolean bool1 = a==b;
        boolean bool2 = a!=b;
        System.out.printf("%s, %s\n",bool1,bool2);

        boolean bool3 = a>b;
        boolean bool4 = a>=b;
        System.out.printf("%s, %s\n",bool3,bool4);

        boolean bool5 = a<b;
        boolean bool6 = a<=b;
        System.out.printf("%s, %s\n",bool5,bool6);
    }
}
