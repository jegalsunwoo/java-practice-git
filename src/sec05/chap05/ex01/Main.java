package sec05.chap05.ex01;

public class Main {
    public static void main(String[] args) {
        ChikenStoreDT dtStore1 = new ChikenStoreDT(1,"고구려");

        dtStore1.takeHallOrder();

        dtStore1.setDriveThruOpen(false);

        dtStore1.takeDTOrder();
    }
}
