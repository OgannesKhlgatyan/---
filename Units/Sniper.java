package Units;
//снайпер
public class Sniper extends BaseUnits {
    private String typeName;
    public Sniper(String name){
        super(name, 200, 2, 2, 1, 16);
        typeName = "Sniper";
    }

    @Override
    public String toString() {
        return typeName +" "+ name;
    }
}
