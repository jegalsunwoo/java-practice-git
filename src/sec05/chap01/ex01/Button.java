package sec05.chap01.ex01;

public class Button {
    //Button클래스 에서 사용할 변수 선언
    char print;
    int space;
    String mode;

    //생성자 : 인스턴스를 만드는 메소드 객체=인스턴스
    //this : 생성된 인스턴스를 가리킴
    //인스턴스를 생성할 때 (char print, int space, String mode) 형식으로 생성
    //메인 메소드에서 new를 사용하여 생성됨
    //Button button1 = new Button('1',1,"DARK");
    Button(char print, int space, String mode){
        this.print = print;//this는 생성 될 인스턴스를 가리킴
        this.space = space;
        this.mode = mode;
    }

    void place() {
        System.out.printf("표시: %c, 공간: %d, 모드: %s%n",print,space,mode);
    }
}
