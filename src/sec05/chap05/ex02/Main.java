package sec05.chap05.ex02;

public class Main {
    public static void main(String[] args) {
        Button bTn = new Button("Enter");
        ShutDownButton sdBtn = new ShutDownButton();
        ToggleButton tgBtn = new ToggleButton(false);

        bTn.func();
        sdBtn.func();
        tgBtn.func();
        tgBtn.func();
        tgBtn.func();


    }
}
