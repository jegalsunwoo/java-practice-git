package sec05.chap01.ex03;

public class Main {
    public static void main(String[] args) {
        ChickenMenu[] menus = {
                new ChickenMenu("후라이드", 10000),
                new ChickenMenu("양념치킨", 12000),
                new ChickenMenu("화덕구이", 15000, "bake")
        };
        Chicken store1 = new Chicken(1, "강남", menus);

        ChickenMenu order1 = store1.orderMenu("후라이드");
        ChickenMenu order2 = store1.orderMenu("오븐구이");
    }
}
