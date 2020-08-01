package players;

import actions.IAttack;
import armory.Armory;
import enemies.Enemy;
import rooms.TreasureRoom;
import spells.Spells;

public abstract class Player implements IAttack{

    protected String name;
    protected int healthPoints;
    protected int treasureChest;

    public Player(String name, int healthPoints, int treasureChest){
        this.name = name;
        this.healthPoints = healthPoints;
        this.treasureChest = treasureChest;
    }

    public String getName(){
        return this.name;
        }

    public int getHealthPoints() {
        return this.healthPoints;
    }

    public void addProtection(int protection){
        this.healthPoints += protection;
    }

    public int getTreasureChest(){
        return this.treasureChest;
    }

    public void takeDamage(int damageValue){
        this.healthPoints -= damageValue;
    }

    public void attack(Armory item, Enemy enemy){
        enemy.takeDamage(item.getDamageToDeal());
    }

    public void attack(Spells spell, Enemy enemy){
        enemy.takeDamage(spell.getDamageToDeal());
    }

    public void collectTreasure(Player player, TreasureRoom treasure){
        player.treasureChest += treasure.allowToCollectTreasure();
    }

}
