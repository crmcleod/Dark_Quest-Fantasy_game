package game;

import armory.Pickaxe;
import armory.PlateArmour;
import armory.Sword;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import enemies.Enemy;
import enemies.Orc;
import org.junit.Before;
import org.junit.Test;
import players.Barbarian;
import players.Dwarf;
import players.Knight;
import players.Warlock;
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
    Warlock warlock;
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
        warlock = new Warlock("Zachbran", 100,100);
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
    public void playersAreOnlyInFirstRoom(){
        game.addPlayableCharactersToGame(knight);
        game.addRoomToRooms(enemyRoom);
        game.addRoomToRooms(treasureRoom);
        game.attemptToMoveToNextRoom();
        assertEquals(1, enemyRoom.getPlayerCount());
        assertEquals(0, treasureRoom.getPlayerCount());
    }

    @Test
    public void playersMoveIntoNextRoom(){
        TreasureRoom treasureRoom1 = new TreasureRoom(0.5, 100, 100);
        game.addPlayableCharactersToGame(knight);
        game.addPlayableCharactersToGame(dwarf);
        game.addRoomToRooms(enemyRoom);
        game.addRoomToRooms(treasureRoom);
        game.addRoomToRooms(treasureRoom1);
        enemyRoom.addEnemyToRoom(orc1);
        game.attemptToMoveToNextRoom();
        knight.attack(sword, orc1);
        dwarf.attack(pickaxe, orc1);
        dwarf.attack(pickaxe, orc1);
        dwarf.usePickAxeToSmashDoor(pickaxe, enemyRoom);
        game.attemptToMoveToNextRoom();
        warlock.lightRoom(treasureRoom);
        knight.collectTreasure(knight, treasureRoom);
        game.attemptToMoveToNextRoom();
        assertEquals(2, enemyRoom.getPlayerCount());
        assertEquals(2, treasureRoom.getPlayerCount());
        assertEquals(2, treasureRoom1.getPlayerCount());
        assertEquals(true, treasureRoom1.checkExit());
    }

//    player can currently take money from any room in the game /////////
//    @Test
//    public void canPlayThrough2Rooms(){
//        game.addRoomToRooms(enemyRoom);
//        game.attemptToMoveToNextRoom();
//        knight.collectTreasure(knight, treasureRoom);
//        game.addRoomToRooms(treasureRoom);
//        enemyRoom.addEnemyToRoom(orc1);
//        enemyRoom.addEnemyToRoom(orc2);
//        knight.attack(sword, orc1);
//        barbarian.ripEnemiesHeadOff(orc2);
//        knight.attack(sword, orc1);
//        dwarf.usePickAxeToSmashDoor(pickaxe, enemyRoom);
////        game.movePCsToNextRoom();
//        assertEquals(110, knight.getTreasureChest());
//        assertEquals(false, enemyRoom.checkExit());
//        assertEquals(true, treasureRoom.checkExit());
//    }
}
