package sec03.chap01;
//정수 자료형들과 관련 연산자
public class Ex01 {
    public static void main(String[] args) {
        byte _1b_byte = 1;   //1byte  ~128 - 127
        short _2b_byte = 2;   //2byte
        int _4b_byte = 3;   //4byte
        long _8b_long = 4L;   //8byte long은 숫자 뒤에 l 또는 L을 뒤에 붙여 주어야 한다.
//        큰 자료형에 작은 자료형의 값을 넣을 수 있음  _4b_int = _1b_byte;

        int _4b_int2 = 123_345_67; //가독성을 위해 숫자 중간에 언더바로 구분 가능(자바 7)부터
    }
}
