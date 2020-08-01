package players;

import armory.Sword;
import enemies.Orc;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class BarbarianTest {

    Barbarian barbarian;
    Sword sword;
    Orc orc;

    @Before
    public void before(){
        barbarian = new Barbarian("Conan", 500, 0);
        sword = new Sword(10);
        orc = new Orc("Kebub", 20);

    }

    @Test
    public void hasName(){
        assertEquals("Conan", barbarian.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(500, barbarian.getHealthPoints());
    }

    @Test
    public void hasTreasureChest(){
        assertEquals(0, barbarian.getTreasureChest());
    }

    @Test
    public void hasItemsInArmory(){
        barbarian.addItemToArmory(sword);
        assertEquals(1, barbarian.countArmory());
    }

    @Test
    public void canAttack(){
        barbarian.attack(sword, orc);
        assertEquals(10, orc.checkHealth());
    }

    @Test
    public void canRipEnemiesHeadOff(){
        assertEquals("EARUGHHHH!!", barbarian.ripEnemiesHeadOff(orc));
        assertEquals(0, orc.checkHealth());
    }

}
