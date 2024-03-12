package sec05.chap01.ex02;

public class Main {
    public static void main(String[] args) {
        Slime bigSlime = new Slime(100, 20,0.4);
        Slime smallSlime = new Slime(50, 10,0.2);

        bigSlime.attack(smallSlime);



    }
}
