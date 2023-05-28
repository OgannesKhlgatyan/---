import java.util.ArrayList;
import java.util.Random;

import Units.*;

public class Game {

    private static String getName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]); 
    }
    public static void main(String[] args) {
        ArrayList<BaseUnits> team1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(7)) {
                case 0:
                    team1.add(new Sniper(getName()));
                    break;
                case 1:
                    team1.add(new Crossbowman(getName()));
                    break;
                case 2:
                    team1.add(new Outlaw(getName()));
                    break;
                case 3:
                    team1.add(new Peasant(getName()));
                    break;
                case 4:
                    team1.add(new Spearman(getName()));
                    break;
                case 5:
                    team1.add(new Magician(getName()));
                    break;
                case 6:
                    team1.add(new Monk(getName()));
                    break;
            }

        }
        ArrayList<BaseUnits> team2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(7)) {
                case 0:
                    team2.add(new Sniper(getName()));
                    break;
                case 1:
                    team2.add(new Crossbowman(getName()));
                    break;
                case 2:
                    team2.add(new Outlaw(getName()));
                    break;
                case 3:
                    team2.add(new Peasant(getName()));
                    break;
                case 4:
                    team2.add(new Spearman(getName()));
                    break;
                case 5:
                    team2.add(new Magician(getName()));
                    break;
                case 6:
                    team2.add(new Monk(getName()));
                    break;
            }
        }
        System.out.println("team1: ");
        team1.forEach(n-> System.out.println(n.getInfo()));
        System.out.println("team2: ");
        team2.forEach(n-> System.out.println(n.getInfo()));
    }
}
