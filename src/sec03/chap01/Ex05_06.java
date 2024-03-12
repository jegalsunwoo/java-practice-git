package sec03.chap01;
//복합 연산자
public class Ex05_06 {
    public static void main(String[] args) {
        // a=a+1 과 a+=1는 같다.
        // a+=b, a-=b, a*=b, a/=b, a%=b

        int a = 1;
        System.out.println(a);

        a = a + 1;
        System.out.println(a);

        a += 1;
        System.out.println(a);

        //값을 반환하기도 함
        int b = a=a+1;
        int c = a+=2;
        System.out.println(b);
        System.out.println(c);
    }
}
