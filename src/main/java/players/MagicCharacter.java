package players;

import actions.IAttack;
import armory.Armory;
import enemies.Enemy;
import spells.Spells;

import java.util.ArrayList;

public abstract class MagicCharacter extends Player implements IAttack {

    protected ArrayList<Spells> spells;

    public MagicCharacter(String name, int healthPoints, int treasureChest){
        super(name, healthPoints, treasureChest);
        this.spells = new ArrayList<Spells>();
    }

    public void addSpellToSpells(Spells spell){
        this.spells.add(spell);
    }

    public void attack(Spells spell, Enemy enemy){
        enemy.takeDamage(spell.getDamageToDeal());
    }

    public int countSpells(){
        return this.spells.size();
    }

    public ArrayList<Spells> getSpells(){
        return this.spells;
    }
}
