package Units;
//разбойник
public class Outlaw extends BaseUnits {
    public Outlaw(String name){
        super(name,"Outlaw",150, 19, 2, 1, 14);
    }

    @Override
    public String toString() {
        return typeName +" "+ name;
    }
}
