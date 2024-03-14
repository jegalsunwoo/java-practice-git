package sec05.chap06.ex01;

public class Main {
    public static void main(String[] args) {

        //자식 클래스(shutdown, toggle)는 부모클래스(Button)의 한 종류로 인식
        Button btn1 = new Button("Enter");
        Button btn2 = new ShutDownButton();
        Button btn3 = new ToggleButton(false);
        //반대의 경우 사용 불가
        //ToggleButton btn4 = Button("Enter");

        Button[] buttons = {
                new Button("Enter"),
                new ShutDownButton(),
                new ToggleButton(true)
        };

        for(Button button : buttons){
            button.func();
        }
    }
}
