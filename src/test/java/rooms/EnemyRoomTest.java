package rooms;

import enemies.Enemy;
import enemies.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyRoomTest {

    EnemyRoom enemyRoom;
    Enemy orc;

    @Before
    public void before(){
        orc = new Orc("Kebub", 20);
        enemyRoom = new EnemyRoom(0.5);
    }

    @Test
    public void canAddEnemyToRoom(){
        enemyRoom.addEnemyToRoom(orc);
        assertEquals(1, enemyRoom.countEnemies());
    }

}
