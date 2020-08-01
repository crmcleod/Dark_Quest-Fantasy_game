package players;

import armory.Pickaxe;
import enemies.Enemy;
import rooms.EnemyRoom;
import rooms.Room;

public class Dwarf extends MeleeCharacter{

    Pickaxe pickaxe;
    Room room;

    public Dwarf(String name, int healthPoints, int treasureChest, Pickaxe pickaxe){
        super(name, healthPoints, treasureChest);
        this.pickaxe = pickaxe;
    }

    public void usePickAxeToSmashDoor(Pickaxe pickaxe, EnemyRoom enemyRoom){
       if (enemyRoom.checkAllEnemiesDead() == true){
           enemyRoom.openExit();
       }

    }

}
