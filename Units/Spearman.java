package Units;
//копейщик
public class Spearman extends BaseUnits {
    public Spearman(String name){
        super(name,"Spearman" ,140, 30, 20, 1, 15);
    }

    @Override
    public String toString() {
        return typeName +" "+ name;
    }
}
