package game;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class GameTest {

    Game game;

    @Before
    public void before(){
        game = new Game();
    }

    @Test
    public void hasName(){
        assertEquals("Dark Quest", game.getName());
    }

    @Test
    public void gameHasWelcomeMessage(){
        assertEquals("Welcome to Dark Quest, if you have what it takes, let the journey begin!", game.welcomeToGame());
    }
}
