package Units;
//арбалетчик
public class Crossbowman extends BaseUnits{
    public Crossbowman(String name){
        super(name,"Crossbowman", 100, 10, 3, 1, 11);
    }

    @Override
    public String toString() {
        return typeName +" "+ name;
    }
}