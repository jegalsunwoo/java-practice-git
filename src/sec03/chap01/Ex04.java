package sec03.chap01;

public class Ex04 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        //int끼리 연산 = int반환
        int c = a + b;
        long d = a + b;// long이 더 큰 자료형이여서 가능
//        short e = a + b;//더 작은 자료형이여서 묵시적으로 불가능
        short f = (short) (a + b);//명시적으로 가능

        byte b1 = 1;
        byte b2 = 2;
        short s1 = 1;
        short s2 = 2;

//        아래의 경우 모두 불간으 byte와 short의 연산은 int값을 반환하기 때문
//        byte b3 = b1 + b2;
//        short s3 = b1 + b2;
//        short s4 = b1 + b2;
//        short s5 = s1 + s2;

//        long 끼리의 연산은 long 반환

    }
}
