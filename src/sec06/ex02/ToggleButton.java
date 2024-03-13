package sec06.ex02;

public class ToggleButton extends Button{
    private boolean on;

    public ToggleButton(boolean on){
        super("CapsLock");
        this.on = on;
    }

    @Override
    public void func(){
        super.func();
        this.on = !this.on;
        System.out.println(
                "대문자 입력 : "
                +(this.on ? "ON" : "OFF"));
    }
}
