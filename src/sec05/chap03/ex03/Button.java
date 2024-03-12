package sec05.chap03.ex03;

public class Button {
    private static String mode = "LIGHT";
    public static void switchMode(){
        if(mode.equals("LIGHT")){ mode = "DARK"; System.out.println("DARK mode"); }
        else{ mode = "LIGHT"; System.out.println("LIGHT mode"); }

    }

    private char print;
    private int space=1;

    public Button(char print, int space){
        this.print = print;
        setSpace(space);
    }

    public void setSpace(int space){
        if(space < 1 || space > 4){
            System.out.println("범위를 벗어남.");
            return;
        }
        this.space = space;
        System.out.println("space : "+space);
    }

    public String getButtonInfo(){
        return "%c 버튼, %d픽셀 차지".formatted(print,space*4096);
    }


}
