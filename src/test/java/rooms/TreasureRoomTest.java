package rooms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreasureRoomTest {

    TreasureRoom treasureRoom;

    @Before
    public void before(){
        treasureRoom = new TreasureRoom(0.5, 100,100);
    }

    @Test
    public void hasVisibleTreasure(){
        assertEquals(100, treasureRoom.allowToCollectVisibleTreasure());
    }

    @Test
    public void hasObscuredTreasure(){assertEquals(100, treasureRoom.allowToCollectObscuredTreasure()); }

    @Test
    public void canSetTreasure(){
        treasureRoom.setObscuredTreasure(0);
        treasureRoom.setVisibleTreasure(1);
        assertEquals(0, treasureRoom.allowToCollectObscuredTreasure());
        assertEquals(1, treasureRoom.allowToCollectVisibleTreasure());}


    @Test
    public void canGetLightLevel(){
        assertEquals(0.5, treasureRoom.getLightLevel(),0.1);
    }

    @Test
    public void canSetLight(){
        treasureRoom.setLight(2.0);
        assertEquals(2.0, treasureRoom.getLightLevel(),0.1);
    }

    @Test
    public void canCollectTreasureIfLight(){
        treasureRoom.setLight(1.0);
        assertEquals(200, treasureRoom.allowToCollectTreasure());
    }

    @Test
    public void cantCollectAllTreasureIfDark(){
        assertEquals(100, treasureRoom.allowToCollectTreasure());
    }

}
