package sec04.chap02;

public class Switch {
    public static void main(String[] args) {
        int finger=5;
        //가능한 자료형: byte, short, int, char, String, enum
        //finger와 case 뒤의 값이 같으면 case안의 코드 실행 후 switch문 탈출
        switch(finger){
            case 2:
                System.out.println("가위");
                break;
            case 0:
                System.out.println("바위");
                break;
            case 5:
                System.out.println("보");
                break;
            default:
                System.out.println("몰랑");

        }
    }
}
