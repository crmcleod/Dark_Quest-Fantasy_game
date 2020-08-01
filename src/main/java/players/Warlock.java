package players;

import rooms.Room;
import spells.Spells;

import players.MagicCharacter;
import spells.Spells;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Warlock extends MagicCharacter {

    protected ArrayList<Spells> spells;

    public Warlock(String name, int healthPoints, int treasureChest){
        super(name, healthPoints, treasureChest);
        this.spells = new ArrayList<Spells>();
    }


//    this should be being implemented through spell
    public void lightRoom(Room room){
        room.setLight(1.0);
    }

}
