package sec06.ex01;

public class ChikenStore {
    protected int no;
    protected String name;

    public ChikenStore(int no, String name){
        this.no = no;
        this.name = name;
    }

    public void takeHallOrder(){
        System.out.printf("%d호 %s점 홀 주문 들어옴%n",no, name);
    }
}
