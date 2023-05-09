package Units;
//снайпер
public class Sniper extends BaseUnits {
    public Sniper(String name){
        super(name,"Sniper", 200, 2, 2, 1, 16);
    }


    @Override
    public String toString() {
        return typeName +" "+ name;
    }
}
