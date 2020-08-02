package players;

import armory.Armory;
import armory.PlateArmour;

import java.util.ArrayList;

public class Knight extends MeleeCharacter {

    PlateArmour plateArmour;

    protected ArrayList<Armory> armory;

    public Knight(String name, int healthPoints, int treasureChest, PlateArmour plateArmour){
        super(name, healthPoints, treasureChest);
        this.armory = new ArrayList<Armory>();
        this.plateArmour = plateArmour;

    }

    public ArrayList<Armory> getArmory(){
        return this.armory;
    }

    @Override
    public void takeDamage(int damageValue) {
        if (healthPoints+plateArmour.getIncreaseHP() > damageValue) {
        int armouredHealth = this.healthPoints + plateArmour.getIncreaseHP();
        this.healthPoints = armouredHealth - damageValue;}
        else{
        this.healthPoints=0;}

    }
}
