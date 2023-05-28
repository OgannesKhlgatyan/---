package Units;

//монах
public class Monk extends healers {
    public Monk(String name) {
        super(name, "Monk", 130, 15, 2, 1, 13);
    }

    @Override
    public String toString() {
        return typeName + " " + name;
    }

    @Override // метод "Лечение" у монаха
    public void healed(int hp) {
        this.hp = hp + this.hp > this.max_hp ? this.max_hp : hp + this.hp;
    }
    @Override
    public String getInfo() {
        return super.getInfo();
    }
}