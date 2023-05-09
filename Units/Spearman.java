package Units;
//копейщик
public class Spearman extends BaseUnits {
    private String typeName;
    public Spearman(String name){
        super(name, 140, 30, 20, 1, 15);
        typeName = "Spearman";
    }

    @Override
    public String toString() {
        return typeName +" "+ name;
    }
}
