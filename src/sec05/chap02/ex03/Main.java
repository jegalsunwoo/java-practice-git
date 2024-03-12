package sec05.chap02.ex03;

public class Main {
    public static void main(String[] args) {
        //인스턴스 생성
        Button btn1 = new Button('1',2);
        Button btn2 = new Button('+',3);
        Button btn3 = new Button('A',2);

        //생성한 인스턴스들을 buttons 배열에 저장
        Button[] buttons = {btn1,btn2,btn3};

        //모든 버튼에 대하여 place함수 실행
        for(Button button : buttons){
            button.place();
        }

        //모드 변경
        Button.switchMode();

        //모든 버튼에 대하여 place함수 실행
        for(Button button : buttons){
            button.place();
        }
    }
}
