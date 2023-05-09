package Units;
//колдун
public class Magician extends BaseUnits {
    public Magician(String name){
        super(name,"Magician",120, 15, 2, 1, 13);
    }

    @Override
    public String toString() {
        return typeName +" "+ name;
    }
}
