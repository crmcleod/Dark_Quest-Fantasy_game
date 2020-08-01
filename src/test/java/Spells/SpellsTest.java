package Spells;

import org.junit.Before;
import org.junit.Test;
import spells.Dragon;
import spells.Spells;

import static org.junit.Assert.assertEquals;

public class SpellsTest {

    Dragon dragon;

    @Before
    public void before(){
        dragon = new Dragon(50);
    }
}
