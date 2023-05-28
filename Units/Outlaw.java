package Units;

//разбойник
public class Outlaw extends warriors {
    public Outlaw(String name){
        super(name,"Outlaw",150, 19, 2, 1, 14);
    }

    @Override
    public String toString() {
        return typeName +" "+ name;
    }
    
    @Override
    public String getInfo() {
        return super.getInfo();
    }
}
