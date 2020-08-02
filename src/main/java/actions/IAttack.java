package actions;

import armory.Armory;
import enemies.Enemy;
import players.MeleeCharacter;
import players.Player;
import spells.Spells;

public interface IAttack {

    void attack(Armory item, Enemy enemy);
    void attack(Spells spell, Enemy enemy);
//    void attack(int damageToDeal);

}
