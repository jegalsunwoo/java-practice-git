package sec05.chap02.ex01;

public class Main {
    public static void main(String[] args) {
        //정적 필드와 메소드는 인스턴스를 생성하지 않고 사용한다.
        //클래스명 뒤에 바로 붙여서 사용 가능하다.
        String ckBrand = Chicken.brand;
        String ckContact = Chicken.contact();

        Chicken store1 = new Chicken(1,"고구려");
        Chicken store2 = new Chicken(2,"백제");

        String store1Intro = store1.intro();
        System.out.println(store1Intro);

        String store1Brand = Chicken.brand;
        String store1Contact = Chicken.contact();
        System.out.println(store1Contact);
    }
}
