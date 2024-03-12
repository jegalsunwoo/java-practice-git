package sec03.chap01;
//단항 연산자 ++ --
public class Ex08 {
    public static void main(String[] args) {
        int a = 1;
        System.out.println(a++); //print 문 실행 후 a값 1증가

        System.out.println(++a); //print 문 실행 전 a값 1증가

        System.out.println(a);

        int int1 = 3;

        int int2 = int1++; // int2=3, int1 -> 4
        int int3 = ++int1; // int3=5, int1 = 5
        int int4 = -(int2-- * --int3); // int2 -> 2, int3 = 4, int4 = -12
        System.out.println(int4);

        // a++가능 3++불가능
    }
}
