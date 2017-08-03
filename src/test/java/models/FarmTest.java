package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class FarmTest {

    @Test
    public void newGame_instantiatesCorrectly_true() {
        Farm testFarm = new Farm();
        assertEquals(true, testFarm instanceof Farm);
    }

    @Test
    public void newGame_systemReturnsContent_false() {
        Farm testFarm = new Farm();
        String expected = "dog";
        assertEquals(expected, testFarm.newGame("dog"));
    }

    @Test
    public void gameOver_gameOverMessage_GameOverForPlayer() {
        Farm testFarm = new Farm();
        assertEquals(false, testFarm.gameOver());
    }
}