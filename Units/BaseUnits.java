package Units;

import java.util.Random;

public class BaseUnits {
    protected String name, typeName;
    protected int hp, max_hp, level, speed, attack, damage, armor, magic_armor;
    protected static Random r;

    public BaseUnits(String name, String typeName, int hp, int armor, int magic_armor, int speed, int damage) {
        this.name = name;
        this.typeName = typeName;
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
        return String.format("TypeUnit:%s Name:%s Hp:%d Armor:%d magic armor:%d",
        this.typeName, this.name, this.hp, this.armor, this.magic_armor);
    }

    // Метод, чтобы ходить
    void walk() {

    }

    // метод, считающий нанесенный урон
    void getDamage(int damage) {
        this.damage =this.hp;
    }

    // метод "Лечение"
    void healed(int hp) {
        this.hp = hp + this.hp > this.max_hp ? this.max_hp : hp + this.hp;
    }

    

}