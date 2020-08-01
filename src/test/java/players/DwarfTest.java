package players;

import armory.Pickaxe;
import org.junit.Before;
import org.junit.Test;

public class DwarfTest {

    Dwarf dwarf;
    Pickaxe pickaxe;

    @Before
    public void before(){
        pickaxe = new Pickaxe(25);
        dwarf = new Dwarf("Hardwon", 200, 2000, pickaxe);
    }

}
