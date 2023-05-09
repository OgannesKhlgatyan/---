package Units;
//разбойник
public class Outlaw extends BaseUnits {
    private String typeName;
    public Outlaw(String name){
        super(name, 150, 19, 2, 1, 14);
        typeName = "Outlaw";
    }

    @Override
    public String toString() {
        return typeName +" "+ name;
    }
}
