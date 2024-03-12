package sec05.chap01.ex03;

public class ChickenMenu {
    String name; // 메뉴 이름
    int price; // 가격
    String cook = "fry"; // 조리 방법 기본은 fry


    //메소드 오버로딩 이름이 같지만 자료형의 개수가 다르므로 다른 함수이다.
    ChickenMenu(String name, int price){
        this.name = name;
        this.price = price;
    }

    ChickenMenu(String name, int price,String cook){
        this.name = name;
        this.price = price;
        this.cook = cook;
    }


}
