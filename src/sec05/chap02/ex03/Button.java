package sec05.chap02.ex03;

public class Button {
    static String mode = "LIGHT"; //기본 모드

    //모드 변경 함수
    static void switchMode(){
        mode = mode.equals("LIGHT") ? "DARK" : "LIGHT";
    }

    char print; //표시문자
    int space; //공간크기

    //생성자
    Button(char print, int space){
        this.print = print;
        this.space = space;
    }

    //place()호출 시 표시, 공간, 모드 출력 함수
    void place(){
        System.out.printf("표시 : %c, 공간 : %d, 모드 : %s%n",print,space,mode);
    }
}
