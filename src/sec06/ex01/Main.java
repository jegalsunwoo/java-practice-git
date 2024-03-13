package sec06.ex01;

import sec06.ex01.ChikenStoreDT;

public class Main {
    public static void main(String[] args) {
        ChikenStoreDT dtStore1 = new ChikenStoreDT(1,"고구려");

        dtStore1.takeHallOrder();

        dtStore1.setDriveThruOpen(false);

        dtStore1.takeDTOrder();
    }
}
