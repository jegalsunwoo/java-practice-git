package sec06.ex01;

import sec06.ex01.ChikenStore;

public class ChikenStoreDT extends ChikenStore {
    private  boolean driveThruOpen = true;

    public ChikenStoreDT(int no, String name){
        super(no,name);
    }

    public void setDriveThruOpen(boolean driveThruOpen){
        this.driveThruOpen = driveThruOpen;
        System.out.printf("set driveThru -> %s%n",driveThruOpen);
    }

    public void takeDTOrder(){
        System.out.printf(
                "%d호 %s점 드라이브스루 주문 %s%n",
                no, name, (driveThruOpen ? "받음" : "불가"));
    }
}
