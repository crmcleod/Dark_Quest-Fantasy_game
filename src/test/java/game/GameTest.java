package game;

import armory.Pickaxe;
import armory.PlateArmour;
import armory.Sword;
import enemies.Enemy;
import enemies.Orc;
import org.junit.Before;
import org.junit.Test;
import players.Barbarian;
import players.Dwarf;
import players.Knight;
import rooms.EnemyRoom;
import rooms.Room;
import rooms.TreasureRoom;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class GameTest {

    Game game;
    EnemyRoom enemyRoom;
    TreasureRoom treasureRoom;
    Knight knight;
    Barbarian barbarian;
    Dwarf dwarf;
    Orc orc1;
    Orc orc2;
    Sword sword;
    PlateArmour plateArmour;
    Pickaxe pickaxe;

    @Before
    public void before(){

        enemyRoom = new EnemyRoom(0.5);
        treasureRoom = new TreasureRoom(0.5, 100, 100);
        plateArmour = new PlateArmour(50);
        game = new Game();
        sword = new Sword(100);
        pickaxe = new Pickaxe(50);
        knight = new Knight("Vimes", 100, 10, plateArmour);
        barbarian = new Barbarian("Conan", 200, 1);
        dwarf =  new Dwarf("Sergeant Cheery", 100, 100, pickaxe);
        orc1 = new Orc("Gadralk", 200);
        orc2 = new Orc("Agrablad", 1000);
    }

    @Test
    public void hasName(){
        assertEquals("Dark Quest", game.getName());
    }

    @Test
    public void gameHasWelcomeMessage(){
        assertEquals("Welcome to Dark Quest, if you have what it takes, let the journey begin!", game.welcomeToGame());
    }

    @Test
    public void canAddRooms(){
        game.addRoomToRooms(enemyRoom);
        assertEquals(1, game.gameRoomCount());
    }

    @Test
    public void canAddPlayableCharacters(){
        game.addPlayableCharactersToGame(knight);
        assertEquals(1, game.getPlayerCount());
    }

    @Test
    public void canPlayThrough2Rooms(){
        game.addRoomToRooms(enemyRoom);
        game.addRoomToRooms(treasureRoom);
        enemyRoom.addEnemyToRoom(orc1);
        enemyRoom.addEnemyToRoom(orc2);
        knight.attack(sword, orc1);
        barbarian.ripEnemiesHeadOff(orc2);
        knight.attack(sword, orc1);
        dwarf.usePickAxeToSmashDoor(pickaxe, enemyRoom);
        assertEquals(false, enemyRoom.checkExit());


    }
}
