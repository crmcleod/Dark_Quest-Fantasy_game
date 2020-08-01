package players;

import spells.Spells;

import java.util.ArrayList;
import java.util.Random;

public class Wizard extends MagicCharacter{

    public Wizard(String name, int healthPoints, int treasureChest){
        super(name, healthPoints, treasureChest);
        this.spells = new ArrayList<Spells>();
    }

    public String impersonateGandalf(){
        String phrase1 = "Fly you fools!";
        String phrase2 = "THOU SHALT NOT PASS!";
        String phrase3 = "A wizard is never late [...]; he arrives precisely when he means to.";
        Random rand = new Random();
        int n = rand.nextInt(4);
        if (n == 1){
            return phrase1;}
        else if (n == 2){
            return  phrase2;}
        else return phrase3;
        }
}
