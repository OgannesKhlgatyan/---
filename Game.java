import Units.*;

public class Game {
    public static void main(String[] args) {
        Sniper sniper = new Sniper("Garry");
        System.out.println(sniper);
        //System.out.println(sniper.getInfo());

        Crossbowman crossbowman = new Crossbowman("Olgert");
        System.out.println(crossbowman);
        //System.out.println(crossbowman.getInfo());

        Magician magician = new Magician("Misha");
        System.out.println(magician);
        //System.out.println(magician.getInfo());

        Monk monk = new Monk ("Martin");
        System.out.println(monk);
        //System.out.println(monk.getInfo());

        Spearman spearman = new Spearman("Manny");
        System.out.println(spearman);
        //System.out.println(spearman.getInfo());

        Peasant peasant = new Peasant("Mari");
        System.out.println(peasant);
        //System.out.println(peasant.getInfo());

        Outlaw outlaw = new Outlaw("Francine");
        System.out.println(outlaw);
        //System.out.println(outlaw.getInfo());
    }
}
