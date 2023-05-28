package Units;

import java.util.Random;

public abstract class BaseUnits implements InnerBaseUnits{
    protected String name, typeName;
    protected int hp;
    protected static int max_hp;
    protected int level;
    protected int speed;
    protected int attack;
    protected int damage;
    protected int armor;
    protected int magic_armor;
    protected static Random r;

    public BaseUnits(String name, String typeName, int hp, int max_hp, int armor, int magic_armor, int speed,
            int damage) {
        this.name = name;
        this.typeName = typeName;
        this.hp = hp;
        this.max_hp = max_hp;
        this.armor = armor;
        this.magic_armor = magic_armor;
        this.speed = speed;
        this.damage = damage;
        this.r = new Random();
    }

    @Override
    public String getInfo() {
        // TODO Auto-generated method stub
        return null;
    }
}