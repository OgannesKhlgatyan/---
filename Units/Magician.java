package Units;

//колдун
public class Magician extends healers implements Innerhealers {
    public Magician(String name){
        super(name,"Magician",120, 15, 2, 1, 13);
    }

    @Override
    public String toString() {
        return typeName +" "+ name;
    }

    @Override // метод "Лечение" у колдуна
    public void healed(int hp) {
        this.hp = hp + this.hp > this.max_hp ? this.max_hp : hp + this.hp;
    }
    @Override
    public String getInfo() {
        return super.getInfo();
    }
}
