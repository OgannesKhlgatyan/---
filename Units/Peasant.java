package Units;
//крестьянин
public class Peasant extends BaseUnits {
    private String typeName;
    public Peasant(String name){
        super(name, 80, 3, 0, 1, 4);
        typeName = "Peasant";
    }

    @Override
    public String toString() {
        return typeName +" "+ name;
    }
}
