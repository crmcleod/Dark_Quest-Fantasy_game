package enemies;

import actions.IAttack;
import armory.Armory;
import players.Player;

import java.util.ArrayList;

public abstract class Enemy {
    protected String name;
    protected int healthPoints;
    protected ArrayList<Armory> weapons;

    public  Enemy(String name, int healthPoints){
        this.name = name;
        this.healthPoints = healthPoints;
        this.weapons = new ArrayList<Armory>();
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int checkHealth(){
        return this.healthPoints;
    }

    public void takeDamage(int damageValue){
        this.healthPoints -= damageValue;
    }

    public void addWeapon(Armory weapon){
        this.weapons.add(weapon);
    }

    public int countWeapons(){
        return this.weapons.size();
    }

    public void attack(Armory item, Player player){
        player.takeDamage(item.getDamageToDeal());
    }
}
