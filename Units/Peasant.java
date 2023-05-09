package Units;
//крестьянин
public class Peasant extends BaseUnits {
    public Peasant(String name){
        super(name,"Peasant", 80, 3, 0, 1, 4);
    }

    @Override
    public String toString() {
        return typeName +" "+ name;
    }
}
