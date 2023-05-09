package Units;
//арбалетчик
public class Crossbowman extends BaseUnits{
    private String typeName;
    public Crossbowman(String name){
        super(name, 100, 10, 3, 1, 11);
        typeName = "Crossbowman";
    }

    @Override
    public String toString() {
        return typeName +" "+ name;
    }
}