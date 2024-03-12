package sec03.chap01;
//정수 형 변환
public class Ex02 {
    public static void main(String[] args) {
        byte byteNum;
        int smallIntNum = 123;

//        명시적 강제 형 변환
        byteNum = (byte)smallIntNum;

        smallIntNum = 12345;

        byteNum = (byte)smallIntNum; //byteNum의 범위를 초과 했기 때문에 값 손실 -> 12345%128 = 57 값이 들어감
        System.out.println(byteNum);

    }
}
