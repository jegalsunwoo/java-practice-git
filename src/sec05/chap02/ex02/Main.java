package sec05.chap02.ex02;

public class Main {
    public static void main(String[] args) {
        Chicken store1 = new Chicken("고구려");
        Chicken store2 = new Chicken("백제");
        Chicken store3 = new Chicken("신라");
        System.out.println(store1.intro());
        System.out.println(store2.intro());
        System.out.println(store3.intro());
    }
}