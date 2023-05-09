package Units;

import java.util.Random;

public class BaseUnits {
    protected String name;
    protected float hp, max_hp, armor, magic_armor;
    protected int level, speed, attack, damage;
    protected static Random r;

    public BaseUnits(String name, float hp, float armor, float magic_armor, int speed, int damage) {
        this.name = name;
        this.hp = hp;
        this.max_hp= max_hp;
        this.armor = armor;
        this.magic_armor = magic_armor;
        this.speed = speed;
        this.damage = damage;
        BaseUnits.r = new Random();
    }

    // метод для получения текущего состояния
    public String getInfo() {
        return String.format("Name: %s Hp: %d Armor: %d magic armor: %d",
                this.name, this.hp, this.armor, this.magic_armor);
    }

    // Метод, чтобы ходить
    void walk() {

    }

    // метод, считающий урон
    void getDamage() {

    }

    // метод "Лечение"
    void healed(int hp) {
        this.hp = hp + this.hp > this.max_hp ? this.max_hp : hp + this.hp;
    }

}