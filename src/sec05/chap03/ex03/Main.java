package sec05.chap03.ex03;

public class Main {
    public static void main(String[] args) {
        Button btn = new Button('2',100);
        Button.switchMode();
        //String btnMode = Button.mode;  //사용불가

        btn.setSpace(30);
        //btn.setSpace(3);
        //btn.space = 1; //사용불가

        //char btnPrint = Button.print; //사용불가
        String btnInfo = btn.getButtonInfo();
        System.out.println(btnInfo);
    }
}
