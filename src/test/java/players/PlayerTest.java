package players;

import org.junit.Before;
import org.junit.Test;
import rooms.TreasureRoom;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    MeleeCharacter meleeCharacter;
    BarbarianTest barbarian;
    TreasureRoom treasureRoom;

    @Before
    public void before(){
        player = new Barbarian("Conan", 500, 0);
        treasureRoom = new TreasureRoom(1.0, 100, 100);
    }

    @Test
    public void hasName(){
        assertEquals("Conan", player.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(500, player.getHealthPoints());
    }

    @Test
    public void hasTreasureChest(){
        assertEquals(0, player.getTreasureChest());
    }

    @Test
    public void canCollectTreasure(){
//        treasureRoom.setLight(1.0);
        player.collectTreasure(player, treasureRoom);
        assertEquals(200, player.getTreasureChest());
    }
}
