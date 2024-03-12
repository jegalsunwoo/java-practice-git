package sec03.chap03;
// char 자료형
public class Ex01 {
    public static void main(String[] args) {
        //character 2바이트 사용
        //  각 문자는 상응하는 정수를 가짐
        char ch1 = 'A';
        char ch2 = 'B';
        char ch3 = 'a';
        char ch4 = 'a' + 1;
        char ch5 = '가';
        char ch6 = '가' + 1;
        char ch7 = '가' + 2;
        char ch8 = '가' + 3;
        char ch9 = '나';

        //인트자료형으로 변환 가능
        int ch1Int = (int) ch1;
        int ch9Int = (int) ch9;
    }
}
