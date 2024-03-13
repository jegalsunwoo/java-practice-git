package sec05.chap05.ex02;

public class Button {
    public String print;

    public Button(String print){
        this.print = print;
    }

    public void func(){
        System.out.println(print + "입력 적용");
    }
}
