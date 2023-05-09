package Units;
//монах
public class Monk extends BaseUnits {
    public Monk(String name){
        super(name,"Monk",130, 15, 2, 1, 13);
    }

    @Override
    public String toString() {
        return typeName +" "+ name;
    }
}