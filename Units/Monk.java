package Units;
//монах
public class Monk extends BaseUnits {
    private String typeName;
    public Monk(String name){
        super(name, 130, 15, 2, 1, 13);
        typeName = "Monk";
    }

    @Override
    public String toString() {
        return typeName +" "+ name;
    }
}