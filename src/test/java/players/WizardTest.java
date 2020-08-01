package players;

import org.junit.Before;
import org.junit.Test;
import spells.Dragon;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Dragon  dragon;


    @Before
    public void before(){
        wizard = new Wizard("Rincewind", 100, 100);
        dragon = new Dragon(50);

    }
    @Test
    public void testDragonOffersProtection(){
        dragon.protect(wizard);
        assertEquals(150, wizard.healthPoints);
    }



    //Can't easily test randomly generated strings but have debugged to check functionality.
//    @Test
//    public void canImpersonateGandalf(){
//        assertEquals("Fly you fools!", wizard.impersonateGandalf());
//    }
}
