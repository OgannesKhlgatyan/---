package Units;

//снайпер
public class Sniper extends warriors {
    public Sniper(String name) {
        super(name, "Sniper", 200, 2, 2, 1, 16);
    }

    @Override
    public String toString() {
        return typeName + " " + name;
    }

    @Override // метод "атаки" у снайпера
    public void attack() {
        this.hp = hp - this.damage > 0 ? this.hp - this.damage : 0;
    }
    @Override
    public String getInfo() {
        return super.getInfo();
    }
}
