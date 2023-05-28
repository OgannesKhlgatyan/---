package Units;
//класс для лекарей

public class healers extends BaseUnits implements InnerBaseUnits, Innerhealers {

    public healers(String name, String typeName, int hp, int armor, int magic_armor, int speed, int damage) {
        super(name, typeName, hp, max_hp, armor, magic_armor, speed, damage);
    }

    @Override
    public String walk() {
        return "walk";
    }

    @Override
    public void healed(int hp) {
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
