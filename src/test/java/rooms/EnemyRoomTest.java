package rooms;

import armory.Pickaxe;
import armory.PlateArmour;
import armory.Sword;
import enemies.Enemy;
import enemies.Orc;
import org.junit.Before;
import org.junit.Test;
import players.Dwarf;
import players.Knight;

import static org.junit.Assert.assertEquals;

public class EnemyRoomTest {

    EnemyRoom enemyRoom;
    Enemy orc;
    Dwarf dwarf;
    Pickaxe pickaxe;
    Knight knight;
    Sword sword;
    PlateArmour plateArmour;

    @Before
    public void before(){
        orc = new Orc("Kebub", 20);
        enemyRoom = new EnemyRoom(0.5);
        sword = new Sword(50);
        pickaxe = new Pickaxe(20);
        plateArmour = new PlateArmour(50);
        knight = new Knight("Alysses", 100, 100, plateArmour);
        dwarf = new Dwarf("Bagger", 200, 200, pickaxe);
    }

    @Test
    public void canAddEnemyToRoom(){
        enemyRoom.addEnemyToRoom(orc);
        assertEquals(1, enemyRoom.countEnemies());
    }
    @Test
    public void canGetEnemyByIndex(){
        enemyRoom.addEnemyToRoom(orc);
        assertEquals(orc, enemyRoom.getEnemyByIndex(0));
    }

    @Test
    public void roomStartsLocked(){
        assertEquals(true, enemyRoom.checkExit());
    }

    @Test
    public void roomExitCanBeUnlocked(){
        enemyRoom.openExit();
        assertEquals(false, enemyRoom.checkExit());
    }

    @Test
    public void roomCanBeUnlockedWithPickaxe(){
        enemyRoom.addEnemyToRoom(orc);
        knight.attack(sword, enemyRoom.getEnemyByIndex(0));
        dwarf.usePickAxeToSmashDoor(pickaxe, enemyRoom);
        assertEquals(false, enemyRoom.checkExit());
    }

    @Test
    public void roomCantBeUnlockedWhileEnemiesAlive(){
        enemyRoom.addEnemyToRoom(orc);
        dwarf.usePickAxeToSmashDoor(pickaxe, enemyRoom);
        assertEquals(true, enemyRoom.checkExit());
    }


//    Can't test random number of exits. Checked with debugger
//    @Test public void canGenerateRandomNumberOfExits(){
//        enemyRoom.generateRandomExits();
//        assertEquals(2, enemyRoom.getExitCount());
//    }
}
