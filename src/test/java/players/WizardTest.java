package players;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;

    @Before
    public void before(){
        wizard = new Wizard("Rincewind", 100, 100);

    }


    //Can't easily test randomly generated strings but have debugged to check functionality.
//    @Test
//    public void canImpersonateGandalf(){
//        assertEquals("Fly you fools!", wizard.impersonateGandalf());
//    }
}
