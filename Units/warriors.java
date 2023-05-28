package Units;
//класс для вояк

public class warriors extends BaseUnits implements InnerBaseUnits, innerwariors {

    public warriors(String name, String typeName, int hp, int armor, int magic_armor, int speed, int damage) {
        super(name, typeName, hp, max_hp, armor, magic_armor, speed, damage);
    }

    // метод, считающий нанесенный урон
    void getDamage(int damage) {
        this.damage = this.hp;
    }

    @Override
    public String walk() {
        return "walk";
    }

    @Override // метод "атаки"
    public void attack() {
        this.hp = hp - this.damage > 0 ? this.hp - this.damage : 0;
    }

    @Override
    public void getHP() {
    }

    // метод для получения текущего состояния
    public String getInfo() {
        return String.format("TypeUnit:%s Name:%s Hp:%d Armor:%d magic armor:%d",
                this.typeName, this.name, this.hp, this.armor, this.magic_armor);
    }

}
