package sec05.chap01.ex02;

public class Slime {
    double hp;
    int attack;
    double armor;



    public Slime(double hp, int attack, double armor) {
        this.hp = hp;
        this.attack = attack;
        this.armor = armor;
    }

    void attack(Slime enemy){
        enemy.hp = enemy.hp - ((1-enemy.armor)*attack);
        System.out.println(enemy.hp);
    }
}

