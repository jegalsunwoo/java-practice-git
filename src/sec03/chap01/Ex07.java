package sec03.chap01;
//논리 오류
public class Ex07 {
    public static void main(String[] args) {
        //자료형의 범위를 넘어가도록 숫자를 더하거나 뺄 경우
        byte x = 127;
        x+=1;
        System.out.println(x);
        byte y = -128;
        y-=1;
        System.out.println(y);
    }
}
