package sec06.ex02;

public class ShutDownButton extends Button{
    public ShutDownButton(){
        super("Shut Down");
    }

    @Override
    public void func(){
        super.func();
        System.out.println("프로그램 종료");
    }
}
