package sec05.chap02.ex02;

public class Chicken {
    static String brand = "XX치킨";
    static int lastNo = 0;
    static String contact(){
        return "%s입니다. 무엇을 도와드릴까요?".formatted(brand);
    }

    int no = ++lastNo;
    String name;

    Chicken(String name){
        this.name = name;
    }
    String intro(){
        return "안녕하세요 %s %d호 %s점 입니다.".formatted(brand,no,name);
    }
}
