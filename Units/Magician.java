package Units;
//колдун
public class Magician extends BaseUnits {
    private String typeName;
    public Magician(String name){
        super(name, 120, 15, 2, 1, 13);
        typeName = "Magician";
    }

    @Override
    public String toString() {
        return typeName +" "+ name;
    }
}
